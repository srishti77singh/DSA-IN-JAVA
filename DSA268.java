import java.util.Arrays;
public class DSA268{
	public static void main(String[] args){
		int[] arr={3,0,1};
		int res = sort(arr);
		System.out.println(res);
	}
	static void swap(int[] arr,int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	static int sort(int[] arr){
		int i =0;
		while(i<arr.length){
			int correct=arr[i];
			if( arr[i]<arr.length && arr[i]!=arr[correct]){
				swap(arr,i,correct);
			}
			else{
				i++;
			}
		}
		for(i=0;i<arr.length;i++){
			if(arr[i]!=i){
				return i;
			}
		}
		return arr.length;
	}
}