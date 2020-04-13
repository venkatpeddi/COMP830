class StringReverse{
	public String reverseString(String str) {
		
		str = new StringBuffer(str).reverse().toString();
		
		return str;
	}
}
public class ExamQ4 {
	
	public static void main(String[] args) 
	{
	StringReverse strreverse = new StringReverse();
	String str = strreverse.reverseString("Venkat");
	System.out.println(str);
	}

}
