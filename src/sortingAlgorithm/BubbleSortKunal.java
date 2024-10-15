package sortingAlgorithm;

public class BubbleSortKunal {

	public static void main(String[] args) {
		int a[]= {7,8,3,1,2};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		//Print the sorted array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
