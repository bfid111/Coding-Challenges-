import java.util.Arrays;

// @Author Youngmin
// Checks if how many unique characters are there in a given string
// and prints their number of occurances
public class CheckUnique {
	public static void main(String[] args){
	    int str = countUnique("This is a sample String.");
		int count[] = countOccurance("This is a sample String.");
		System.out.println("Number of Unique Characters : " + str);
		for(int i = 0; i < count.length; i++){
			if(count[i] > 0){
				char temp = (char)i;
				System.out.println(( "\" " + temp + " \"" + " " 
				     + " count : " + count[i]));
			}
		}
	}
	static int countUnique(String str){
		int count = 0; 
		boolean[] isUnique = new boolean[128]; // There are 0~127 ASCII values 
		Arrays.fill(isUnique,false);
		for(int i = 0; i < str.length(); i++){
			count += isUnique[(int)str.charAt(i)] == false ? 1:0;
			isUnique[(int)str.charAt(i)] = true; // true after going through the loop
		}
		return count;
	}
	static int[] countOccurance(String str){
		int[] strOccurance = new int[128];
		Arrays.fill(strOccurance, 0);
		for(int i  = 0; i < str.length(); i++){
			strOccurance[(int)str.charAt(i)] += 1;
		}
		return strOccurance;
	}
}
/* Sample Output
Number of Unique Characters : 16
"   "  count : 4
" . "  count : 1
" S "  count : 1
" T "  count : 1
" a "  count : 2
" e "  count : 1
" g "  count : 1
" h "  count : 1
" i "  count : 3
" l "  count : 1
" m "  count : 1
" n "  count : 1
" p "  count : 1
" r "  count : 1
" s "  count : 3
" t "  count : 1
*/