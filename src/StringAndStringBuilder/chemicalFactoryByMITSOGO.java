package StringAndStringBuilder;
import java.util.*;

public class chemicalFactoryByMITSOGO {

	public static void main(String[] args) {
		int n=5;
		String a[]= {"hacker","int","niitnt","hackhackerer"};
		int op=0;
		for(int i=0;i<a.length;i++) {
			isthere(a[i],a,i);
		}
	}
	static boolean isthere(String a,String []arr,int k) {
		int hash[]=new int[26];
		for(int i=0;i<a.length();i++) {
			hash[a.charAt(i)-'a']++;
		}
		
		for(int i=0;i<arr.length;i++) {
			String curr=arr[i];
			if(curr.length()==2*a.length()) {
				int hash1[]=new int [26];
				
				 
			}
		}
		return true;
	}
}
