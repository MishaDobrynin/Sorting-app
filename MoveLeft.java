
/**
 * Write a description of class MoveLeft here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022
 */
public class MoveLeft{
    public int[] moveLeft(int[] arr){
        int hold = arr[0];
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=hold;
        return arr;
    }
    public char[] moveLeft(char[] arr){
        char hold = arr[0];
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=hold;
        return arr;
    }
    public String[] moveLeft(String[] arr){
        String hold = arr[0];
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=hold;
        return arr;
    }
    public double[] moveLeft(double[] arr){
        double hold = arr[0];
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=hold;
        return arr;
    }
}