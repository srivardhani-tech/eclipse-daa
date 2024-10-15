package binarySearch;

public class positionOfAnTargetInAInfiniteArray {
	public static void main(String[] args) {
		int a[]= {12,14,15,16,17,18,1,9,19,100,122,1331,44,1551,771,88,4,99,5,7,4445,242424343,675645342,7867453,535454};
		int target=1;
		int s=0;
		int e=1;
		while(target>a[e]) {
		int tem=e;
		e=e+(e-s+1)*2;
		s=tem;
		}	
		int val=values(a,target,s,e);
		System.out.println(val);
	}
	static int values(int []a,int target,int s,int e) {
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[mid]==target) {
				return mid;
			}
			else if(a[mid]>target) {
				e=mid-1;
			}
			else if(a[mid]<target) {
				s=mid+1;
			}
		}
		return -1;
		
	}
	
}
