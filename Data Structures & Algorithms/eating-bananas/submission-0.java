class Solution {
    public boolean isValid(int[] arr,int mid, int h){
        int sum = 0;
        for(int num:arr){
            sum +=(num+mid-1)/mid;
        }
        if(sum <=h){ 
            return true;
            } else{ 
                return false;
            }
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int n = piles.length;
        int right = piles[n-1];
        while(left < right){
            int mid = (right-left)/2 + left;
            if(!isValid(piles,mid,h)){
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
        
    }
}
