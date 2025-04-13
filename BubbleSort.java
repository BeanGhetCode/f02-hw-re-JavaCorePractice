package DesignPattens;

public class BubbleSort extends SortTemplate{
    @Override
    protected void sort(int[] nums) {
        for(int i =0; i<nums.length; i++){
            for(int j = 0; j< nums.length-i; j++)
            if(nums[j] > nums[j+1]){
                swap(nums, j, j+1);
            }
        }
    }
}
