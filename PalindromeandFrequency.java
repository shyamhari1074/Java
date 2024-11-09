import java.util.Scanner;
public class palindromeFrequency{
    public static void main(String [] avsh){
        Scanner in= new Scanner(System.in);,
        System.out.println("Enter the input--");
        String Freq=in.nextLine();
        System.out.println("Enter the character to be checked ");
        char check=in.nextLine().charAt(0);
        int count=0;
        int len=Freq.length();
        int flag=0;
        for (int i=0;i<len/2;i++){
            if (Freq.charAt(i)!=Freq.charAt(len-i-1)){
               flag=1;
            }
          }
        if(flag==1){
            System.out.println("The input is not a palindrome");
        }
        else{
            System.out.println("The word is a paliindrome");
        }
        for(int i=0;i<len;i++){
            if(Freq.charAt(i)==check){
                count++;
            }
        }
        System.out.println("In the Word/Number"+Freq+" the character/digit- :"+check+" repeated:"+count+" times");
    }
}
