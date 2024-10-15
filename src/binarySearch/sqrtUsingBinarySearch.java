package binarySearch;

public class sqrtUsingBinarySearch {

	public static void main(String[] args) {
		int x=8;
		int s=0;
		int e=x;
		int ans=0;
		while(s<=e){
            int mid=(s+e)/2;
            if((mid*mid)==x){
                ans=mid;
            }
            if((mid*mid)>x){
                e=mid-1;
            }
            if((mid*mid)<x){
                ans=mid;
                s=mid+1;
            }
        }
		System.out.println(ans); 
		

	}

}
