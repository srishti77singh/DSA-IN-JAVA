//1672. Richest Customer Wealth(the leetcode question
public class Leet3{
	public static void main(String[] args){
	int[][] acc = {
				{1,2,3},
				{3,2,1}
		};
		int max = maximumWealth(acc);
		System.out.println(max);
	}
    static int maximumWealth(int[][] accounts) {
		//person = row
		//account = column
		int ans = Integer.MIN_VALUE;
		for(int person =0;person<accounts.length;person++){
			int sum =0;
			for(int account=0;account<accounts[person].length;account++){
				sum = sum+accounts[person][account];
			}
			if(sum>ans){
				ans=sum;
			}
		}
		return ans;
			
    }
}