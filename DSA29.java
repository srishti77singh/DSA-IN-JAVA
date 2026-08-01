public class DSA29{
	public static void main(String[] args){
		int num=22;
		int  div=3;
		System.out.println(func(num,div));
	}
	static int func(int dividend,int divisor){
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;		   
		}
		if (dividend == divisor) {
            return 1;
        }
		boolean sign = true;
		if(dividend>=0 && divisor<0){
			sign = false;
		}
		if(dividend<0 && divisor>0){
			sign = false;
		}
		long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
		
		int ans =0;
		
		while(n>=d){
			int count =0;
			while(n>=(d<<(count+1))){
				count++;
			}
			ans +=(1<<count);
			n -= (d << count);
		
		}
//		if(ans>=Integer.MAX_VALUE && sign == true){
//			return Integer.MAX_VALUE;
//		}
//		if(ans>=Integer.MAX_VALUE && sign == false){
//			return Integer.MIN_VALUE;
//		}
//		if(sign == false){
//			ans = -ans;
//		}
//		else{
//			ans = ans;
		if(!sign){
			ans = -ans;
		}
		return ans;
	}		
		
	/*i
	static int func(int a,int b){
		boolean isNegativeA = a < 0;   
		boolean isNegativeB = b < 0; 
		a = Math.abs(a);  
		b = Math.abs(b);
		int count =0;
		if(b>a){
			return 0;
		}
		else{
			while(a >= b){
				a = a - b;
				count++;
			}
			
		}
		if (isNegativeA != isNegativeB) {
			count = -count;
		}
		else{
			count = count;
		}
		return count;
	}
	*/
	
}