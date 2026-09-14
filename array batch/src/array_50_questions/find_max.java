package array_50_questions;
import java.util.Scanner;
public class find_max{
    public static void main(String arg[]){
        System.out.println("Enter array size");
        Scanner input=new Scanner(System.in);
        int size = input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+"elements");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        int max=maxElement(arr);
        System.out.println("Maximum value: "+max);
    }
    public static int maxElement(int array[]){
        int maxvalue=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>maxvalue){
                maxvalue=array[i];
            }
        }
        return maxvalue;
    }
}
