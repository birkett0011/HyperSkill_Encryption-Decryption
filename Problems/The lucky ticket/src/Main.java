import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] intValuesFromString = input.chars()
                .map(x -> x - '0')
                .toArray();
        int[] a = Arrays.copyOf(intValuesFromString, intValuesFromString.length-3);
        int[] b = Arrays.copyOfRange(intValuesFromString, 3, intValuesFromString.length);
        System.out.print(Arrays.stream(a).sum() == Arrays.stream(b).sum() ? "Lucky" : "Regular");
    }
}