import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A : ");
        int a = sc.nextInt();
        System.out.print("Enter the number B : ");
        int b = sc.nextInt();
        System.out.print("Enter your  choice , 1 for addition 2 for subtraction 3 for multiplication 4 for division : ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
            int ans1 = a + b;
            System.out.println("Addition = " + ans1);
            break;
            case 2:
            int ans2 = a - b;
            System.out.println("Subtraction = " + ans2);
            break;
            case 3:
            int ans3 = a * b;
            System.out.println("Multiplication = " + ans3);
            break;
            case 4:
            int ans4 = a / b;
            System.out.println("Division = " + ans4);
            break;
            default:
            System.out.println("Wrong Choice entered"); 
        }
    }
}