package jamesBond;

public class JamesBond {
	public boolean bondRegex(String input){
		String pattern = "(.*)" + "(\\d*)" + "[(]" + "(\\d*)" + "007" + "(\\d*)" + "[)]" + "(\\d*)" + "(.*)";
		return input.matches(pattern);
	}
}
