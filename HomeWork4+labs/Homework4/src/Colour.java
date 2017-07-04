public class Colour implements Comparable<Object> {

	final static int RED_BASE = 256*256;
	final static int GREEN_BASE = 256;
	final static int BLUE_BASE = 1;
	final static int BYTE_MASK = 255;
	private long red, blue, green;
	protected long colour;
	private void rgb2colour()
	{
		red = colour>>>16;
		green = (colour>>>8)&BYTE_MASK;
		blue = colour & BYTE_MASK;
	}
	protected void colour2RGB()
	{
			colour= (red<<16)|(green<<8)|(blue);
	}
	
	public long enterColour()
	{
		long i;
		i = Console.readLong("Въведете стойност за цвят: ");
	if(i>256*256 || i<0)enterColour();
		return i;
	}
	public Colour()
	{
		System.out.println("Червен сегмент: ");
		red = enterColour();
		System.out.println("Зелен сегмент: ");
		green = enterColour();
		System.out.println("Син сегмент: ");
		blue = enterColour();
		colour2RGB();
	}
	public Colour(long c)
	{
		colour = c;
		rgb2colour();
	}
	public long getRED()
	{
		return red;
	}
	public long getBLUE()
	{
		return blue;
	}
	public long getGREEN()
	{
		return green;
	}
	public void setRED(long c)
	{
		red = c;
		colour2RGB();
	}
	public void setBLUE(long c)
	{
		blue = c;
		colour2RGB();
	}
	public void setGREEN(long c)
	{
		green = c;
		colour2RGB();
	}
	
	public void setColour(long c)
	{
		colour = c;
		rgb2colour();
	}
	public long getColour()
	{
	return colour;
	}
	public String toSTR()
	{
		return " Червено : " + red + ", Зелено : " +green + ", Синьо : " +blue + ", Обеденинени : " + colour;
	}
	public boolean equal(Object c)
	{
		return colour==((Colour)c).colour;
	}
	public int  compare(Object c)
	{
		if(this.colour<((Colour)c).colour) return -1;
		else if(this.colour>((Colour)c).colour) return 1;
		else return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter colour Segments values for Blue : ");
			Colour blue = new Colour();
			System.out.println(blue.toSTR());
			System.out.println("New colours");
			blue.setColour(Console.readLong("Enter compound : "));
			System.out.println(blue.toSTR());
	
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}


