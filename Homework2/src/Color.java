public class Color implements Comparable<Object> {
final static int RED_BASE=256*256;
final static int GREEN_BASE=256;
final static int BLUE_BASE=1;

final static int BYTE_MASK=255;
private long red,green,blue;
protected long color;
private void rgb2colors()
{
red = color>>>16;
green = (color>>>8)&BYTE_MASK;
blue = color&BYTE_MASK;
}
private void color2rgb()	
{
color = (red<<16)|(green<<8)|(blue);
}
public Color(){}
public Color (long c)
{
color = c;
rgb2colors();
}
public long getRed()
{return red;}
public void setRed(long r)
{red=r;
color2rgb();
}
public long getGreen()
{return green;}
public void setGreen(long g)
{green=g;
color2rgb();
}
public long getBlue()
{return blue;}
public void SetBlue(long b)
{blue = b;
 color2rgb();
}
public long getColor()
{return color;}
public void setColor(long c)
{color = c;
rgb2colors();
}
public String toString()
{return "red"+red+"green"+green+"blue"+blue+"compared"+color;
}
public boolean equals (Object c)
{return color == ((Color)c) .color;
}
public int  compareTo(Object c){
if (this.color<((Color)c).color) return -1;
if (this.color>((Color)c).color) return 1;
return 0;
}
public static void main (String[] args) {
Color blue = new Color (BLUE_BASE*255);
Color green = new Color (GREEN_BASE*255);
Color red = new Color (RED_BASE*255);
System.out.println(blue.toString());
System.out.println(green.toString());
System.out.println(red.toString());
blue.setColor(16711680);
green.setColor(255);
red.setColor(65280);
System.out.println(blue.toString());
System.out.println(green.toString());
System.out.println(red.toString());
}
}