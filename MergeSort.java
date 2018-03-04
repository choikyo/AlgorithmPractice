public class MergeSort {
    public int[] mergeSort(int[] array) {
        // Write your solution here
        if (array.length<=1) return array;
        int[] p = new int[array.length];
        mergeSort(array,p, 0, array.length-1);
        return array;

    }

    public  void mergeSort(int[] arr,int[] helper, int low,  int high){
        int mid =   low+(high-low)/2;

        if (low<high) {
            mergeSort(arr,helper, 0, mid);
            mergeSort(arr,helper, mid+1, high);

            merge(arr, helper,low, mid, high);

        }
          ;
    }

    public void merge(int[] arr, int[] p, int low, int mid, int high){

        //int[] p = new int[arr.length];
        for (int i=low; i<=high; i++){
            p[i] = arr [i];
        }


        int i = low;
        int j = mid+1;
        int k = low; // k 是新数组的INDEX指针


        while (i<=mid && j <=high) {
            if (p[i] <= p[j]) {
                arr[k++] = p[i++];

            }else{
                arr[k++] = p[j++];

            }

        }

        while (i<= mid){
            arr[k++] = p[i++];
        }

        /*while (j<=high){
            arr[k] = p[j];
            k++;
            j++;
        }*/
    }



    public static void main(String[] args){
        int[] nums = {34,2,6,8,23,55,7,9,0};
        MergeSort ms = new MergeSort();
        ms.mergeSort(nums);

        for (int i:nums){
            System.out.println(i+"-->");
        }

    }

}
