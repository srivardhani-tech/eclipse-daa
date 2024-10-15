package binarySearch;

public class firstAndLastOccurence {

	public static void main(String[] args) {
	
		int []a= {5,7,7,8,8,10};
		int target=8;
		int start=bin(target,a,true);
		int end=bin(target,a,false);
		int []ans= {start,end};
		System.out.println(ans[0]+" "+ans[1]);
	}
	static int bin(int target,int a[],Boolean val) {
		int s=0;
		int idx=0;
		int e=a.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[mid]==target) {
				idx=mid;
				if(val==true) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}
			if(a[mid]>target) {
				e=mid-1;
			}
			if(a[mid]<target) {
				s=mid+1;
			}
		}
		return idx;
		
	}
	
}
