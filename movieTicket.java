import java.util.Scanner;
public class movieTicket{
    public static void main(String arg[]){
        System.out.println("Enter your age");
        Scanner s=new Scanner(System.in);
        int age =s.nextInt();
        System.out.println("Enter days which you want to book ticket");
        String day_of_week = s.next();
        System.out.println("are you student (Y/N)");
        char is_student=s.next().charAt(0);

        if(age<12){
            System.out.println("ticket price 100");
            System.out.println("No discount for children");
        }else if(age>=60){
            System.out.println("ticket price 120");
        }else{
            if(day_of_week.equalsIgnoreCase("wednesday")){
                System.out.println("ticket price 150");
            }else if(Character.toLowerCase(is_student) == 'y'){
                System.out.println("ticket price 160 ");
            }else{
                System.out.println("ticket price 200");
            }
        }
    }
}
