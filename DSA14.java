
import java.util.Arrays;
public class DSA14{
	public static void main(String[] args){
		String[] strs = {"flower","flow","flight"};
		
		System.out.println(LongestCommonPrefix(strs));
	}
	static String LongestCommonPrefix(String[] str){
		
		StringBuilder result = new StringBuilder();
		
		//sorting of an array
		Arrays.sort(str);
		
		char[] first = str[0].toCharArray();
		char[] last = str[str.length-1].toCharArray();
		
		//start camparison
		for(int i =0;i<first.length;i++){
			if(first[i]!=last[i]){
				break;
			}
			result.append(first[i]);
		}
		return result.toString();
	}
}
	/*
	static String stringfunc(String[] str)
	{
		String ans = "";
		int min = str[0].length();
		for(int i =1;i<str.length();i++)
		{
			int temp = str[i].length();
			if(temp<min)
			{
				min = temp;
			}
		}
		
		for(int i =0;i<min;i++){
			
			String store="";
			char ch = str.charAt[i];
			for(int j =0;j<str.length();j++){
				if(str[j].charAt[i].equals(ch)){
					store += ch;
				}
			}
		}
		return store;
					
	}
		*/
