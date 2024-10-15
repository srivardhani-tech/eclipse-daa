package StringAndStringBuilder;

public class SteppingStone {

	public static void main(String[] args) {
		int n=101;
		while(n!=0) {
			int num=n%10;
			int num2=n%100;
			if(num2!=0) {
			if(num-num2==1||num-num2==-1) {
				n=n/10;				
			}
			}
			else {
				System.out.println("not a stepping stone");
				break;
			}
		}
		if(n==0) {
			System.out.println("it is");
		}
	}

}
