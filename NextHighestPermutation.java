class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int n = nums.length;
        int i=n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }

        // find next greatest digit to stop with breach digit
        if(i>=0){
            int j =n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
            
        }

        reverse(nums,i+1,n-1);
        
    }

    public void reverse(int[] nums, int l, int r){

        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }

    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}