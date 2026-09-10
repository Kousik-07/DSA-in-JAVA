public class variableprogram{
    public static void main(String arr[]){
        int a,b,c,d;
        a=300;
        b = 123;
        c = 120;
        d = 73;
        System.out.println(a + b - c + d);
        
        System.out.println("Student details: ");
        studentObject s1=new studentObject();
        s1.name = "Kousik jana";
        s1.rollNumber = 34600123;
        s1.city = "Kolkata";
        System.out.println("Student name is "+ s1.name);
        System.out.println("Student roll number is "+s1.rollNumber);
    }
}
