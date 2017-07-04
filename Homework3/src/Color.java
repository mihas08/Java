public class Color implements Comparable<Object>{
	final static int RED_BASE=256*256;
	final static int GREEN_BASE=256;
	final static int BLUE_BASE=1;
	final static int BYTE_MASK=255;
	private long red,green,blue;
	protected long color;
	private void rgb2colors(){
		red=color>>>16;
		green=(color>>>8)&BYTE_MASK;
		blue=color&BYTE_MASK;		
	}
	private void colors2rgb(){
		color=(red<<16)|(green<<8)|(blue);
		}	
	public Color(long c){
	red=Console.readInt("Въведи червено:");
	green=Console.readInt("Въведи зелено:");
	blue=Console.readInt("Въведи синьо:");
	colors2rgb();
	}
	public long getRed(){
		return red;
		
	}
	public void setRed(long r){
		red=r;
		colors2rgb();
	}
	public long getGreen(){
		return green;
	}
	public void setGreen(long g){
		green=g;
		colors2rgb();
	}
	public long getBlue(){
		return blue;
	}
	public void setBlue(long b){
		blue=b;
		colors2rgb();	
	}
	public long getColor(){
		return color;
	}
	public void setColor(long c){
		color=c;
		rgb2colors();
	}
public String toString(){
return "червен:" +red+"зелен: "+green+"син: "+blue+"съединение: "+color;
}
public boolean equals(Object c){
	return color==((Color)c).color;
}
public int compareTo(Object c){
	if(this.color<((Color)c).color)return -1;
    if(this.color>((Color)c).color)return 1;
    return 0;
}
public static void main(String[]args){
	Color blue=new Color(BLUE_BASE*255);
	Color green=new Color(GREEN_BASE*255);
	Color red=new Color(RED_BASE*255);
	System.out.println(blue.toString());
	System.out.println(green.toString());
	System.out.println(red.toString());
}
}
