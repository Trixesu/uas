package uas_245314018;
import java.util.Scanner;
public class UAS_245314018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = input.nextInt();
        input.nextLine();

        String[] nama = new String[n];
        double[] nilaiFinal = new double[n];
        int[] distribusi = new int[5];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + " : ");
            nama[i] = input.nextLine();

            System.out.print("Masukkan nilai UTS 1 : ");
            double uts1 = input.nextDouble();

            System.out.print("Masukkan nilai UTS 2 : ");
            double uts2 = input.nextDouble();

            System.out.print("Masukkan nilai UAS : ");
            double uas = input.nextDouble();
            input.nextLine();
            
            nilaiFinal[i] = 0.3 * uts1 + 0.3 * uts2 + 0.4 * uas;
            
            char huruf = konversi(nilaiFinal[i]);
            if (huruf == 'A') distribusi[0]++;
            else if (huruf == 'B') distribusi[1]++;
            else if (huruf == 'C') distribusi[2]++;
            else if (huruf == 'D') distribusi[3]++;
            else if (huruf == 'E') distribusi[4]++;
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("-------------------------------------------");
        System.out.println("No.\tNama\t\tNilai\t\tHuruf");
        System.out.println("===========================================");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1)+"\t"+nama[i]+"\t\t"+nilaiFinal[i]+"\t\t"+konversi(nilaiFinal[i]));
        }

        System.out.println("-------------------------------------------");

        System.out.println("Distribusi Nilai");
        System.out.println("A = " + distribusi[0] + " mahasiswa");
        System.out.println("B = " + distribusi[1] + " mahasiswa");
        System.out.println("C = " + distribusi[2] + " mahasiswa");
        System.out.println("D = " + distribusi[3] + " mahasiswa");
        System.out.println("E = " + distribusi[4] + " mahasiswa");

        input.close();
    }
    public static char konversi(double nilaiFinal) {
        if (nilaiFinal >= 80) return 'A';
        else if (nilaiFinal >= 65) return 'B';
        else if (nilaiFinal >= 55) return 'C';
        else if (nilaiFinal >= 45) return 'D';
        else return 'E';
    }
}
