package sortingAlgorithm;

public class bubbleSortApnaCollege {

	public static void main(String[] args) {
		int a[]= {7,8,3,1,2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
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
