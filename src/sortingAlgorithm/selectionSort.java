package sortingAlgorithm;

public class selectionSort {

	public static void main(String[] args) {
		int a[]= {7,8,3,1,2};
		for(int i=0;i<a.length;i++) {
			int curr=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[curr]>a[j]) {
					curr=j;
				}
			}
			int temp=a[i];
			a[i]=a[curr];
			a[curr]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
