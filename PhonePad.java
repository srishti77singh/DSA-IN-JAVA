import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
public class PhonePad{
	public static void main(String[] args){
		ArrayList<String> ans = question("23");
	
		System.out.println( ans);
	
	
	}
	static void pad(String p, String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		int digit = up.charAt(0)-'0';
		for(int i =(digit-1)*3;i<digit*3;i++){
			char ch = (char)('a'+i);
			pad(p+ch,up.substring(1));
		}
		
	}
	static int padcount(String p, String up){
		if(up.isEmpty()){
			
			return 1;
 		}
		int count =0;
		int digit = up.charAt(0)-'0';
		for(int i =(digit-1)*3;i<digit*3;i++){
			char ch = (char)('a'+i);
			count = count + padcount(p+ch,up.substring(1));
		}
		return count;
	}	
	
	static ArrayList<String>  padret(String p, String up){
		if(up.isEmpty()){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit = up.charAt(0)-'0';
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i =(digit-1)*3;i<digit*3;i++){
			char ch = (char)('a'+i);
			
			list.addAll(padret(p+ch,up.substring(1)));
		}
		return list;
		
	}

	
	static ArrayList<String>  question(String up){
		String p = "";
		if(up.isEmpty()){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit = up.charAt(0)-'0';
		
		ArrayList<String> list = new ArrayList<>();
		if(digit==1){
			return 0;
		}
		if(digit<=6){
			
			for(int i =(digit-1)*3;i<digit*3;i++){
				char ch = (char)('a'+i);
				
				list.addAll(question(p+ch,up.substring(1)));
			}
		}
		else{
			for(int i =(digit-1)*4;i<digit*4;i++){
				char ch = (char)('a'+i);
				
				list.addAll(question(p+ch,up.substring(1)));
			}
		}
			
		return list;
		
	}
}
