package Ex8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbersForBubbleSort = new int[]{8, 2, 9, 12, 3, 22};
        System.out.println("Before bubble sort: " + Arrays.toString(numbersForBubbleSort));
        sortIntArray(numbersForBubbleSort, new BubbleSort());
        System.out.println("After bubble sort: " + Arrays.toString(numbersForBubbleSort));

        int[] numbersForQuickSort = new int[]{5, 33, 98, 24, 882, 38};
        System.out.println("Before quick sort: " + Arrays.toString(numbersForQuickSort));
        sortIntArray(numbersForQuickSort, new QuickSort());
        System.out.println("After quick sort: " + Arrays.toString(numbersForQuickSort));
    }

    public static void sortIntArray(int[] array, Sortable sortable) {
        sortable.sort(array);
    }
}
