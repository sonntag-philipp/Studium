package si.flyp.inf030;

public class Exercise07_02 {

    public static void main(String[] args) {
        int[] a = { 23, 14, 53, 69, 42, 78, 44, 38, 39 };
        int[] b = { 22, 10, 15, 18, 35, 29, 30, 37, 23 };
        int[] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        printArray("a", mergeSort(a));
        printArray("b", mergeSort(b));
        printArray("c", mergeSort(c));
    }

    public static void printArray(String name, int[] array) {
        System.out.print(name + ": [");
        for (int item : array) {
            System.out.print(" " + item + " ");
        }
        System.out.println("]");
    }

    public static int[] mergeSort(int[] values) {
        if (values.length <= 1) {
            return values;
        }

        int center = values.length / 2;
        int[] left = new int[center];
        int[] right = new int[values.length - center];

        // Linke und rechte Seiten werden aufgeteilt.
        for (int i = 0; i < center; i++) {
            left[i] = values[i];
        }
        
        for (int i = center; i < values.length; i++) {
            right[i - center] = values[i];
        }

        // Das Gleiche wird wieder für die einzelnen Seiten wiederholt bis nur noch einzelne Elemente übrig sind.
        left = mergeSort(left);
        right = mergeSort(right);

        // Erst hier wird wirklich sortiert. Vorher wird nur aufgeteilt.
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        // right und left sind bereits sortiert.
        while (leftIndex < left.length && rightIndex < right.length) {

            // Wenn links kleiner ist als rechts, dann wird links als erstes in das Ergebnis geschrieben.
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else { // Wenn links größer ist als rechts, dann wird rechts als erstes in das Ergebnis geschrieben.
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        // Wenn eine der Seiten noch Elemente enthält, dann werden diese in das Ergebnis geschrieben.

        // Hier werden alle Elemente von links in das Ergebnis geschrieben.
        while (leftIndex < left.length) {
            result[resultIndex] = left[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        // Hier werden alle Elemente von rechts in das Ergebnis geschrieben.
        while (rightIndex < right.length) {
            result[resultIndex] = right[rightIndex];
            rightIndex++;
            resultIndex++;
        }

        return result;
    }
}

