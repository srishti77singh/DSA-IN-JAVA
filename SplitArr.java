import java.util.Arrays;
public class SplitArr{
	public static void main(String[] args){
		int[] nums = {7,2,5,10,8}; 
		int k = 2;
		int res =splitArray(nums,k);
		System.out.println(res);
	}
	static int splitArray(int[] nums, int m)
	{
		int start =0;
		int end =0;
		for(int i =0;i<nums.length;i++){
			start = Math.max(start,nums[i]);
			end = end +nums[i];
		}
		while(start<end){
			int mid =start + (end - start)/2;
			//calculate how may pieces you can divide this in with this max sum
			int sum =0;
			int pieces = 1;
			for(int num:nums){
				if(sum+num>mid){
					//you cannot add this in subaarray ,make new one
					//say you add this sum in new subarray,then sum is num
					sum+=num;
					pieces++;
				}
				else{
					sum +=num;
				}
			}
			if(pieces>m){
				start = mid+1;
			}
			else{
				end = mid -1;
			}
		}
		return end;
	}
}
	/*
	static int splitArray(int[] nums, int k) {
		int sum =0;
		int [] array = sorting(nums);
		
		for(int i=array.length-1;i>(array.length-k);i--)
		{
			sum = sum	+array[i];
		}
		return sum;
    }
	static int[] sorting(int[] arr){
		for(int i =0;i<arr.length;i++){
			for(int j =i+1;j<arr.length;j++){
				
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	*/
