/**
 * Chapter 1 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 */

import java.util.*;

public class Question_1_1 {
    public static boolean unique(String str){
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++){
            if(m.containsKey(str.charAt(i))){
                return false;
            }
            m.put(str.charAt(i), 1);
        }
        return true;
    }
    
    public static boolean unique2(String str){
        for(int j=0; j<str.length()-1; j++){
            Character ch = str.charAt(j);
            for(int k=j+1; k<str.length(); k++){
                if(str.charAt(k) == ch){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        String input = "abcdefghijklmnopqrstuvwxyz";
        
        if(unique(input)){
            System.out.println("They are unique");
        }else{
            System.out.println("Failure");
        }
        
        if(unique2(input)){
            System.out.println("They are unique");
        }else{
            System.out.println("Failure");
        }
    }
}
