public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang"); // menciptkaan objek dengan diawali kata "new", dan nama objeknya adalah "Elang"
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5); // Untuk memanggil sebuah metode di dalam suatu kelas, kita dapat menggunakan (.) (titik) - Elang:Metod; beratHewan:Parameter;
        Elang.jumlahKakiHewan(2); // Elang:Metod; jumlahKakiHewan:Parameter; 2:parameter;
        Elang.cetakHewan(); // Elang:Metod; cetakHewan:Parameter;

        Kucing.beratHewan(2); // Kucing:Metod; beratHewan:Parameter; 2:parameter;
        Kucing.jumlahKakiHewan(4); // Kucing:Metod; jumlahKakiHewan:Parameter; 2:parameter;
        Kucing.cetakHewan(); // Kucing:Metod; cetakHewan:Parameter;
    }
}
