package binarySearch2d;

public class searchUsingBS {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{15,25,35},{28,29,37}};
		int target=37;
		int i=0;
		int j=a.length-1;
		while(i<=a.length-1&&j>=0) {
			if(a[i][j]==target) {
				System.out.println("target found at a["+i+""+j+"]");
			}
			if(a[i][j]>target) {
				i++;
			}
			else{
				j--;
			}
			
		}
		if(i>a.length&&j==-1) {
			System.out.println("not found");
		}
	
		

	}

}
