package string;

//synchronized

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("deepak java");
		StringBuffer sb2 =new StringBuffer("deepak java");
		System.out.println(sb.capacity());//16 default
		System.out.println(sb.length());
		System.out.println(sb.append( " rahul"));//concate last 
		System.out.println(sb.codePointAt(1));
		System.out.println(sb.delete(0, 5));
		System.out.println(sb.equals(sb2));//object class--> false
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.insert(3, " new string "));
		System.out.println(sb.replace(3,7,"m"));
		System.out.println(sb.subSequence(1, 5));//1 to 4
		System.out.println(sb.substring(5));
		
		sb.ensureCapacity(100);
		sb.trimToSize();
		
		sb.setCharAt(2, 'f');
		System.out.println(sb);
	}
}
