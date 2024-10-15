package currencyConverterProject;

public class currrencyconvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str ="abcdefghijklmnopqrsTuvwxyz";
		int hash[]=new int[26];
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			int val=(int)(str.charAt(i)-'a');
			hash[val]++;
		} 
		int count=0;
		for(int i=0;i<hash.length;i++) {
			if(hash[i]==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("not valid");
		}
		else {
			System.out.println("valid string");
		}

	}

}
