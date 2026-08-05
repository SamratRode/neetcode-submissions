class Solution {
    public int search(int[] nums, int target) {
        int min = findMin(nums);
        if (nums[min] == target) {
            return min;
        }
        // interval 0 to min-1
        if (min>0 && target >= nums[0] && target <= nums[min - 1]) {
            return binarySearch(nums, 0, min-1, target);
        }

        // interval min+1 to high
        return binarySearch(nums, min+1, nums.length-1, target);
    }
    public int findMin(int[] nums) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public int binarySearch(int[] nums, int low, int high, int target) {
        int result=-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
