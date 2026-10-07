package array_50_questions;
import java.util.Scanner;
import java.util.Arrays;
public class mergeSortArray{
    public static int [] mergeArr(int a[], int b[]){
        int i=0, j=0, k=0;
        int merge[]=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                merge[k]=a[i];
                i++;
                k++;
            }else{
                merge[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            merge[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            merge[k]=a[i];
            k++;
            i++;
        }
        return merge;
    }

    public static void main(String ar[]){
        System.out.println("Enter first array size: ");
        Scanner input=new Scanner(System.in);
        int a[]=new int[input.nextInt()];
        System.out.println("Enter "+a.length+" elements");
        for(int i=0; i<a.length; i++){
            a[i]=input.nextInt();
        }
        System.out.println("Enter second array size: ");
        int b[]=new int[input.nextInt()];
        System.out.println("Enter "+b.length+" elements");
        for(int i=0; i<b.length; i++){
            b[i]=input.nextInt();
        }
        int result[]=mergeArr(a,b);
        System.out.println("result is: "+Arrays.toString(result));
    }
}
