import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class stringtokenizer {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the numbers separated by space: ");
            String input = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(input);
            int sum = 0;
            System.out.println("Numbers are");
            while(tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                int number = Integer.parseInt(token);
                System.out.println(number);
                sum += number;
            }
            System.out.println("Sum=" +sum);
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading input: "+e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter integers separated by space.");
        }
    }
}
