// @Author Youngmin
// Given two strings, write a funtion to check if they are one edit away.

public class OneEdit {
	public static void main(String[] args){
		boolean a = check("plel","pll");
		boolean a1 = check("palees","pale");
		boolean a2 = check("pale","baele");
		boolean a3 = check("pale","baleeeeke");
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
	public static boolean check(String a, String b){
		int counter1 = 0;
		int counter2 = 0;
		String a1= a.length() < a.length() ? a : b;
		String b2= a.length() < a.length() ? b : a;
			if(Math.abs(a1.length()-b2.length()) > 1 ){
				return false;
			}
		boolean wrong = false;
		do{
			if(a1.charAt(counter1) != b2.charAt(counter2)){
				if(wrong == true) {
					return false;
				}
				wrong = true;
			}
			counter1++;
			counter2++;	
		}while(counter1 < a1.length() && counter2 < b2.length());
		return true;
}
}

