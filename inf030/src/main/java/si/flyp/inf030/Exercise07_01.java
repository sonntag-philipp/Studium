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
        // Abbruchbedingung der Rekursion. Wenn der Index der unteren Grenze größer als der
        // Index der oberen Grenze ist, dann ist die Liste sortiert.
        if (upperIndex < lowerIndex) {
            return;
        }

        int pivotValue = values[upperIndex];

        int i = lowerIndex;
        int j = upperIndex - 1;

        // Swapping eines Durchgangs. Linke und rechte Seite neben Pivot werden durchlaufen
        while(true) {

            // So lange hochzählen bis auf der linken Seite ein Element gefunden wurde, welches größer als das Pivot Element ist.
            while (i < upperIndex && values[i] <= pivotValue) {
                i++;
            }

            // So lange runterzählen bis auf der rechten Seite ein Element gefunden wurde, welches kleiner als das Pivot Element ist.
            while (j > i && values[j] >= pivotValue) {
                j--;
            }

            // Bricht die Einordnung der Seiten ab, wenn i und j sich überkreuzt haben.
            if (i >= j) {
                break;
            }

            // Wenn links ein größeres und rechts ein kleineres Element gefunden wurden, tausche diese aus.
            swap(values, i, j);
        }

        // Nimm das letzte Element und packe es an die richtige Stelle. Also Verschiebung des zu Anfang ausgewählten Pivot Elements an 
        // die richtige Stelle, damit alle Werte links kleiner und die rechte Seite größer ist.
        swap(values, i, upperIndex);

        // Rekursiver Aufruf für die linke und rechte Seite neben dem verschobenen Pivot Element.
        quickSort(values, lowerIndex, i - 1);
        quickSort(values, i + 1, upperIndex);
    }

    /**
     * Tauscht zwei Elemente in einem Array aus.
     * Kann man auch als Verschieben von 2 Elementen in einem Array verstehen.
     */
    private static void swap(int[] values, int sourceIndex, int destinationIndex) {
        int temp = values[sourceIndex];
        values[sourceIndex] = values[destinationIndex];
        values[destinationIndex] = temp;
    }
}