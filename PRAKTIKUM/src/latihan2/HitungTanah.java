package latihan2;

import java.util.Scanner;

// Class Tanah untuk merepresentasikan objek tanah
class Tanah {
    // Harga tanah per meter persegi
    double hargaPerMeter = 5000000;

    // Method untuk menghitung total harga
    double hitungTotalHarga(double luas) {
        return luas * hargaPerMeter;
    }
}

public class HitungTanah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Meminta input luas tanah dari user
        System.out.print("Masukkan luas tanah (m^2): ");
        double luasTanah = input.nextDouble();

        // 2. Membuat 1 OBJEK dari class Tanah
        Tanah tanahSinta = new Tanah();

        // 3. Menghitung total harga menggunakan method dari objek tanahSinta
        double totalHarga = tanahSinta.hitungTotalHarga(luasTanah);

        // 4. Menampilkan hasil output
        System.out.println("----------------------------------------");
        System.out.println("Luas tanah        : " + luasTanah + " m^2");
        System.out.println("Harga per m^2     : Rp 5.000.000");
        System.out.printf("Total harga tanah : Rp %,.2f\n", totalHarga);
        System.out.println("----------------------------------------");

        input.close();
    }
}