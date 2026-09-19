package array_50_questions;
import java.util.Scanner;
public class reverse_arr{
    public static void main(String arg[]){
        System.out.println("Enter size of the array");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        reverse_array(arr);
    }

    public static void reverse_array(int arr[]){
        int temp;
        for(int i=0; i<arr.length/2; i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("Reverse array is ");
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
