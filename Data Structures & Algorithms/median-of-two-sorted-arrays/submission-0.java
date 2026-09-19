class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int a=0, b=0;
        int i=0;
        while(a < n && b < m){
            if(nums1[a] > nums2[b]){
                arr[i] = nums2[b];
                b++;
            } else{
                arr[i] = nums1[a];
                a++;
            }
            i++;
        }
        while(a <n){
            arr[i] = nums1[a];
            a++;
            i++;
        }
        while(b < m){
            arr[i] = nums2[b];
            b++;
            i++;
        }
        int left = 0;
        int right = m+n-1;
        if((m+n) % 2 != 0){
            return arr[(right - left)/2 + left]; 
        } else {
            int mid1 = (right-left)/2 + left;
            int mid2 = mid1+1;
            return (arr[mid1] + arr[mid2])/2.0;
        }
    }
}
