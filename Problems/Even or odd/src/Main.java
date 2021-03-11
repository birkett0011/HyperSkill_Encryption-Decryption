import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int value = scanner.nextInt();
            if ((value % 2) == 0) {
                if( value == 0){
                    break;
                }
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}