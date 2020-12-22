import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int[] numbers = new int[tam];
        int j = 0;
        for (int i = 0; i < tam; i++) {
            numbers[i] = scanner.nextInt();
        }
        int equal = scanner.nextInt();
        for (int number : numbers) {
            if (equal == number) {
                j++;
            }
        }
        System.out.println(j);
    }
}