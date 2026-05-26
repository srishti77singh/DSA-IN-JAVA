public class DSA41{
	public static void main(String[] args){
		int[] arr={3,-1,4,1};
		int res = sort(arr);
		System.out.println(res);
	}
	static int sort(int[] arr){
		int i =0;
		while(i<arr.length){
			int correct=arr[i];
			if( arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
				swap(arr,i,correct);
			}
			else{
				i++;
			}
		}
		for(int index=0;index<arr.length;index++){
			if(arr[index]!=index){
				return index+1;
			}
		}
		return arr.length+1;
	}
	static void swap(int[] arr,int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}