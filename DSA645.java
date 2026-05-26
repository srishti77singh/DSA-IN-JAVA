import java.util.Arrays;
public class DSA645{
	public static void main(String[] args){
		int[] arr = {1,1};
		int[] res = cycle(arr);
		System.out.println(Arrays.toString(res));
	}

	static int[] cycle(int[] arr){
		int i =0;
		while(i<arr.length){
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]){
				swap(arr,i,correct);
			}
			else{
				i++;
			}
		}
		for(int j=0;j<arr.length;j++){
			if(arr[j]!=j+1){
				return new int[]{arr[j],j+1};
			}
		}
		return new int[] {-1,-1};
	}

	static void swap(int[] arr,int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}