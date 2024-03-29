package wk.lear.algorithm.inlog;


//1、给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//你可以假设数组中无重复元素。
class 马力01 {

    public static void main(String[] args) {
        int [] nums={1,4,6,8,10};
        int result=searchInsert(nums,0);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int temp=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else{

                boolean isMix=(nums[i]>target&&target>temp)||(nums[i]<target&&target<target);
                if(isMix){
                    return i+1;
                }else{
                    temp=nums[i];
                }
            }
        }
        return 0;
    }
}


