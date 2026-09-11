import java.util.Scanner;
public class countElm{
    public static void main(String arg[]){
        System.out.println("Enter target element which you want to find ");
        int arr[]={12,32,40,59,90,43,40,32,43,12};
        Scanner input=new Scanner(System.in);
        int tar=input.nextInt();
        int count=countTarget(arr,tar);
        System.out.println("Total number off target element: "+count);
    }
    public static int countTarget(int arr[],int tar){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(tar==arr[i]){
                count++;
            }
        }
        return count;
    }

}
