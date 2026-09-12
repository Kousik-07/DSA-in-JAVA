import java.util.Scanner;
public class sortedCheck{
    public static void main(String arg[]){
        System.out.println("Enter size of the array");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }

        int issort=checksorted(arr);
        if(issort==1){
            System.out.print("This array is sorted");
        }else
            System.out.print("This array is not sorted");
    }

    public static int checksorted(int arr[]){
        int isSort=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                isSort=1;
            }else {
                isSort=0;
                return isSort;
            }
        }
        return isSort;
    }
}
