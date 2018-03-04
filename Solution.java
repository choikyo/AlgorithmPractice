class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1=0;
        double median ;

        int i = 0;
        int j = 0;
        //k is the larger number between two array max index
        int k =  nums1.length+nums2.length;
        int[] newnum = new int[k];
        System.out.println("k="+k);
        for (int n=0; n<k;n++){
            System.out.println("n="+n);
            if (i<=nums1.length-1 && j<=nums2.length-1) {

                if (nums1[i] <= nums2[j]) {
                    newnum[n] = nums1[i];
                    i++;
                } else  {
                    newnum[n] = nums2[j];
                    j++;
                }
            } else if (i<= nums1.length-1 && j>nums2.length-1) {
                System.out.println("nums1["+i+"] = "+nums1[i]);
                newnum[n] = nums1[i];
                i++;
            } else if (i> nums1.length-1 && j<=nums2.length-1){
                newnum[n] = nums2[j];
                j++;
            }
        }

        median =((k%2==1) ? (double)newnum[(k-1)/2]: (double) (newnum[(k-1)/2]+newnum[(k-1)/2+1])/2);

        return median;


    }

    public static void main (String[] args){
        Solution s = new Solution();
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(s.findMedianSortedArrays(nums1, nums2));




    }
}