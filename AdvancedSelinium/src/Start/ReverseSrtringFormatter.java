package Start;
//Stringbuilder
public class  ReverseSrtringFormatter {
	
	public static String reverseString(String str){
		
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	} 
	
	public static void main(String[] args) {
		
		System.out.println(ReverseSrtringFormatter.reverseString("profound"));
		System.out.println(ReverseSrtringFormatter.reverseString("Comapnay"));
	}
}
