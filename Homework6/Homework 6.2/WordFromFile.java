package Homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class WordFromFile {
	   private FileReader in;
	  public WordFromFile(String filename) throws FileNotFoundException
	 {
	        in = new FileReader(filename);
	    }
	   public String getWord() throws IOException {
	    int c;
	    StringBuffer buf = new StringBuffer();
	        do {
	           c = in.read();
	            if (Character.isWhitespace((char)c))
	               return buf.toString();
	         else
	     buf.append((char)c);
	        } while (c != -1);
		      return buf.toString();
	   }
	   public static void main(String args[ ]) throws IOException {
				WordFromFile file = new WordFromFile("d:\\proba.txt");
				System.out.println(file.getWord());
			}
	}
