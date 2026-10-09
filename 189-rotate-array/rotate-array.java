class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int arr[] = new int[n];
        int p = n-k;
        for(int i = p ; i<nums.length;i++)
        {
            arr[i-p] = nums[i];
        }
        for(int i = 0 ; i<p ; i++)
        {
            arr[k+i] = nums[i];
        }
        for(int i = 0 ;i<n;i++)
        {
            nums[i] = arr[i];
        }
    }
}