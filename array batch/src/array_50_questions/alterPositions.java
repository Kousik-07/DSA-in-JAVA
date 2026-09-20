package array_50_questions;
import java.util.Scanner;
import java.util.Arrays;
public class alterPositions{
    public static void main(String arg[]){
        System.out.println("Enter array size: ");
        Scanner input=new Scanner(System.in);
        int size =input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" element");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        arr=alterArrayPosition(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] alterArrayPosition(int arr[]){
        int index=0;
        for(int i=0; i<arr.length; i+=2){
            arr[index]=arr[i];
            index++;
        }

        return Arrays.copyOf(arr, index);
    }
}
