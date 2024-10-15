package arrayManipulation;

import java.util.*;

public class removeDuplicateWithoutChangingItsoriginalOrdeer {
	public static void main(String[] args) {
		int a[]= {0,0,1,1,1,2,2,3,3,4};
		int s=1;
		int count=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[s-1]) {
				a[s]=a[i];
				count++;
			
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
