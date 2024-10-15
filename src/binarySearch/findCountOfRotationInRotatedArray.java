package binarySearch;
import java.util.*;

public class findCountOfRotationInRotatedArray {
	public static void main(String[]args) {
		int a[]= {15,18,2,3,6,12};
		int pivot1=pivot(a,0,a.length-1);
		System.out.println(pivot1);
		
	}
	public static int pivot(int []a,int s,int e) {
		while(s<e) {
			int mid=(s+e)/2;       
			if(a[mid]>a[s]) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		
		return e;
	}
}
