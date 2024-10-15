package RecursionConcepts;

public class smallProblemOnRECURSION {

	public static void main(String[] args) {
		//Sum Of All Digits of an Array
		int n=12345;
		sumofdigits(n,0);
		oddnumberformation(n,"");
		reverseanumber(n,0);
		}
	static void sumofdigits(int n,int sum) {
		if(n==0) {
			System.out.println(sum);
			return;
			
		}
		sum+=n%10;
		sumofdigits(n/10,sum);
	}
	static void oddnumberformation(int n,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		int rem=n%10;
		if(rem%2!=0) {
			str=str+rem;
		}
		oddnumberformation(n/10,str);
		
	}
	static void reverseanumber(int n,int rev) {
		if(n==0) {
			System.out.println(rev);
			return;
		}
		rev=rev*10+(n%10);
		reverseanumber(n/10,rev);
	}
	

}
