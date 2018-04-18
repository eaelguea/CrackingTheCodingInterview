/*
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring 
 * (i.e., “waterbottle” is a rotation of “erbottlewat”).
 */

public class Question_1_9{
    public static boolean isSubstring(String str, String s){
        return(s.indexOf(str)>=0);
    }
    
    public static boolean rotate(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String rotate = s1 + s1;
        return isSubstring(s2, rotate);
    }
    
    public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		if (rotate(s1, s2)) {
			System.out.println("Strings are rotations of one another.");
		} else {
			System.out.println("String are not rotations of one another.");
		}
    }
}