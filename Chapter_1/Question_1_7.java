/*
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */

public class Question_1_7{
    public static void rotate(int[][] image){
        int n = image.length;
        for(int i=0; i<n/2; i++){
            int first = i;
            int last = n-1-i;
            for(int j=first; j<last; j++){
                int off = j-first;
                int top = image[first][j];
                image[first][j] = image[last-off][first];
                image[last-off][first] = image[last][last-off];
                image[last][last-off] = image[j][last];
                image[j][last] = top;
            }
        }
    }
    
    public static void print(int[][] image){
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                System.out.print(image[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int[][] image = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
        };
        
        print(image);
        rotate(image);
        print(image);
    }
}