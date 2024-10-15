package Patterns;

public class HighEndPatterns {

	public static void main(String[] args) {
		//*
		//**
		//***
		//**
		//*
		//pattern1
		System.out.println("pattern1 :");
		int n=5;
		for(int i=0;i<2*n;i++) {
			int col=i>n ? ((2*n)-i):i;
			for(int j=0;j<col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("pattern2 :");
		for(int i=0;i<2*n;i++) {
			int col=i>n ? ((2*n)-i):i;
			int space=n-col;
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<col;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("pattern3 :");
		for(int i=0;i<2*n;i++) {
			int col=i>n ? ((2*n)-i):i;
			int space=n-col;
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<col;j++) {
				if(i==0||j==col-1) {
				System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
