import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class DSA448{
	public static void main(String[] args){
		
	int []  nums = {4,3,2,7,8,2,3,1};
	int[] res = sort(nums);
	System.out.println(Arrays.toString(res));
	}
	static List<Integer> sort(int[] arr){
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
		List<Integer> res = new ArrayList<>();
   
		for(i=0;i<arr.length;i++){
			if(arr[i]!=i+1){
				res.add(i+1);
			}
		}
		return res;
	}

	static void swap(int[] arr,int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}