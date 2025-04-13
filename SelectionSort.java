package DesignPattens;

public class SelectionSort extends SortTemplate {
    @Override
    protected void sort(int[] nums) {
        for(int i =0; i<nums.length; i++){
            int minIdx = i;

            for(int j =i+1; j<nums.length; j++){
                if(nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }
            swap(nums , i, minIdx);
        }
    }
}
