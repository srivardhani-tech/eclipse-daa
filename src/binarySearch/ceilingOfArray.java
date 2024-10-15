package binarySearch;

public class ceilingOfArray {
	public static void main(String args[]) {
		int a[]= {2,3,5,9,14,16,18};
		int target=4;
		int s=0;
		int e=a.length-1;
		while(s<=e) {
			int mid=(s+((e-s)/2));
			if(a[mid]==target) {
				System.out.println( mid);
				break;
			}
			else if(a[mid]>target) {
				e=mid-1;
			}
			else if(a[mid]<target) {
				s=mid+1;
			}
		}
		if(s>e) {
			System.out.println(a[s]);
		}
	}

}
