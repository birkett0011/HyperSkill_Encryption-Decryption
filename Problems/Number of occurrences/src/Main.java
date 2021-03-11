import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String substring = scanner.nextLine();
        int count = 0;
        char[] inputChar = input.toCharArray();
        for(int i = 0; i <= input.length() - substring.length(); i++){
            String check = "";
            for(int j = 0; j < substring.length(); j++){
                check += inputChar[i+j];
            }
            if(substring.equals(check)) {
                i += substring.length();
                count ++;
            }
        }
        System.out.println(count);
    }
}