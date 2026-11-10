class Solution {
    public int search(int[] nums, int target) {
        int pivot = SearchPivot(nums);
        int fh = Firsthalf(nums ,pivot,target);
        if(fh!=-1){
            return fh;
        }
        return Secondhalf(nums,pivot,target);
    }
    int SearchPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
           int mid = start+(end-start)/2;
            if(mid < nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;

            }
            else{
                if(nums[mid]>=nums[0]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;

    }
    int Firsthalf(int[] nums ,int pivot,int target){
        int start =0;
        int end = pivot;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    int Secondhalf(int[] nums ,int pivot,int target){
        int start = pivot+1;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}