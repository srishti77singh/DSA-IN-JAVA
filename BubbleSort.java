import java.util.Arrays;
public class BubbleSort{
	public static void main(String[] args){
		int[] arr={3,4,2,5,1};
		int[] res =sort(arr);
		System.out.println(Arrays.toString(res));
	}
	static int[] sort(int[] arr){
		for(int i =0;i<arr.length;i++){
			for(int j =1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					//swapping
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		return arr;
	}
}
				