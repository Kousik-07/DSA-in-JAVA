import java.util.Scanner;
public class sumOfArray{
    public static void main(String args[]){
        System.out.println("Enter size of the array");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        int sum=0;
        System.out.println("Enter "+size+"numbers");
        for(int i=0;i<arr.length; i++){
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        System.out.println("Total sum of this array :"+sum);
    }
}
