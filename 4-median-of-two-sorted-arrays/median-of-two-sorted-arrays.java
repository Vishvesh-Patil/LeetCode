class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] merge = new int[nums1.length + nums2.length];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                merge[k++]= nums1[i++];
            }else{
                merge[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            merge[k++] = nums1[i++];
        }
        while(j < nums2.length){
            merge[k++] = nums2[j++];
        }

        if(merge.length % 2 !=0){
            int index = merge.length /2;
            return merge[index];
        }else{
            int index = (merge.length-1) / 2;
            return (double) (merge[index] + merge[index+1]) / 2;
        }
        
    }
}