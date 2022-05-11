
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome{
    public static boolean palindrome(String[] arr){
        boolean flag = true;
        int n = arr.length;
        for (int i = 0; i <= n / 2 && n != 0; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = false;
            }
        }
        return flag;
    }
    public static boolean palindrome(double[] arr){
        boolean flag = true;
        int n = arr.length;
        for (int i = 0; i <= n / 2 && n != 0; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = false;
            }
        }
        return flag;
    }
    public static boolean palindrome(int[] arr){
        boolean flag = true;
        int n = arr.length;
        for (int i = 0; i <= n / 2 && n != 0; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = false;
            }
        }
        return flag;
    }
}