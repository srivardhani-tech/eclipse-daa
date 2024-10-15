package binarySearch;

public class simpleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,5,10,19,18};
		int target=5;
		int start=0;
		int fact=0;
		int end=a.length-1;
		for(int i=start;i<=end;i++) {
			int middle=(start+end)/2;
			if(a[middle]==target) {
				fact=1;
				System.out.println("found at "+middle);
				break;
			}
			else if(a[middle]>target) {
				start=middle+1;
			}
			else if(a[middle]<target) {
				end=middle-1;
			}
		}
		if(fact==0) {
			System.out.println("-1");
			 
		}
		

	}

}
