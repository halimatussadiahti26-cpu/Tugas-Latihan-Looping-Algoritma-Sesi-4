
public class PrimeNumbers {

    public static void main(String[] args) throws Exception{
        int N = 20;

        System.out.println("Bilangan prima dari 2 sampai " + N + ":");

        for (int angka = 2; angka <= N; angka++) {
            boolean prima = true;

            for (int pembagi = 2; pembagi <= Math.sqrt(angka); pembagi++) {
                if (angka % pembagi == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(angka + " ");
            }
        }

        System.out.println();
    }
}
