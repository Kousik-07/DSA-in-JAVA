import java.util.Scanner;
public class reverseArray{
    public static void main(String args[]){
        System.out.println("Enter size of the array");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0; i<size; i++){
            int nums=input.nextInt();
            arr[i]=nums;
        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        System.out.println("");
        reverseArr(arr);
    }
    public static void reverseArr(int array[]){
        for(int i=0; i<array.length/2; i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        System.out.println("Reverse array");
        for(int nums:array){
            System.out.print(nums+" ");
        }
    }
}
