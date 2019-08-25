public class Strings {
	public static String uniqueLetters(String str) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
		boolean match = false;
			for(int j=0; j<str.length(); j++) {
				if(i!=j && str.charAt(i) == str.charAt(j)) {
					match = true;
				}
			}
			if(match!=true) {
				result += (str.charAt(i));
			}
		}
		return result;
	}
}
