package binarySearch2d;

public class spiralMatrix {

	public static void main(String[] args) {
		int n=3;
		int a[][]=new int[n][n];
		int newm[][]=spiral(a,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(newm[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static int[][] spiral(int a[][],int n) {
		int l=0,r=n-1,t=0,b=n-1;
		int num=1;
		for(int i=l;i<=r;i++) {
			a[t][i]=num;
			num++;
		}
		t++;
		for(int i=t;i<=b;i++) {
			a[i][r]=num;
			num++;
		}
		r--;
		for(int i=r;i<=l;i--) {
			a[b][i]=num;
			num++;
		}
		b++;
		for(int i=b;i<=t;i--) {
			a[i][l]=num;
			num++;
		}
		l--;
		
		return a;
		

	}
}
