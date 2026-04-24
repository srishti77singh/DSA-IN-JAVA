public class Leet2{
	public static void main(String[] args){
		
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
	
		double ans = findMedianSortedArrays(nums1,nums2);
		System.out.println(ans);
	}
	/*
	static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum1=0;
		int sum2=0;
		for(int i =0;i<nums1.length;i++){
			sum1=sum1+nums1[i];
		}
		for(int i =0;i<nums2.length;i++){
	
			sum2=sum2+nums2[i];
		}		
	
		return res;
    }
*/
	static double findMedianSortedArrays(int[] nums1, int[] nums2){
		int[] merge=new int[nums1.length+nums2.length];
		for(int i =0;i<nums1.length;i++){
			merge[i]=nums1[i];
		}
		for(int i =0;i<nums2.length;i++){
			merge[i+nums1.length]=nums2[i];
		}
		for(int i =0;i<merge.length;i++){
			for(int j =i+1;j<merge.length;j++){
				if(merge[i]>merge[j]){
					int temp = merge[i];
					merge[i]=merge[j];
					merge[j]=temp;
				}
			}
		}
		int n = merge.length;
		if (n % 2 == 0) {
			return (merge[n/2 - 1] + merge[n/2]) / 2.0;
		} else {
			return merge[n/2];
		}
	}
}