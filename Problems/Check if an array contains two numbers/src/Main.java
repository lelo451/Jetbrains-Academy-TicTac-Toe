import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int[] numbers = new int[tam];
        for (int i = 0; i < tam; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean seq = false;
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 < numbers.length &&
                    numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n) {
                seq = true;
                break;
            }
        }
        System.out.println(seq);
    }
}