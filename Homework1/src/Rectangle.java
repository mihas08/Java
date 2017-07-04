public class Rectangle {
   private int x1 ,y1,x2,y2;

   public int getX1() {
	return x1;
}
public void setX1(int x1) {
	this.x1 = x1;
}
public int getY1() {
	return y1;
}
public void setY1(int y1) {
	this.y1 = y1;
}
public int getX2() {
	return x2;
}
public void setX2(int x2) {
	this.x2 = x2;
}
public int getY2() {
	return y2;
}
public void setY2(int y2) {
	this.y2 = y2;
}
public Rectangle(){}
public Rectangle(int nwX1 ,int nwY1, int nwX2 , int nwY2){
	   this.x1 = nwX1;
	   this.y1 = nwY1;
	   this.x2 = nwX2;
	   this.y2 = nwY2;
   }
public int calcArea(){
	 int calcX = x2 - x1;
	 int calcY = y2 - y1;
	 int area =  2*calcX + 2* calcY;	 
	 return area;
 }
public int CompareTo(Object obj)
	{
		int Area1 = this.calcArea();
	    int Area2 = ((Rectangle)obj).calcArea();
		if(Area1>Area2)
			return 1;
		else if(Area1<Area2)
			return +1;
		else
			return 0;
	}
public boolean equals(Rectangle rect){
	 if(this.calcArea() == rect.calcArea()){
		 return true ; 
	 } else{
		 return false ; 
	 }	 
 }
public String toString(){
	return x1 + " " + y1 + " " + x2 + " " + y2; 
 }
public void translateX(int ptsX){
	 this.x1 = x1  + ptsX;
     this.x2 = x2 + ptsX;   
 }
public void translateY(int ptsY){
     this.y1 = y1 + ptsY;
     this.y2 = y2 + ptsY;
 }
public void translateXY(int pts){
       this.x1 = x1 + pts;
       this.y1 = y1 + pts;
       this.x2 = x2+ pts;
       this.y2 = y2+ pts;
 }
public boolean isInside(int coordX,int coordY){     
	 if(coordX>Math.min(x1, x2)&& coordX<Math.max(x1, x2)&& coordY>Math.min(y1, y2) && coordY<Math.min(y1, y2)){
		 return true;
	 } else{
		 return false;
	 } 
  }  
public Rectangle unionRect(Rectangle rect){
	  int coordx1 = Math.min(this.x1, rect.x1);
	  int coordy1 = Math.min(this.y1, rect.y1);
	  int coordx2 = Math.min(this.x2, rect.x2);
	  int coordy2 = Math.min(this.y2,rect.y2);	  
	  Rectangle unionRect = new Rectangle(coordx1,coordy1,coordx2,coordy2);
	  return unionRect;
 }
public boolean isRectInside(Rectangle rect){
	 if(this.isInside(rect.x1, rect.y1)&& this.isInside(rect.x2,rect.y2)){
		 return true;
	 }else{
		 return false;
	 }
 }
public Rectangle intersectionRct(Rectangle rect){
	  int coordx1 = Math.min(this.x1, rect.x1);
	  int coordy1 = Math.min(this.y1, rect.y1);
	  int coordx2 = Math.min(this.x2, rect.x2);
	  int coordy2 = Math.min(this.y2,rect.y2);  
	  Rectangle intersectRect = new Rectangle(coordx1,coordy1,coordx2,coordy2);
	  if(this.isRectInside(rect)){
		  return intersectRect;
	  } else{
		  return new Rectangle();
	  }	  
 }
public static void main(String[] args) {
	 System.out.println("Създаване на два обекта: ");
     Rectangle rect = new Rectangle(5,6,9,14);
     Rectangle rectSnd = new Rectangle(3,7,8,10);
     System.out.println("\n Обекти: ");
     System.out.println(rect);    
     System.out.println("\n Изместване по X ");
     rect.translateX(4);
     System.out.println(rect);    
     System.out.println("\n Равни ли са ? ");
     System.out.println(rect.equals(rectSnd));   
     System.out.println("\n Сравнените лица: ");
     System.out.println(rect.CompareTo(rectSnd));   
     System.out.println("\n  Обграждащ правоъгълник ");
     Rectangle rect3rd = rect.unionRect(rectSnd);
     System.out.println(rect3rd);    
     System.out.println("\n  Общ правоъгълник:");
     Rectangle rect4th = rect.intersectionRct(rect3rd);
     System.out.println(rect4th);   
	}
}