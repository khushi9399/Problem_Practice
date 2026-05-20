//Leetcode Problem of Container with most water
class Solution {
  public static void main(String args[]){
    int height[] = {1,8,6,2,5,4,8,3,7};
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while(left<right){
       int width = right-left;
       int min = 0;

       if(height[left]<height[right]){
        min = height[left];
       }
       else{
        min = height[right];
       }
       int area = width*min;

        if(area>maxArea){
            maxArea = area;
        }
        if(height[left] < height[right])
            left = left+1;
        else
            right = right-1;
    }
    System.out.println(maxArea);
  }
}