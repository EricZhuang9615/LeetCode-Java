package Arrays;

public class FindMin {
    public int findMin(int[] nums) {
        // binary search
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid + 1] || nums[mid] < nums[mid - 1]){
                return nums[mid];
            }

            if(nums[mid] > nums[0]){
                left = mid + 1;
            }else if(nums[mid] < nums[0]){
                right = mid - 1;
            }
        }
        return  0;
    }
}
