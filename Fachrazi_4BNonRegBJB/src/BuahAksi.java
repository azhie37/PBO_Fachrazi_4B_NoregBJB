public class BuahAksi {
    public static void main(String[] args) {

        Buah baru = new Buah();
        baru.namabuah = "APEL";
        baru.berat    = 1;
        baru.kondisi  = "BARU/FRESH";
        baru.harga    = 10000;
        System.out.println("Nama Buah    : " + baru.namabuah);
        System.out.println("Berat        : " + baru.berat +(" KG"));
        System.out.println("Kondisi Buah : " + baru.kondisi);
        System.out.println("Harga Buah   : Rp " + baru.harga);

        System.out.println("\n");

        Buah lama = new Buah();
        lama.namabuah = "ANGGUR";
        lama.berat    = 2;
        lama.kondisi  = "LAMA";
        lama.harga    = 15000;
        System.out.println("Nama Buah    : " + lama.namabuah);
        System.out.println("Berat        : " + lama.berat +(" KG"));
        System.out.println("Kondisi Buah : " + lama.kondisi);
        System.out.println("Harga Buah   : Rp " + lama.harga);

        System.out.println("\n");
        lama.mendapatkandiskon();
        System.out.println("Total Belanja 2 BUAH dengan diskon buah lama : Rp " + (baru.harga+ lama.harga));

    }
}
