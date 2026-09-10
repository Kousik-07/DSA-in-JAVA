import java.util.Scanner;
public class arrayupdate{
 public static void main(String args[]){
     int arr[]={12,32,42,53,73,84,82};
     for(int array:arr){
         System.out.print(array+" ");
     }
     Scanner input=new Scanner(System.in);
     System.out.println("Which position you want update");
     int position =input.nextInt();
     position-=1;
     System.out.println("Enter updated number");
     int update_number=input.nextInt();
     arr[position]=update_number;
     System.out.println("Updated array :");
     for(int newarr:arr){
         System.out.print(newarr+" ");
     }
 }
}