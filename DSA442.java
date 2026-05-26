public class DSA442{
	public static void main(String[] args){
		int[] arr = {4,3,2,7,8,2,3,1};
		int res = cycle(arr);
		System.out.println(res);
	}

	static List<Integer> cycle(int[] arr){
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
				res.add(arr[i]);
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