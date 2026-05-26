public class Pattern{
	public static void main(String[] args){
		pattern6(6);
		
		  
	}
	static void pattern6(int n){
		for(int row=1;row<=n;row++){
			for(int space =0;space <n-row;space++){
				System.out.print(" ");
			}
			for(int col =row;col>=1;col--){
				System.out.print(col);
			}
			for(int col =2;col<=row;col++){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	static void pattern5(int n){
		for(int row=0;row<2*n;row++){
			int totalcolsInRow = row > n ? 2 * n -row : row;
			
			int noOfSpaces=n-totalcolsInRow ;
			for(int s=0;s<noOfSpaces;s++){
				System.out.print(" ");
			}
			
			for(int col=0;col<totalcolsInRow;col++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}	  
	static void pattern4(int n){
		for(int row=0;row<2*n;row++){
			int totalcolsInRow=row>n?2*n-row:row;
			for(int col=0;col<totalcolsInRow;col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
	static void pattern3(int n){
		for(int row =1;row<=n;row++){
			//for every row,run the col
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			//when one row is printed , we need to add a new line
			System.out.println("");
		}			
		for(int row=n-1;row>=1;row--){
			for(int col = row;col>=1;col--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void pattern1(int n){
		for(int row =1;row<=n;row++){
			//for every row,run the col
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			//when one row is printed , we need to add a new line
			System.out.println("");
		}
	}
	static void pattern2(int n){	
		for(int row=n;row>=1;row--){
			for(int col = row;col>=1;col--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}