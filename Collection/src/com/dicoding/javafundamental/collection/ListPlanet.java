import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        // heroes[2] = "ziya"; // pasti error ArrayIndexOutOfBoundsException karen ukuran Array diluar ketentuan [2] diatas

        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // methode .add() digunakan untuk menambahkan objek kedalam list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planets awal:");
        for (int i = 0; i < planets.size(); i++) { // methode .size() digunakan untuk mendapatkan ukuran list
            System.out.println("\t index-" + i + " = " + planets.get(i)); // methode .get() digunakan untuk melihat isi list pada index ke-i
        }

        planets.remove("venus"); // methode .remove() digunakan untuk mengeluarkan objek dari list 

        System.out.println("List planets terakhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}
