import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
public class Dice{
	public static void main(String[] args){
		ArrayList<String> ans = diceFaceRet("",4,5);
		System.out.println(ans);
	}
	static void dice(String p, int target){
		if(target == 0){
			System.out.println(p);
			return ;
		}
		for(int i = 1;i<=6 &&i<=target;i++){
			dice(p+i,target-i);
		}
	}
	static ArrayList<String> diceret(String p, int target){
		if(target == 0){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 1;i<=6 &&i<=target;i++){
			ans.addAll(diceret(p+i,target-i));
		}
		return ans;
	}
	static ArrayList<String> diceFaceRet(String p, int target,int face){
		if(target == 0){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 1;i<=6 &&i<=target;i++){
			ans.addAll(diceFaceRet(p+i,target-i,face));
		}
		return ans;
	}
}