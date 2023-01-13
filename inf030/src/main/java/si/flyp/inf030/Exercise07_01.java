package si.flyp.inf030;

public class Exercise07_01 {

    public static void main(String[] args) {
        int[] a = { 23, 14, 53, 69, 42, 78, 44, 38, 39 };
        int[] b = { 22, 10, 15, 18, 35, 29, 30, 37, 23 };
        int[] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        quickSort(a);
        quickSort(b);
        quickSort(c);

        printArray("a", a);
        printArray("b", b);
        printArray("c", c);
    }

    public static void printArray(String name, int[] array) {
        System.out.print(name + ": [");
        for (int item : array) {
            System.err.print(" " + item + " ");
        }
        System.out.println("]");
    }

    public static void quickSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] values, int lowerIndex, int upperIndex) {
        if (upperIndex > lowerIndex) {
            int pivotValue = values[upperIndex];

            int i = lowerIndex;
            int j = upperIndex - 1;

            while(true) {
                while (i < upperIndex && values[i] <= pivotValue) {
                    i++;
                }
                while (j > i && values[j] >= pivotValue) {
                    j--;
                }

                if (i >= j) {
                    break;
                }

                swap(values, i, j);
            }
            swap(values, i, upperIndex);
            quickSort(values, lowerIndex, i - 1);
            quickSort(values, i + 1, upperIndex);
        }
    }

    private static void swap(int[] values, int sourceIndex, int destinationIndex) {
        int temp = values[sourceIndex];
        values[sourceIndex] = values[destinationIndex];
        values[destinationIndex] = temp;
    }
}