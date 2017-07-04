public class TriangleMatrix2 {
	int tm[][][];
	TriangleMatrix2(int len) {
		tm = new int[len][len][len];
		for(int i=0; i<tm.length; i++) tm[i][i][i] = 0;
		for(int r=0; r<tm.length; r++)
			for(int c=0; c<tm[r].length; c++) 
				for(int v=0; v<tm[c].length; v++)
					tm[r][c][v] = 0;
	}

	public void set(int row, int col, int vol, int val) {
		tm[row][col][vol] = val;
	}

	public int get(int row, int col, int vol) {
		return tm[row][col][vol];
	}

	public int sum() {
		int s = 0;
		for(int r=0; r<tm.length; r++) {
			for(int c=0; c<tm[r].length; c++) {
				for(int v=0; v<tm[c].length; v++)
					s = s + get(r, c, v);
			}
		}
		return s;
	}

	public void print() {
		for(int r=0; r<tm.length; r++) {
			if(r==0) System.out.print("       ");
			if(r==1) System.out.print("    ");
			if(r==2) System.out.print("  ");
			for(int c=0; c<tm[r].length; c++) {
				for(int v=0; v<tm[c].length; v++){
					System.out.print(get(r, c, v) + "  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		TriangleMatrix2 t = new TriangleMatrix2(4);
		for(int r=0; r<t.tm.length; r++) {
			for(int c=0; c<t.tm[r].length; c++) {
				for(int v=0; v<t.tm[c].length; v++){
					//if(!(t.set(r, c, 10*(r + c)))) System.out.println("Out of range");
					t.set(r, c, v, 10*(r + c + v));
				}
			}
		}
		t.print();
		System.out.println("\n" + t.sum());
	}
}
