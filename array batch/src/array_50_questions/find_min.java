package array_50_questions;
import java.util.Scanner;
public class find_min{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+ " elements");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        int result = minimumElement(arr);
        System.out.println("minimum element is "+result);
    }

    public static int minimumElement(int arr[]){
        int minelem=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<minelem){
                minelem=arr[i];
            }
        }
        return minelem;
    }
}
