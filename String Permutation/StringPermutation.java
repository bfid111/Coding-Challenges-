// Checks if a given string is a permutation
public class StringPermutation {
	public static void main(String[] args){
		boolean s = checkPerm("heeh");
		boolean d = checkPerm("goodoog");
		System.out.println(s);
		System.out.println(d);
	}
	static boolean checkPerm(String str){
		for(int i = 0; i < str.length(); i++){
			if ((str.charAt(i) != str.charAt(str.length()-1-i))){ // if char at position i is not same as char at position i away from the end 
				return false;
			}
		}
		return true;
	}
}
