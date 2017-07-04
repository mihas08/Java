
public class ColourRECT extends Colour implements Comparable<Object> {
 
	private int x1, x2,y1, y2;
	public ColourRECT()
	{
	super(Console.readLong("Въведи цвят: "));
	colour2RGB();
	x1= Console.readInt("Въведи x1: ");
	x2= Console.readInt("Въведи x2: ");
	y1= Console.readInt("Въведи y1: ");
	y2= Console.readInt("Въведи y2: ");
	
	}
	public ColourRECT(int x1, int x2, int y1, int y2, long c)
	{
		super(c);
		x1 = Math.min(x1,x2);
		x2 = Math.max(x1,x2);
		y1 = Math.min(y1,y2);
		y2 = Math.max(y1,y2);
	}
	
	public int getX1()
	{
		return x1;
	}
	public int getX2()
	{
		return x2;
	}
	public int getY1()
	{
		return y1;
	}
	public int getY2()
	{
		return y2;
	}
	public int Area()
	{
		return (x2-x1)*(y2-y1);
	}
	public int compare(ColourRECT A, ColourRECT B)
	{
	if( A.Area()>B.Area())return 1;
	else if(A.Area()==B.Area())return 0;
	else return -1;
	}
	
	static public boolean equals(ColourRECT A, ColourRECT B)
	 {
		 return (A.Area()==B.Area() && A.colour == B.colour);
	 }
	
	public void TranslateX(int p)
	 {
		p=Console.readInt("Въведи число да се измести X : ");
		 x1+=p;
		 x2+=p;
	 }
	 public void TranslateY(int p)
	 {
		 p=Console.readInt("Въведи число да се измести Y : ");
		 y1+=p;
		 y2+=p;
	 }
	 public void TranslateXY(int p)
	 {
		 p=Console.readInt("Въведи число да се измести X и Y : ");
		 x1+=p;
		 x2+=p;
		 y1+=p;
		 y2+=p;
	 }
	 public boolean inside(int px, int py)
	 {
		 if(px>x1 && px<x2)
			 if(py>y1 && py>y2)
				 return true;
			 else return false;
		 else return false;
	 }
	 public ColourRECT uRect(ColourRECT A)
	 {
		
			 return new ColourRECT(x1<A.x1? x1:A.x1, 
					 x2>A.x2 ? x2:A.x2, 
							 y1<A.y1? y1:A.y1,
									 y2>A.y2? y2:A.y2,
					 A.getColour()| this.getColour());
	 }
	 
	 public ColourRECT uniteRect(ColourRECT A)
	 {

		 return new ColourRECT(x1>A.x1? x1:A.x1, 
				 x2<A.x2 ? x2:A.x2, 
						 y1>A.y1? y1:A.y1,
								 y2<A.y2? y2:A.y2,
				 A.getColour()| this.getColour());
	 }
	
	 public String toSTR()
		{
			return " X1 =  " + x1 + ", X2 =  " +x2 + ", Y1 =  " +y1 + ", Y2 =  " +y2 + ", Compound : " + colour;
		}
	
	public static void main(String[] args) {
		ColourRECT  A = new ColourRECT();
		 System.out.println(A.toSTR());
		 A.TranslateXY(0);
		 System.out.println(A.toSTR());
	}

}
