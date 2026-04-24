public class Leet1{
	public static void main(String[] args){
		int[] arr = {12,345,2,6,7896};
		System.out.println(findNumbers(arr));
	}
	static int findNumbers(int[] nums) {
        int res=0;
		for(int i =0;i<nums.length;i++){
			int count =0;
			while(nums[i]>0){
				nums[i]=nums[i]/10;
				count++;
			}
			if(count%2==0){
				res++;
			}
		}
		return res;
	}
}