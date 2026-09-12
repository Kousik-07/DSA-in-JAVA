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

        boolean issort=checksorted(arr);
        if(issort){
            System.out.print("This array is sorted");
        }else
            System.out.print("This array is not sorted");
    }

//    public static int checksorted(int arr[]){
//        int isSort=0;
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]<arr[i+1]){
//                isSort=1;
//            }else {
//                isSort=0;
//                return isSort;
//            }
//        }
//        return isSort;
//    }

    public static boolean checksorted(int arr[]){ //when we want to return boolean value then return type also mention in boolean
        boolean isSort=false; //we can use boolean
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                isSort=true;
            }else{
                isSort=false;
                return isSort;
            }
        }
        return isSort;
    }
}
