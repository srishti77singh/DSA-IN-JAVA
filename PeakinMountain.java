//https://leetcode.com/problems/find-in-mountain-array/description/
public class PeakinMountain{
	public static void main(String[] args){
		int[] arr = {3,4,5,6,7,0,1,2};
		int target = 0;
		int res = search(arr,target);
		System.out.println(res);
	}
	static int peek(int[] nums)
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
	static int search(int[] arr,int target){
		int peak = peek(arr);
		int firstTry = func(arr,target,0,peak);
		if(firstTry!=-1){
			return firstTry;
		}
		//try to search in 2nd half
		return func(arr,target,peak+1,arr.length-1);
		
	}
	static int func(int[] arr,int target,	int start,int end ){

		//find wether the array is sorted in ascending or descending order
		boolean isAsc = arr[start]<arr[end];
		while(start<=end){
			int mid = start+(end -start)/2;
			if (arr[mid] == target) {
                return mid;
            }
			if(isAsc){
				if(target<arr[mid]){
					end = mid-1;
				}
				else{
					start = mid+1;
				}
			}
			else{
				if(target>arr[mid]){
					end =mid-1;
				}
				else{
					start = mid +1;
				}
			}
		}
		return -1;
	}
}