import java.util.Arrays;
public class SelectionSort{
	public static void main(String[] args){
		int[] arr={3,4,2,5,1};
		int[] res = selection(arr);
		System.out.println(Arrays.toString(res));
	}
	static int getmaxIndex(int[] arr,int start,int last){
		int max = start;
		for(int i =start;i<=last;i++){
			if(arr[max]<arr[i]){
				max=i;
			}
		}
		return max;
	}
	static void swap(int[] arr,int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	static int[] selection(int[] arr){
		for(int i =0;i<arr.length;i++){
			int last = arr.length-i-1;
			int maxIndex= getmaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
		}
		return arr;
	}
}