package DesignPattens;

public class InsertionSort extends SortTemplate {
    @Override
    protected void sort(int[] nums) {
        for(int i =1; i< nums.length; i++){
            int key = nums[i];
            int j;
            for(j = i-1; j< nums.length; j++){
                if(nums[j+1] > key){
                    nums[j+1] = nums [j];
                }
                else break;
            }
            nums[j+1] = key;
        }
    }
}
