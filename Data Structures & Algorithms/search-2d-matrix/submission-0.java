class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_length=matrix.length;
        int column_length=matrix[0].length;
        int lo=0;
        int high=row_length-1;
        boolean result=false;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            if(matrix[mid][0]<=target && matrix[mid][column_length-1]>=target){
                //binary search column found
                int start=0;
                int end=column_length-1;
                while(start<=end){
                    int middle=start+(end-start)/2;
                    if(matrix[mid][middle]==target){
                        return true;
                    }
                    else if(matrix[mid][middle]>target){
                        end=middle-1;
                    }
                    else if(matrix[mid][middle]<target){
                        start=middle+1;
                    }
                }
                return false;
            }
            else if(matrix[mid][0]>target){
                high=mid-1;
            }
            else if(matrix[mid][column_length-1]<target){
                lo=mid+1;
            }
        }
        return result;
    }
}
