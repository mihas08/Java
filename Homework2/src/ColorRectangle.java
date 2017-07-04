public class ColorRectangle extends Color implements Comparable <Object> {
	private int iX1;
	private int iY1; 
	private int iX2;
	private int iY2;

public ColorRectangle()
{
    iX1 = 0;
    iY1 = 0;
    iX2 = 0;
    iY2 = 0;
}
public ColorRectangle(int x1, int y1, int x2, int y2)
{
	iX1 = Math.min(x1,x2);
	iY1 = Math.min(y1,y2);
	iX2 = Math.max(x1,x2);
	iY1 = Math.max(y1,y2);
}
public int getIX1() {return iX1;}
public int getIX2() {return iY1;}
public int getIY1() {return iX2;}
public int getIY2() {return iY2;}
public int calcArea()
{
	return (iX2-iX1)*(iY2-iY1);
}
public int compareTo(Object r)
{
	if(calcArea()<((ColorRectangle)r).calcArea())
		return +1;
	else if(calcArea()==((ColorRectangle)r).calcArea())
		return 0;
	else
		return 1;
}
public String toString()
{
	return "[" + iX1 + "," +iY1+ "]  [" + iX2 + "," + iY2 + "]";
}
public boolean equals(ColorRectangle r)
{
	return compareTo(r)==0;
}
public void translateX(int iPoints)
{
	iX1 = iX1+iPoints;
	iX2 = iX2+iPoints;
}
public void translateY(int iPoints)
{
	iY1 = iY1+iPoints;
	iY2 = iY2+iPoints;
}
public void translateXY(int iPoints)
{
	iX1 = iX1+iPoints;
	iX2 = iX2+iPoints;
	iY1 = iY1+iPoints;
	iY2 = iY2+iPoints;
}
public boolean isInside(int ptX, int ptY )
{
	return (ptX>=iX1 && ptY>=iY1 || ptX<=iX2 && ptY<=iY2);
}
public ColorRectangle unionRect(ColorRectangle r)
{
	int rx1=Math.min(iX1,r.iX1);
	int rx2=Math.max(iX2,r.iX2);
	int ry1=Math.min(iY1,r.iY1);
	int ry2=Math.max(iY2,r.iY2);	
	return new ColorRectangle(rx1,ry1,rx2,ry2);
}
public ColorRectangle intersectionRect( ColorRectangle rect)
{	
	int rx1=Math.max(iX1,rect.iX1);
	int rx2=Math.min(iX2,rect.iX2);
	int ry1=Math.max(iY1,rect.iY1);
	int ry2=Math.min(iY2,rect.iY2);
	ColorRectangle r=new ColorRectangle(rx1,ry1,rx2,ry2);
	if(isInside(r.iX1,r.iY1) && isInside(r.iX2,r.iY2))
		return r;
	return new ColorRectangle();
}
public static void main(String args[]){
	System.out.println("Създаване на два обекта: ");
    ColorRectangle rect = new ColorRectangle(3,4,5,7);
    ColorRectangle rectSnd = new ColorRectangle(5,4,8,10);
    System.out.println("\n Обект: ");
    System.out.println(rect);
    System.out.println("\n Изместване по X ");
    rect.translateX(4);
    System.out.println(rect);
    System.out.println("\n Равни ли са ? ");
    System.out.println(rect.equals(rectSnd));
    System.out.println("\n Сравнени лица: ");
    System.out.println(rect.compareTo(rectSnd));
    System.out.println("\n Обграждащ правоъгълник ");
    ColorRectangle rect3rd = rect.unionRect(rectSnd);
    System.out.println(rect3rd);
    System.out.println("\n  0бщ правоъгълник:");
    ColorRectangle rect4th = rect.intersectionRect(rect3rd);
    System.out.println(rect4th);
}
}

