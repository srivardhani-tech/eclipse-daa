package Patterns;

public class diamondPaterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<2*n;i++) {
			int col=i>n?2*n-i:i;
			for(int s=0;s<(n-col);s++) {
				System.out.print(" "); 
			}
			for(int j=0;j<col;j++) {
				if(j==0||i==2*n-1||i==0||j==col-3) {
				System.out.print("* ");	
				}
			}
			System.out.println();
		}

	}

}
