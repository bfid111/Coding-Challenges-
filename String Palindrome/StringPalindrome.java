// Checks if a given string is a Paldindrome
public class StringPermutation {
	public static void main(String[] args){
		boolean s = checkPaldindrome("heeh");
		boolean d = checkPaldindrome("goodoog");
		System.out.println(s);
		System.out.println(d);
	}
	static boolean checkPaldindrome(String str){
		for(int i = 0; i < str.length(); i++){
			if ((str.charAt(i) != str.charAt(str.length()-1-i))){ // if char at position i is not same as char at position i away from the end 
				return false;
			}
		}
		return true;
	}
}
