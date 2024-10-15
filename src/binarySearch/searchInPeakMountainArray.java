package binarySearch;

public class searchInPeakMountainArray {
	public static void main(String[] args) {
		int a[]= {0,5,3,1};
		int t=1;
		int peak=peaks(a);
		int try1=search(a,t,0,peak);
		System.out.println(try1);
		if(try1==-1) {
			int try2=search(a,t,peak+1,a.length-1);
			System.out.println(try2);
			if(try2==-1) {
				System.out.println("no value found");
			}
			else {
				System.out.println("value is at "+try2); 
			}
		}
		else {
			System.out.println("value is at "+try1);
			
		}
		
	}
	public static int search(int a[],int t,int s,int e) {
		while(s<e) {
			int mid=(s+e)/2;
			if(a[mid]==t) {
				return mid;
			}
			else if(a[mid]>t) {
				e=mid-1;
			}
			else if(a[mid]<t) {
				s=mid+1;
			}
		}
		return -1;
		
	}
	public static int peaks(int []a) {
		int s=0;
		int e=a.length-1;
		while(s<e) {
			 int mid=(s+e)/2;
			if(a[mid]>a[mid+1]) {
				e=mid;
			}
			if(a[mid]<a[mid+1]) {
				s=mid+1;
			}
		}
		return e;
	}

}
