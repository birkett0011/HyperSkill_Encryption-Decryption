import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int number = scanner.nextInt();
        int id = 1;
        boolean crash = false;
        while(scanner.hasNextInt()) {
            if(scanner.nextInt() <= height){
                crash = true;
                break;
            }
            id ++;
        }
        System.out.print(crash ? "Will crash on bridge " + id : "Will not crash");
    }
}