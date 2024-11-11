import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner av= new Scanner(System.in);
        int A[][]=new int[10][10];
        int B[][]=new int[10][10];
        int C[][]=new int[10][10];
        System.out.println("Enter the elemnts of first matrix");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                A[i][j]=av.nextInt();

            }
        }
        System.out.println("Enter the elements of second matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=av.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("the result is (multiplies matrix is) ");
        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        av.close();
    }
}