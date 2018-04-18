/**
 * Chapter 1 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 * Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column is set to 0.
 */

public class Question_1_8{
    public static void print(int[][] image){
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                System.out.print(image[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    public static void zero(int[][] image){
        boolean row[] = new boolean[image.length];
        boolean col[] = new boolean[image.length];
        
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                if(image[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                if(row[i]||col[j]){
                    image[i][j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args){
        int[][] image = {
            {1, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 10, 0, 12},
            {13, 14, 15, 16}
            };
        
        print(image);
        zero(image);
        print(image);
    }
}
