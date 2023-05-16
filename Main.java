import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Jumlah Array (Jumlah Angka)
        System.out.print("Input Jumlah Angka : ");
        int jmlhData = input.nextInt();

        // Input Data
        int[] Data = new int[jmlhData];
        for (int i = 0; i < Data.length; i++) {
            System.out.print("Input Data: ");
            Data[i] = input.nextInt();
        }

        Arrays.sort(Data);
        boolean foundZero = false;
        for (int i = 1; i < Data.length; i++) {
            Data[i] -= Data[i - 1];
            if (Data[i] == 0) {
                foundZero = true;
                break;
            }
        }

        // Menampilkan hasil
        System.out.println(foundZero ? "True" : "False");
}
}