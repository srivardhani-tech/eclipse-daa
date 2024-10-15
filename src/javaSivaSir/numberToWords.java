package javaSivaSir;
import java.util.*;
public class numberToWords {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String num = src.next();
		String number="";
		for(int i=num.length()-1;i>=0;i--){
			number+=num.charAt(i);
		}
		int lengths=number.length();
		String one="one",two="two",three="three",four="four",five="five",six="six",seven="seven",eight="eight",nine="nine";
		String ans="";
		int len=lengths-1;
		while(len>=0) {
				char curr=number.charAt(len);
				if(curr=='1') {
					ans+=(one);
				}
				if(curr=='2') {
					ans+=(two);
				}
				if(curr=='3') {
					ans+=(three);
				}
				if(curr=='4') {
					ans+=four;
				}
				if(curr=='5') {
					ans+=five;
				}
				if(curr=='6') {
					ans+=six;
				}
				if(curr=='7') {
					ans+=seven;
				}
				if(curr=='8') {
					ans+=eight;
				}
				if(curr=='9') {
					ans+=nine;
				}
				if(len==3) {
					ans+=" thousand ";
				}
				if(len==2) {
					ans+=" hundred ";
				}
				if(len==1) {
					if(curr!='1'){
					ans+="ty ";
					}
				}
				len--;
		}
		
		System.out.println(ans);
	}

}
