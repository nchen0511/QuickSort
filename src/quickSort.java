public class quickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot+1, right);
        }

    }

    public static int partition(int[] arr,int left, int right){
        int pivot = arr[right];
        int i=left-1;
        for(int j=left;j<right;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,right);
        return i+1;
    }

    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}