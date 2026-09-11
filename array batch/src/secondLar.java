public class secondLar{
    public static void main(String arg[]){
        int arr[]={12,32,23,534,23,53,54,23,34,23,56};
        int large=secondlarge(arr);
        System.out.println("Second largest element: "+large);
    }
    public static int secondlarge(int arr[]){
        int lar=arr[0];
        int secLar=Integer.MIN_VALUE;
        for(int i=1;i<arr.length; i++){
            int temp=arr[i];
            if(temp>lar ){
                secLar=lar;
                lar=temp;
            }
            else if(temp<lar && temp>secLar){
                secLar=temp;
            }
        }
        return secLar;
    }
}
