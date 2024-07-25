package Tasks_and_Tests;

import java.util.Scanner;


public class calculator {
//    هنا استخدمنا دالة main  عشان نختبر بس كلاس calculator  ونقدر نعمل  run  للملف
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1;
        while (num == 1) {
            System.out.print("Do you want to use calculator? (y/n): ");
            char user_choice = input.next().charAt(0);
            if (user_choice == 'n') {
                num = 0;
            }
            else {
                System.out.println("Choose an operation (1, 2, 3, 4): ");
                System.out.println("1- Summation");
                System.out.println("2- Subtraction");
                System.out.println("3- Multiplication");
                System.out.println("4- Division");
                int operation = input.nextInt();


                System.out.print("First number: ");
                float num1 = input.nextFloat();
                System.out.print("Second number: ");
                float num2 = input.nextFloat();

                switch (operation) {
                    case 1:
                        sum(num1, num2);
                        break;
                    case 2:
                        sub(num1, num2);
                        break;
                    case 3:
                        mul(num1, num2);
                        break;
                    case 4:
                        div(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operation.");
                }
            }
        }
    }

    public static void sum (float n1,float n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
    }
    public static void sub (float n1,float n2) {
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
    }
    public static void mul (float n1,float n2) {
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
    }
    public static void div (float n1,float n2) {
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
    }
}