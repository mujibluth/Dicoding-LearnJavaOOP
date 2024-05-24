public class Hewan { // nama kelas nya adalah hewan
    String nama; // String nama; merupakan sebuah atribut/ properties/ fields
    int berat; 
    int jumlahKaki;

    // Ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan(String namaHewan) { // 'Hewan'() adalah sebuah metod/function(sama saja), dan (String 'namaHewan') adalah sebuah parameter
        nama = namaHewan;
    }
    // end of constructor

    public void beratHewan(int beratHewan) { // 'beratHewan'() adalah sebuah metod/function(sama saja), dan (int 'beratHewan') adalah sebuah parameter
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan) { // 'jumlahKakiHewan'() adalah sebuah metod/function(sama saja), dan (int 'jumlahKakiHewan') adalah sebuah parameter
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() { // cetakHewan adalah sebuah metod/function(sama saja)
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat + " kg");
        System.out.println("Jumlah kaki : " + jumlahKaki);
    }
}
