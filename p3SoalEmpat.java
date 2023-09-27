package Praktikum;

import java.util.Scanner;

public class p3SoalEmpat {
  public static void main(String[] args) {
    Scanner toko = new Scanner(System.in);
    int beli, waktu, semangka, diskon;
    semangka = 100000;
    System.out.print("Enter Jumlah pembelian : ");
    beli = toko.nextInt();
    System.out.print("Enter Waktu : ");
    waktu = toko.nextInt();
    System.out.println("==================");
    semangka *= beli;
    if (beli > 0 && waktu > 0) {
      if (waktu <= 420) {
        if (waktu >= 40) {
          diskon = semangka * 5 / 100;
          System.out.println("Hasil pembelian : Rp" + (semangka - diskon));
          System.out.println("Jumlah pembelian : " + beli);
          System.out.println("Stok tersisa : " + (150 - beli));
        } else {
          System.out.println("Hasil pembelian : Rp" + semangka);
        }
      } else {
        System.out.println("Toko telah tutup!");
      }
    } else {
      System.out.println("ERROR - Inputan invalid!");
    }
    toko.close();
  }
}
