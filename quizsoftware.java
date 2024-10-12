import java.util.Scanner;

public class quizsoftware {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            System.out.println();
            System.out.println("-----------Welcome to Quiz-----------");
            System.out.println();
            System.out.println("Let us test your computer knowledge");
            System.out.println();
            System.out.println();

            System.out.println("Instructions for attempting test : ");
            System.out.println();
            System.out.println("-- Username = Triangle and Password = 1234567 for attempting quiz");
            System.out.println("-- Attempt all questions");
            System.out.println("-- All questions are of 5 points");
            System.out.println("-- Passing points are 30 points");
            System.out.println("-- Once you entered your answer it will not changed, so you choose correct option");
            System.out.println();

            System.out.println("> Press 7 to start game");
            System.out.println("> press 0 to exit");
            System.out.println();
            int i = sc.nextInt();
            System.out.println();

            String username = "Triangle";
            System.out.print("Enter the username : ");
            String user = sc.next();
            if(user.equals(username)) {
                System.out.println("Correct username");
            }
            else {
                System.out.println("Wrong username");
                return;
            }
            System.out.print("Enter the password : ");
            int pass = sc.nextInt();

            if(pass == 1234567) {
                System.out.println("Correct Password");
            }
            else {
                System.out.println("Wrong password");
                return;
            }

            System.out.println();
            System.out.println();

            if (i == 7) {
                System.out.println("The game starts\n\n");
            } else if (i == 0) {
                System.out.println("The game is ended");
            } else {
                System.out.println("Invalid input");
            }

            if (i == 7) {
                System.out.println("Q1.What is the full form of HTML?");
                System.out.println();
                System.out.println("1.Hyper text markup language");
                System.out.println("2.Hyper type markup language");
                System.out.println("3.Hyper text mark language");
                System.out.println("4.Hyper type mark lens");
                System.out.println();
                System.out.print("Enter your answer:");
                int a = sc.nextInt();
                System.out.println();
                if (a == 1) {
                    System.out.println("Correct answer");
                    int point1 = 5;
                    sum = sum + point1;
                    System.out.println("Your got " + point1 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 1");
                    System.out.println();
                }
                System.out.println("Q2.Which company developed MS SQL server?");
                System.out.println();
                System.out.println("1.Google");
                System.out.println("2.Amazon");
                System.out.println("3.Microsoft");
                System.out.println("4.Tesla");
                System.out.println();
                System.out.print("Enter your answer:");
                int b = sc.nextInt();
                System.out.println();
                if (b == 3) {
                    System.out.println("Correct answer");
                    int point2 = 5;
                    sum = sum + point2;
                    System.out.println("You got " + point2 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 3");
                    System.out.println();
                }
                System.out.println("Q3.What is the full form of SQL?");
                System.out.println();
                System.out.println("1.Structure Query Language");
                System.out.println("2.Java Development Kit");
                System.out.println("3.Java Virtual Machine");
                System.out.println("4.Structure JQuery Language");
                System.out.println();
                System.out.print("Enter your answer:");
                int c = sc.nextInt();
                System.out.println();
                if (c == 1) {
                    System.out.println("Correct answer");
                    int point3 = 5;
                    sum = sum + point3;
                    System.out.println("You got " + point3 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 1");
                    System.out.println();
                }
                System.out.println("Q4.What is the full form of MS?");
                System.out.println();
                System.out.println("1.Google");
                System.out.println("2.Microsoft");
                System.out.println("3.Amazon");
                System.out.println("4.Flipkart");
                System.out.println();
                System.out.print("Enter your answer : ");
                int d = sc.nextInt();
                System.out.println();
                if (d == 2) {
                    System.out.println("Correct answer");
                    int point4 = 5;
                    sum = sum + point4;
                    System.out.println("You got " + point4 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 2");
                    System.out.println();
                }
                System.out.println("Q5.Which of the following is the smallest unit of data in a computer?");
                System.out.println();
                System.out.println("1.Bit");
                System.out.println("2.KB");
                System.out.println("3.Nibble");
                System.out.println("4.Byte");
                System.out.println();
                System.out.print("Enter your answer : ");
                int e = sc.nextInt();
                System.out.println();
                if (e == 1) {
                    System.out.println("Correct answer");
                    int point5 = 5;
                    sum = sum + point5;
                    System.out.println("You got " + point5 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 1");
                    System.out.println();
                }
                System.out.println("Q6.Which of the following is not a characteristic of a computer?");
                System.out.println();
                System.out.println("1.Versatility");
                System.out.println("2.Accuracy");
                System.out.println("3.Diligence");
                System.out.println("4.I.Q.");
                System.out.println();
                System.out.print("Enter your answer : ");
                int f = sc.nextInt();
                System.out.println();
                if (f == 4) {
                    System.out.println("Correct answer");
                    int point6 = 5;
                    sum = sum + point6;
                    System.out.println("You got " + point6 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 4");
                    System.out.println();
                }
                System.out.println("Q7.Which of the following are physical devices of a computer?");
                System.out.println();
                System.out.println("1.Hardware");
                System.out.println("2.Software");
                System.out.println("3.System Software");
                System.out.println("4.Package");
                System.out.println();
                System.out.print("Enter your answer : ");
                int g = sc.nextInt();
                System.out.println();
                if (g == 1) {
                    System.out.println("Correct answer");
                    int point7 = 5;
                    sum = sum + point7;
                    System.out.println("You got " + point7 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 1");
                    System.out.println();
                }
                System.out.println("Q8.Which of the following can access the server?");
                System.out.println();
                System.out.println("1.Web Client");
                System.out.println("2.User");
                System.out.println("3.Web Browser");
                System.out.println("4.Web server");
                System.out.println();
                System.out.print("Enter your answer : ");
                int h = sc.nextInt();
                System.out.println();
                if (h == 1) {
                    System.out.println("Correct answer");
                    int point8 = 5;
                    sum = sum + point8;
                    System.out.println("You got " + point8 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 1");
                    System.out.println();
                }
                System.out.println("Q9.Which of the following type of computer is mostly used for automatic operations?");
                System.out.println();
                System.out.println("1.Analog");
                System.out.println("2.Digital");
                System.out.println("3.Hybrid");
                System.out.println("4.Remote");
                System.out.println();
                System.out.print("Enter your answer : ");
                int j = sc.nextInt();
                System.out.println();
                if (j == 3) {
                    System.out.println("Correct answer");
                    int point9 = 5;
                    sum = sum + point9;
                    System.out.println("You got " + point9 + " points");
                    System.out.println();
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 3");
                    System.out.println();
                }
                System.out.println("Q10.Which of the following is designed to control the operations of a computer?");
                System.out.println();
                System.out.println("1.User");
                System.out.println("2.Application Software");
                System.out.println("3.System Software");
                System.out.println("4.Utility Software");
                System.out.println();
                System.out.print("Enter your answer : ");
                int k = sc.nextInt();
                System.out.println();
                if (k == 3) {
                    System.out.println("Correct answer");
                    int point10 = 5;
                    sum = sum + point10;
                    System.out.println("You got " + point10 + " points");
                } else {
                    System.out.println("You entered wrong answer");
                    System.out.println("Correct option is : 3");
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println("Result: ");
            System.out.println();
            if (sum >= 30) {
                System.out.println("Congratulations !!!!!!!");
                System.out.println("Passed");
                System.out.println();
            } 
            else {
                System.out.println("Try better next time !!!!!");
                System.out.println("Failed");
                System.out.println();
            }
            System.out.println("You obtained " + sum + " points out of 50");

            int n = 50;
            float per = (sum * 100) / n;
            System.out.println("You got precentage : " + per);
            System.out.println();
            System.out.println();
            System.out.println("Thanks for using this quiz application!!");
            System.out.println();
            System.out.println("Have good day!!!!!");
            System.out.println();
        }
    }
}