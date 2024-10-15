
public class methodsInStrings {
	public static void main(String[] args) {
		
		//replace method
		String a="hello vardhu";
		String b=a.replace("vardhu", "suva");
		System.out.println(b);
		//equals ignore-case
		String ig="Vardhu";
		String hg="vardhu";
		if(ig.equalsIgnoreCase(hg)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
			
		}
		//equals operation
		String e="vardhu";
		String q="vardhu";
		System.out.println(e.equals(q));
		//.format operation
		//it is used for placeholder
		String p="vardhu";
		System.out.println(String.format("my name  is %s", p));
		
		
		
	}
	

}
