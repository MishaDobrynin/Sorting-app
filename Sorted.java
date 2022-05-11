
/**
 * Write a description of class Sorted here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022
 */
public class Sorted{
    public boolean sorted(double[] arr){
        boolean ret = true;
        int len = arr.length-1;
        for(int i = 0; i < len; i++){
            if(arr[i] > arr[i+1]){
                ret = false;
            }
        }
        return ret;
    }
    public boolean sorted(int[] arr){
        boolean ret = true;
        int len = arr.length-1;
        for(int i = 0; i < len; i++){
            if(arr[i] > arr[i+1]){
                ret = false;
            }
        }
        return ret;
    }
}