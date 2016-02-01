
/*
 * @Author Youngmin 
 */
public class StringCompression {
	
	public static void main(String[] args){
		String str = "aabcccccaaa";
		String output = compress(str);
		System.out.println(output);
	}

	public static String compress(String str){
		/* Method to perform basic string compression using
		 * the counts of repeated characters.
		 * Example : (Input = "aabccccaa" Output = "a2b1c5a3")
		 */ 
		// Counts the number of repeated characters
		int counter = 1; 
		// Compressed String Declaration
		String newStr = ""; 
		// First Character of Str 
		char start = str.charAt(0); 
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == start){ // if next character is equal to start 
				counter++;
				// change start to current character 
				start = str.charAt(i);
			}
			if( i == str.length()-1){ // if i reaches length of str 
				// Concagnate current char and counter 
				newStr +=  str.charAt(i-1) + Integer.toString(counter);
			}
			else if (str.charAt(i) != start){
				// Concagnate current char and counter 
				newStr +=  str.charAt(i-1) + Integer.toString(counter);
				// change start to current character 
				start = str.charAt(i);
				counter = 1; 
			}
		}
		return newStr;
	}
}

