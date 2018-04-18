*
 * 1.3 Write a method to replace all spaces in a string with ‘%20’.
 */

public class Question_1_3{
    public static Character[] reverse(Character[] str){
        Character[] ch = new Character[str.length];
        ch[str.length-1] = str[str.length-1];
        
        for(int i=0; i<str.length-1; i++){
            ch[(str.length-1)-i-1] = str[i];
        }
        return ch;
    }
    
    public static void reverse2(Character[] str, int index){
        if(str[index]=='\0'){
            return;
        }
        reverse2(str, index+1);
        System.out.print(str[index]);
    }
    
    public static void main(String[] args){
        Character[] str = {'a', 'b', 'c', 'd', 'e', 'f', '\0'};
        
        Character[] ch = reverse(str);
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
        System.out.println();
        
        reverse2(str, 0);
        System.out.println();
    }
}