package DesignPattens;


import java.util.Arrays;

public abstract class SortTemplate {

    void handle (int [] nums){
        sort(nums);
        show(nums);
    }

    private void show (int [] nums){
        System.out.println(Arrays.toString(nums));
    }
    public static void swap (int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    protected abstract void sort (int [] nums);

}
