//this is letter question where it is same as ceiling of a number;
public class Leet4{
	public static void main(String[] args){
		char[] letters = {'c','f','j','s'};
		char target = 'a';
		char ans = nextGreatestLetter(letters,target);
		System.out.println(ans);
	}
	static char nextGreatestLetter(char[] letters, char target) {

		int start = 0;
		int end = arr.length;
		while(start<=end){
			int mid = start+(end -start)/2;
			if(target<arr[mid]){
				end = mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return letters[start % letters.length];
	}
}