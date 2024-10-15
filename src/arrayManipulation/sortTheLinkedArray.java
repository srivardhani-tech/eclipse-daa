package arrayManipulation;

public class sortTheLinkedArray {

	public static void main(String[] args) {
		String names[]= {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
		int age[]= {17233,32521,14087,42738,46669,65662,43204,8224};
		for(int i=0;i<age.length-1;i++) {
			if(age[i]<age[i+1]) {
			String temp=names[i];
			names[i]=names[i+1];
			names[i+1]=temp;
			}
		}
		for(int i=0;i<age.length;i++) {
			System.out.println(names[i]);
		}

	}

}
