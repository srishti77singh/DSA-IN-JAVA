public class CeilingOFtarget{
	public static void main(String[] args){
		int[] arr = {2,3,4,5,9,14,16,19};
		int target = 5;
		int ans = func(arr,target);
		System.out.println(ans);
	}
	static int func(int[] arr,int target){
		if(target>letters[letters.length-1]){
			return -1;
		}
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
		return start;
	}
}