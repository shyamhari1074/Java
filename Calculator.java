import java.util.Scanner;

public class Switch {

        static int Add(int a,int b){
            return a+b;
        }
        static  int Sub (int a,int b){
            return a-b;
        }
        static int  Multi(int a,int b){
            return a*b;
        }
        static int Div(int a,int b){
            return a/b;

        }
        static int  Mod(int a, int b){
            return a%b;

        }

    public static void main(String[] avsh) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus");
        int  Choice = in.nextInt();


            System.out.println("Enter the two numberws  ");
            int a = in.nextInt();
            int b = in.nextInt();

            switch (Choice) {
                case 1 -> System.out.println("sum is " + Add(  a, b));
                case 2 -> System.out.println("Result is :" + Sub(  a,  b));
                case 3 -> System.out.println("Result is " + Multi(  a, b));
                case 4 -> System.out.println("Result is " + Div(  a,  b));
                case 5 -> System.out.println("Result is " + Mod(  a, b));
                case 6-> System.out.println();
                default -> System.out.println("Enter valid Choice ");
            }
        }
    }

