public class Orderognisticbs{
	public static void main(String[] args){
		
	}
	
	static int func(int[] array,int target){
		int start = 0;
		int end = array.length-1;
		//find wether the array is sorted in ascending or descending order
		boolean isAsc = arr[start]<arr[end];
		while(start<=end){
			int mid = start+(end -start)/2;
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