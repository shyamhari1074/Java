import java.util.Scanner;

class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super();
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class coust {
    public static void main(String[] args) {
        int n, flag = 1, ch;
        int[] accNumber = new int[25];
        int[] amount = new int[25];
        String[] Names = new String[25];
        Scanner scan = new Scanner(System.in);
        coust e = new coust();

        System.out.print("Enter No. of Customers: ");
        n = scan.nextInt();
        e.accounts(n, Names, accNumber, amount);

        System.out.println("Banking System");
        System.out.println("1. Display All Accounts");
        System.out.println("2. Search Account");
        System.out.println("3. Deposit Amount:");
        System.out.println("4. Withdraw Amount:");
        System.out.println("5. Exit");

        while (flag == 1) {
            System.out.print("Enter Choice: ");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    e.display(n, Names, accNumber, amount);
                    break;
                case 2:
                    e.search(n, Names, accNumber, amount);
                    break;
                case 3:
                    e.deposit(n, accNumber, amount);
                    break;
                case 4:
                    e.withdraw(n, accNumber, amount);
                    break;
                case 5:
                    flag = 0;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        scan.close();
    }

    public void accounts(int n, String[] Names, int[] accNumber, int[] amount) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name of Customer " + (i + 1) + ": ");
            Names[i] = scan.next();
            System.out.print("Enter Account Number: ");
            accNumber[i] = scan.nextInt();
            System.out.print("Enter Initial Balance: ");
            amount[i] = scan.nextInt();
        }
    }

    public void display(int n, String[] Names, int[] accNumber, int[] amount) {
        System.out.println("Account Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + Names[i] + ", Account Number: " + accNumber[i] + ", Balance: $" + amount[i]);
        }
    }

    public void search(int n, String[] Names, int[] accNumber, int[] amount) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number to Search: ");
        int searchAccNumber = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (accNumber[i] == searchAccNumber) {
                System.out.println("Name: " + Names[i] + ", Account Number: " + accNumber[i] + ", Balance:$ " + amount[i]);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void deposit(int n, int[] accNumber, int[] amount) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number to Deposit: ");
        int accNum = scan.nextInt();
        System.out.print("Enter Amount to Deposit: ");
        int depositAmount = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (accNumber[i] == accNum) {
                amount[i] += depositAmount;
                System.out.println("Amount Deposited Successfully. New Balance: $" + amount[i]);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void withdraw(int n, int[] accNumber, int[] amount) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number to Withdraw: ");
        int accNum = scan.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        int withdrawAmount = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (accNumber[i] == accNum) {
                try {
                    if (amount[i] < withdrawAmount) {
                        throw new InsufficientFundsException("Insufficient funds!");
                    }
                    amount[i] -= withdrawAmount;
                    System.out.println("Amount Withdrawn Successfully. New Balance: $" + amount[i]);
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Account not found!");
    }
}
