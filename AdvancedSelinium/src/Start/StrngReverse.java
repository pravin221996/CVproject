package Start;

//String
public class StrngReverse {
	public static void main(String[] args) {

		String str = "selenium", newstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println("selenium");

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			newstr = ch + newstr;
		}
		System.out.println("Reversed word: " + newstr);
	}

}
