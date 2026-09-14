import java.util.Arrays;
import java.util.Scanner;
public class moveZeroToEnd{
    public static void main(String args[]){
        System.out.println("Enter size of the array");
        Scanner input=new Scanner(System.in);
        int size =input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" numbers");
        for(int i=0;i<size; i++){
            arr[i]=input.nextInt();
        }
        int result[] = moveZero(arr);
        System.out.println("move zero to last position "+ Arrays.toString(result));
        for(int value:arr){
            System.out.println(value);
        }

    }
    public static int[] moveZero(int arr[]){
        int arrindex=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[arrindex]=arr[i];
                arrindex++;
            }
        }
        for(int i=arrindex; i<arr.length; i++){
            arr[i]=0;
        }
        return arr;
    }
}
