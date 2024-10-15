package sortingAlgorithm;

public class cyclicSorting {

	public static void main(String[] args) {
		int a[]= {4,3,5,3,1};
		int i=0;
		while(i<a.length) {
			int curr=a[i]-1;
			if(a[i]!=a[curr]) {
				int temp=a[i];
				a[i]=a[curr];
				a[curr]=temp;
			}
			else {
				i++;
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}

	}

}
