package array_50_questions;
import java.util.Scanner;
public class isSort{
    public static void main(String arg[]){
        System.out.println("Enter size of the array");
        Scanner input =new Scanner(System.in);
        int size = input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        int result = checkIsSort(arr);
        if(result==1){
            System.out.println("Array is sorted !");
        }
        else{
            System.out.println("Array is not Sorted!");
        }
    }
    public static int checkIsSort(int arr[]){
        int result = 1;
        if(arr.length<=1 || arr == null){
            return result;
        }
        if(arr[0]<=arr[1]){
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    result=0;
                    return result;
                }
            }
            return result;
        }

        if(arr[0]>=arr[1]){
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1]){
                    result = 0;
                    return result;
                }
            }
            return result;
        }
        return result;
    }
}
