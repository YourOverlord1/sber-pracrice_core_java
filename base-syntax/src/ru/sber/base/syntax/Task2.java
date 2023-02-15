public class Task2 {
    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    static void swap(int[] arr, int low, int pivot) {
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }

    static int partition(int[] arr, int low, int high) {
        int p = low, j;
        for (j = low + 1; j <= high; j++)
            if (arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 10, 9, 5, 2, 7, 6, 3};
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}