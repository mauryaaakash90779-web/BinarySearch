/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = Peak(mountainArr);
        int left = SearchLeft(mountainArr, target,peak);
        
        if(left!=-1){
            return left;
        }
        return SearchRight(mountainArr, target,peak);
    }
    int Peak(MountainArray mountainArr){
        int low = 0;
        int high = mountainArr.length()-1;
        int mid;
        while(low<=high){
            mid = low+ (high-low)/2;
            
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
           
        }
        return low;
    }
        
        int SearchLeft(MountainArray mountainArr, int target, int peak){

            int low = 0;
            int high = peak;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(mountainArr.get(mid)==target){
                    return mid;
                }
                if(mountainArr.get(mid)>target){
                    high = mid-1;
                }
                else{
                    low = mid+ 1;
                }
            }
            return -1;
        }
        int SearchRight(MountainArray mountainArr, int target , int peak){

            int low = peak+1;
            int high = mountainArr.length()-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(mountainArr.get(mid)==target){
                    return mid;
                }
                if(mountainArr.get(mid)>target){
                    low = mid+1;
                }
                else{
                    high = mid - 1;
                }
            }
            return -1;
        }
        
    
}