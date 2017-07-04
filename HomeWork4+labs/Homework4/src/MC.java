import java.util.Arrays;
public class MC {

	public static void main(String[] args) {

		Boolean[] b= new Boolean [5]; 
		byte[]bt=new byte [5];
		char[]ch=new char []{'s','d','a','a','f'};
		short[]sh=new short [5];
		int[]i = new int [5];
		long[]l = new long [5];
		float[]fl = {1f,8f,6f,4f,5f};
		double[]d = new double [] {40,20,11,22,50};
		String[]str = new String []{"NOT NULL","THIS IS A STRING","OR IS IT","TATATA","DRUMS BEATING"};
	Arrays.fill(b, false);
	Arrays.fill(bt, (byte)0);
	Arrays.fill(sh, (short)1);
	Arrays.fill(i, 2);
	Arrays.fill(l, 3);
	Arrays.sort(fl);
	Arrays.sort(d);
	Arrays.sort(ch);
	System.out.println(Arrays.toString(str));
	
	Colour[]c = new Colour[3];
	c[0]=new Colour();
	c[1]=new Colour();
	c[2]=new Colour();
	ColourRECT[]cr=new ColourRECT[3];
	cr[0] = new ColourRECT();
	cr[1] = new ColourRECT();
	cr[2] = new ColourRECT();
	Arrays.sort(cr);
	Arrays.sort(c);
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(cr));

	}
}
