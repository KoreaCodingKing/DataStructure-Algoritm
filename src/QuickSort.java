class QuickSort {
    public static void swap(int data[], int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void quickSort(int data[], int start, int end) {
        // 재귀 호출에 대한 종료 조건
        if (start >= end) {
            return;
        }

        int pivot = (int)(Math.random() * (end - start)) + start;
        int i = start;
        int j = end - 1;
        boolean movingI = true;
        swap(data, pivot, j);

        while (i < j) {
            if (data[i] > data[j]) {
                swap(data, i, j);
                movingI = !movingI;
            }

            if (movingI) {
                i++;
            } else {
                j--;
            }
        }
        quickSort(data, start, i);
        quickSort(data, i + 1, end);
    }

    public static void print(int[] data) {
        System.out.println("==============================");
        for (int value : data) {
            System.out.println("[" + value + "]");
        }
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        int[] data = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        quickSort(data, 0, data.length);
        print(data);
    }
}
