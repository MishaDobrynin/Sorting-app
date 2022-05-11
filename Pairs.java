
/**
 * Write a description of class Pairs here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022
 */
public class Pairs{
    public double[] pairs(double[] arr){
        double[] ret = new double[arr.length/2];
        if((arr.length/2)*2 != arr.length){
            ret = new double[arr.length/2 + 1];
            ret[ret.length-1] = arr[arr.length-1];
        }
        int len = (arr.length/2)*2;
        for(int i = 0; i < len; i += 2){
            ret[i/2] = arr[i] + arr[i+1];
        }
        return ret;
    }
}
