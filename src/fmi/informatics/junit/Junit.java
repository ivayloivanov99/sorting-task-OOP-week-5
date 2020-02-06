package fmi.informatics.junit;

public class Junit {

	public Integer tryParse(String text) {
		  try {
		    return Integer.parseInt(text);
		  } catch (NumberFormatException e) {
		    return 0;
		  }
		}
}
