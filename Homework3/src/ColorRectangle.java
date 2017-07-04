public class ColorRectangle extends Color implements Comparable<Object> {
	private
	int iX1,iY1,iX2,iY2;
	public ColorRectangle()
	{
	super(Console.readLong("Enter a color:"));
	iX1=Console.readInt("Enter x1:");
	iY1=Console.readInt("Enter x1:");
	iX2=Console.readInt("Enter x1:");
	iY2=Console.readInt("Enter x1:");
	}
	public ColorRectangle(int x1,int y1,int x2,int y2,long c){
		super(c);
		iX1=Math.min(x1,x2);
		iY1=Math.min(y1,y2);
		iX2=Math.max(x1,x2);
		iY2=Math.max(y1,y2);		
	}
	public int getIX1()
	{
		return iX1;
	}
	
	public int getIY1()
	{
		return iY1;
	}
	
	public int getIX2()
	{
		return iX2;
	}
	
	public int getIY2()
	{
		return iY2;
	}
	public int calcArea()
	{
		int a = iX2 - iX1;
		int b = iY2 - iY1;
		int Area = a*b;
		return Area;
	}
	public int CompareTo(Object r)
	{
		int Area1 = this.calcArea();
		int Area2 = ((ColorRectangle)r).calcArea();
		if(Area1>Area2)
			return 1;
		else if(Area1<Area2)
			return -1;
		else
			return 0;
	}
	public String toString()
	{
		String Output = "("  + iX1 + ", " + iY1 + ", " + iX2 + ", " + iY2 + ")";
		return Output;
	}
	public boolean equals(ColorRectangle r)
	{
		if(iX1==((ColorRectangle)r).iX1&&iX2==((ColorRectangle)r).iX2&&iY1==((ColorRectangle)r).iY1&&iY2==((ColorRectangle)r).iY2)
			return true;
		else 
			return false;
	}
	public void translateX(int iPoints)
	{
		iX1 += iPoints;
		iX2 += iPoints;
	}
	
	public void translateY(int iPoints)
	{
		iY1 += iPoints;
		iY2 += iPoints;
	}
	public void translateXY(int iPoints)
	{
		translateX(iPoints);
		translateY(iPoints);
	}	
	public boolean isInside(int ptX, int ptY)
	{
		if(ptX>=iX1&&ptX<=iX2&&ptY>=iY1&&ptY<iY2)
			return true;
		else
			return false;
	}
	public ColorRectangle unionRect(ColorRectangle r){
		return new ColorRectangle(iX1<r.iX1?iX1:r.iX1,iY1<r.iY1?iY1:r.iY1,iX2>r.iX2?iX2:r.iX2,iY2>r.iY2?iY2:r.iY2,r.getColor()|this.getColor());
	}
	
	public ColorRectangle intersectionRect(ColorRectangle r){
		return new ColorRectangle(iX1>r.iX1?iX1:r.iX1,iY1>r.iY1?iY1:r.iY1,iX2<r.iX2?iX2:r.iX2,iY2<r.iY2?iY2:r.iY2,r.getColor()|this.getColor());
	}
	public static void main(String[] args) {
		ColorRectangle r1 = new ColorRectangle();
		ColorRectangle r2 = new ColorRectangle(3,3,7,7,10254);
		System.out.println(r1.getIX2());
		System.out.println(r1.calcArea());
		System.out.println(r2.calcArea());
		System.out.println(r2.CompareTo(r1));
		System.out.println(r1.toString());
		ColorRectangle r3 = new ColorRectangle(1,1,3,3,143243);
		System.out.println(r2.equals(r3));
		ColorRectangle r4 = r1.unionRect(r2);
		System.out.println(r4.toString());	
		ColorRectangle r5 = r1.intersectionRect(r2);
		System.out.println(r5.toString());	
		ColorRectangle r6 = new ColorRectangle(11,11,8,8,12333);
		ColorRectangle r7 = r2.intersectionRect(r6);
		System.out.println(r7.toString());
	}
}
