//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;
public class Leet6{
	public static void main(String[] args){
		int[] nums = {5,7,7,8,8,10};
		int	target = 8;
		int[] ans =searchrange(nums,target);
		System.out.println(Arrays.toString(ans));
	
	}
	static int[] searchrange(int[] nums,int target){
		int[] ans={-1,-1};
		int start = search(nums,target,true);
		int end = search(nums,target,false);
		ans[0]=start;
		ans[1]=end;
		return ans;
	}
	static int search(int[] arr,int target,boolean findstartindex){
		int ans =-1;
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = start+(end -start)/2;
			if(target<arr[mid]){
				end = mid-1;
			}
			else if(target>arr[mid]){
				start=mid+1;
			}
			else{
				ans = mid;
				if(findstartindex==true){
					end = mid -1;
				}
				else{
					start = mid+1;
				}
			}
		}
		return ans;
	}
}