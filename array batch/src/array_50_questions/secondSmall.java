package array_50_questions;
import java.util.Scanner;
public class secondSmall{
    public static void main(String ar[]){
        System.out.println("Enter size of the array");
        Scanner input =new Scanner(System.in);
        int size =input.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        int result=secSmall(arr);
        System.out.println("Smallest element is "+result);

    }
    public static int secSmall(int arr[]) {
        if (arr == null || arr.length < 2) {
            return -1; // Invalid case
        }

        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secSmall = small; // Purono small-ta second small hoye jabe
                small = arr[i];   // Notun small update hobe
            } else if (arr[i] < secSmall && arr[i] != small) {
                secSmall = arr[i]; // Jodi element-ta small-er theke boro kintu secSmall-er theke choto hoy
            }
        }

        return (secSmall == Integer.MAX_VALUE) ? -1 : secSmall;
    }

}
