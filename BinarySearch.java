public class BinarySearch {
  public int binarySearch(int[] array, int target) {
        // Write your solution here.
        if (array == null || array.length==0 ) return -1;
        int low = 0;
        int high = array.length -1;
        int mid = low + (high-low)/2;

        while ( low <= high ){
            if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target) {
                high = mid-1;
            } else if (array[mid] == target) {
                return mid;
            }

            mid = low + (high-low)/2;

        }

        return -1;
    }
}