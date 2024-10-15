package binarySearch;

public class peakIndexOfArray {

	public static void main(String[] args) {
		int a[]= {0,5,3,1};
		int s=0;
		int e=a.length-1;
		int mid=0;
		while(s<e) {
			 mid=(s+e)/2;
			if(a[mid]>a[mid+1]) {
				e=mid;
			}
			if(a[mid]<a[mid+1]) {
				s=mid+1;
			}
		}
		System.out.println(a[e]);

	}

}
