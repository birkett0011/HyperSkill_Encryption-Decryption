import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String password = "";
        if(a>0) {
            password += "A";
            for (int i = 1; i < a; i++) {
                password += alphabet.charAt(i);
            }
        }

        password = password.toUpperCase();

        if(b>0) {
            for (int i = 0;  i < b; i++) {
                password += alphabet.charAt(alphabet.indexOf(password.charAt(password.length()-1))+1);
            }
        }
        if(c>0) {
            for (int i = 0; i < c; i++) {
                password += i;
            }
        }

        if(password.length() < n) {
            for (int i = 0; i <= n - password.length(); i++) {
                password += alphabet.charAt(alphabet.indexOf(password.charAt(password.length()-1))+1);
            }
        }

        System.out.println(password);




    }
}