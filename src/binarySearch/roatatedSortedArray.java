package binarySearch;

public class roatatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,0,1};
		int pi=pivot(a);
		System.out.println(pi);
}
	static int pivot(int a[]) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=((start+end)/2);
			if(a[mid]>a[mid+1]) {
				return mid;
				}
			if(a[mid]<a[mid]-1) {
				return mid;
			}
			else if(a[mid]>=start) {
				end=mid-1;
			}
			else if(a[mid]<=start) {
				start=mid+1;
			}
		}
		return 0;

	}

}