package binarySearch;

public class simpleEncoder {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length-1;i++) {
			int temp=a[i];
			a[i]=temp+a[i+1];
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
