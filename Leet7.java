//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Leet7{
	public static void main(String[] args){
		int[] arr = {0,10,5,2};
		int value = peek(arr);
		System.out.println(value);
	}
	static int peek(int[] arr)
	{
       	int start =0;
	    int end = nums.length-1;
		while(start<end){
			int mid =start +(end-start)/2;
			if(nums[mid]>nums[mid+1]){
				end = mid;
			}
			else{
				start = mid+1;
			}
		}
		return end;
    }
}
