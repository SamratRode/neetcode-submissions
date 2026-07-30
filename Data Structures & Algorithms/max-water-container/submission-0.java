class Solution {
    public int maxArea(int[] heights) {
        //area=min(height[l], height[r])*(r-l)
        //now figure out how to traverse r and l
        //keep min(heights), max, so eliminate smaller height
        int l=0;
        int r=heights.length-1;
        int area=0;
        int maxArea=0;
        while(l<r){
            area=(r-l)*Math.min(heights[r], heights[l]);
            maxArea=Math.max(maxArea, area);
            if(heights[l]<heights[r]){
                l++;
            }
            else if(heights[r]< heights[l]){
                r--;
            }
            else{
                l++;
                //l++ or r-- are equal in this case,
                //suppose r-1 is bigger, min(r-1,l) will still be l, and the width decreased by 1
                //so area can never increase in equal heights case
            }
        }
        return maxArea;
    }
}
