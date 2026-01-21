import java.util.*;
public class EvenNoOfDigits {
    public static int findNumbers(int[] nums) {
        int c =0;
        for(int i=0; i<nums.length; i++){
            if((int)(Math.log10(nums[i]) + 1) % 2 == 0){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("enter array elements");
        for(int i =0; i<x; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumbers(arr));

    }
}