package array_50_questions;
import java.util.Scanner;
public class evenOdd{
    public static void main(String arg[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }

        int evenCount=countEven(arr);
        int oddCount=arr.length-evenCount;
        System.out.println("Even number in this array is: "+evenCount);
        System.out.println("Odd number in this array: "+oddCount);
    }
    public static int countEven(int arr[]){
        int even=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                even++;
            }
        }
        return even;
    }
}
