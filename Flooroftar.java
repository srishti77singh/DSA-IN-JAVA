public class Flooroftar{
	public static void main(String[] args){
		int[] arr = {2,4,7,9,14,16,19};
		int target =5 ;
		int ans = func(arr,target);
		System.out.println(ans);
	}
	static int func(int[] arr,int target){
		int start = 0;
		int end = arr.length;
		while(start<=end){
			int mid = start+(end -start)/2;
			if(target<arr[mid]){
				end = mid-1;
			}
			else if(target>arr[mid]){
				start=mid+1;
			}
			
			else{
				return end;
			}
			
		}
		return end;
	}
}