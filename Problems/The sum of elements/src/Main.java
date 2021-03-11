import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        int value;
        do {
            value = scanner.nextInt();
            inputs.add(value);
        } while (value != 0);

        System.out.println(inputs.stream().mapToInt(i -> i.intValue()).sum());
    }
}