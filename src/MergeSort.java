class MergeSort {

    public static void mergeSort(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] data = new int[size1 + size2];

        while (i < size1 || j < size2) {
            if (i == size1) {
                // arr1병합완료
                while (j < size2) {
                    data[k++] = arr2[j++];
                }
            } else if (j == size2) {
                // arr2병합완료
                while (i < size1) {
                    data[k++] = arr1[i++];
                }
            } else if (arr1[i] <= arr2[j]) {
                data[k++] = arr1[i++];
            } else {
                data[k++] = arr2[j++];
            }
        }
        print(data);
    }

    public static void print(int[] data) {
        System.out.println("==============================");
        for (int value : data) {
            System.out.println("[" + value + "]");
        }
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5, 7, 9, 11 };
        int[] array2 = { 2, 4, 8, 10, 12, 14, 16, 18 };

        mergeSort(array1, array2);
    }
}