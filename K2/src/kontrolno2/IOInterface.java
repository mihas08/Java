package kontrolno2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;

public interface IOInterface {
	public void read() throws FileNotFoundException, NumberFormatException, IOException, ParseException;
	public void write() throws FileNotFoundException, UnsupportedEncodingException;
}
