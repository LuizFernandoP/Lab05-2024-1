package main.sorter;

public class QuickSorter implements Sorter {

    @Override
    public int[] sort(int[] values) {
        quickSort(values, 0, values.length - 1);
        return values;
    }

    public void quickSort(int[] values, int low, int high) {
        if (high <= low) return;
        int pivot = partition(values, low, high);
        quickSort(values, low, pivot - 1);
        quickSort(values, pivot + 1, high);
    }

    public int partition(int[] values, int low, int high) {
        int pivot = values[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (values[j] < pivot) {
                i++;
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }
        i++;
        int temp = values[i];
        values[i] = values[high];
        values[high] = temp;

        return i;
    }
}
