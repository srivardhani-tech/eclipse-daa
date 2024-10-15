package binarySearch;
import java.util.*;
public class practiceSheet {

	public static void main(String[] args) {
		String str="bcadeh";
		String str2="hea";
		String after="";
		after=after+aftermath(str,str2);
		int count=str.length()-after.length();
		int hash1[]=new int[26];
		int hash2[]=new int[26];
		for(int i=0;i<str.length();i++) {
			hash1[str.charAt(i)-'a']++;
		}
		for(int i=0;i<str2.length();i++) {
			hash2[str2.charAt(i)-'a']++;
		}
		for(int i=0;i<hash1.length;i++) {
			if(hash1[i]!=hash2[i]) {
				int val=hash1[i]-hash2[i];
				if(val<0) {
					val=-(val);
					count=count+val;
				}
			}			
		}
		System.out.println(count);
	}
	static String aftermath(String str,String str2) {
		String ans="";
		int idx=0;
		for(int i=0;i<str.length();i++) {
			int flag=0;
			char curr=str.charAt(i);
			for(int j=0;j<str2.length();j++) {
				if(str2.charAt(j)==curr) {
					flag=1;
				}
				if(flag!=1) {
					idx=i;
				}
			}
		}
		for(int k=idx;k<str.length();k++) {
			ans=ans+str.charAt(k);	
		}
		return ans;
		
	}

}
