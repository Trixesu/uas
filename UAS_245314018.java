package uas_245314018;
import java.util.Scanner;
public class UAS_245314018 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mahasiswa : ");
    int n = input.nextInt();
    String nama = "";
    double uts1 = 0, uts2 = 0, uas = 0;
    
    for (int i = 1; i <= n; i++) {
        System.out.print("Nama        : ");
        nama = input.next();
        System.out.print("Nilai UTS 1 : ");
        uts1 = input.nextInt();
        System.out.print("Nilai UTS 2 : ");
        uts2 = input.nextInt();
        System.out.print("Nilai UAS   : ");
        uas = input.nextInt();
        System.out.println();
    }
        double nilaiFinal = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
        
        String grade;
        if (nilaiFinal >= 80) {
           grade = "A";
        } else if (65 <= nilaiFinal && nilaiFinal < 80) {
           grade = "B";
        } else if (55 <= nilaiFinal && nilaiFinal < 65) {
           grade = "C";
        } else if (45 <= nilaiFinal && nilaiFinal < 45) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("--------------------------------------");
        System.out.println("No.\tNama\t\tNilai\tGrade");
        System.out.println("======================================");
        for (int j = 1; j <= n; j++) {
            System.out.println(j+"\t"+nama+"\t\t"+(int)nilaiFinal+"\t"+grade);
        }
        System.out.println("--------------------------------------");
    input.close();
    }
}