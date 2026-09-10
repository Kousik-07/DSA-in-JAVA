import java.util.Scanner;
public class array_max_number{
    public static void main(String args[]){
        System.out.println("Enter size of the array");
        Scanner s=new Scanner (System.in);
        int size = s.nextInt();
        if(size<=0){
            System.out.println("Size also graterthan 0");
            s.close();
            return;
        }
        int arr[] = new int[size];
        System.out.println("Enter " +size+" elements");
        for(int i=0; i<size; i++ ){
            arr[i]=s.nextInt();
        }
        int max= arr[0];
       for(int j=1; j<size; j++){
           if(max<arr[j]){
               max = arr[j];
           }
       }
       System.out.println("max number of an array "+ max);
       s.close();
    }
}
