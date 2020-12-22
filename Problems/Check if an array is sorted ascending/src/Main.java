import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int[] numbers = new int[tam];
        int[] orded = new int[tam];
        for (int i = 0; i < tam; i++) {
            numbers[i] = scanner.nextInt();
            orded[i] = numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.equals(numbers, orded));
    }
}