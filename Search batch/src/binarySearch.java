import java.util.Scanner;
import java.util.Arrays;
public class binarySearch{
    public static void main(String arg[]){
        System.out.println("Enter array size: ");
        Scanner input=new Scanner(System.in);
        int size =input.nextInt();
        int arr[]=new int[size];
        arr[0]=10;
        for(int i=1; i<size; i++){
            arr[i]=arr[i-1]+1;
        }
            System.out.println(Arrays.toString(arr));

        int result=searchElm(arr);
        if(result==-1){
            System.out.println("Element not found");
        }else System.out.println("element positions is: "+(result+1));
    }

    public static int searchElm(int arr[]){
        System.out.println("Enter serching element");
        Scanner input=new Scanner(System.in);
        int target=input.nextInt();
        int low=0;
        int high=arr.length-1;
        while(low<=high){
        int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;

    }
}
