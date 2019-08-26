import java.util.*;

public class Encoding {
	public static Set<String> morseCodes(int m, int n) {
		Set<String> result = new TreeSet<>();
		Set<String> recursions = new TreeSet<>();
		if(m==0 && n==0){
			return result;
		}
		if(m==1 && n==0){
			result.add(".");
			return result;
		}
		if(m==0 && n==1){
			result.add("-");
			return result;
		}	
		if(m>0){
			recursions=morseCodes(m-1,n);
		}
		if(n>0){
			recursions=morseCodes(m,n-1);
		}		
		return result;
	}
}
