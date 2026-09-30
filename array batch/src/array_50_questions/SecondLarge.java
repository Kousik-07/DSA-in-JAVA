package array_50_questions;
import java.util.Scanner;
public class SecondLarge{
    public static void main(String args[]){
        System.out.println("Enter size of the array");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0; i<size;i++){
            arr[i]=input.nextInt();
        }
        int result=secondlar(arr);
        System.out.println("Second largest element is : "+result);
    }

    public static int secondlar(int arr[]){
        int large=arr[0];
        int secLarge=0;
        for(int i=1; i<arr.length; i++){
            if(large<arr[i]){
                secLarge=large;
                large=arr[i];
            }
        }
        return secLarge;
    }
}
