import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                jumlah += i;

            }
        }
        System.out.println("Sum of ven numbers = " + jumlah);

        input.close();
    }
}

    

