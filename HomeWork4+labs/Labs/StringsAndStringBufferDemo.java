package labs;


public class StringsAndStringBufferDemo {
	public static void main(String[] args) {
		String str = "The Car is a Vechicle.";
		int len = str.length();
		System.out.println(str + "  " + len);
	    StringBuffer sb = new StringBuffer(30);
	    sb.append(str);
	    int cap = sb.capacity();
	    len=sb.length();
	    System.out.println(sb + " " + len + " " + cap );
	    sb.delete(4,7);
	    len=sb.length();
	    System.out.println(sb + " " + len + " " + cap );
	    sb.insert(4,"Truck");
	    len=sb.length();
	    System.out.println(sb + " " + len + " " + cap );
	    sb.delete(0,29);
	    len=sb.length();
	    System.out.println(sb + " " + len + " " + cap );
	    double x=22.33;
	    String str1=String.valueOf(x);
	    sb.append(str1);
	    sb.reverse();
	    System.out.println(sb);
	}
}
