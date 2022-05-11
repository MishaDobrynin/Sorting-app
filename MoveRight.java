
/**
 * Write a description of class MoveRight here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022
 */
public class MoveRight
{
    public int[] moveRight(int[] arr){
        int len = arr.length;
        int hold;
        hold = arr[len-1];
        for(int i = len-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = hold;
        return arr;
    }
    public char[] moveRight(char[] arr){
        int len = arr.length;
        char hold;
        hold = arr[len-1];
        for(int i = len-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = hold;
        return arr;
    }
    public String[] moveRight(String[] arr){
        int len = arr.length;
        String hold;
        hold = arr[len-1];
        for(int i = len-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = hold;
        return arr;
    }
    public double[] moveRight(double[] arr){
        int len = arr.length;
        double hold;
        hold = arr[len-1];
        for(int i = len-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = hold;
        return arr;
    }
}
