package sortingAlgorithm;

public class missingPositiveNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,0 };
		int ans=cycle(a);
		System.out.println(ans);
	}
	 public static int cycle(int a[]) {
		int i=0;
		while(i<a.length) {
			int curr=a[i]-1;
			if(a[i]>0&&a[i]<=a.length&&a[curr]!=a[i]) {
				int temp=a[i];
				a[i]=a[curr];
				a[curr]=temp;
			}
			else { 
				i++;
			}
			
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]!=j+1) {
				return j+1;
			}
		}
		return a.length+1;
	}

}
