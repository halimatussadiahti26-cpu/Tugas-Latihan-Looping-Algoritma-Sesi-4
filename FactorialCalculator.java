import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = 5;
        long faktorial = 1;

        for (int i = 1; i <= N; i++) {
            faktorial = faktorial * i;
        }

        System.out.println(N + "! = " + faktorial);

        input.close();
    }
}

