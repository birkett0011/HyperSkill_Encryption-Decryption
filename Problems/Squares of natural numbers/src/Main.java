import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //System.out.println(input);
        int value = 1;
        int i = 1;
        do{
            value = i * i;
            if(value <= input) {
                System.out.println(value);
            }
            i++;

        }while(value <= input);
    }
}