package ADT_202253120;

public class catty {
    String Nama;
    int jumlahMakan;
    int jumlahAnak;
    String Warna;
    String Ras_Kucing;

    public catty(String Nama, int jumlahMakan, int jumlahAnak, String Warna, String Ras_Kucing) {
        this.Nama = Nama;
        this.jumlahMakan = jumlahMakan;
        this.jumlahAnak = jumlahAnak;
        this.Warna = Warna;
        this.Ras_Kucing = Ras_Kucing;

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getJumlahMakan() {
        return jumlahMakan;
    }

    public void setJumlahMakan(int jumlahMakan) {
        this.jumlahMakan = jumlahMakan;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getRasKucing() {
        return Ras_Kucing;
    }

    public void setRasKucing(String Ras_Kucing) {
        this.Ras_Kucing = Ras_Kucing;
    }

    public void print() {
        System.out.println("My Cat's name is " + Nama);
        System.out.println("it is " + Ras_Kucing + " with a " + Warna + " color");
        System.out.println("I give it some food for " + jumlahMakan + " times a day");
        System.out.println("And it has " + jumlahAnak + " little cute kitty now.\n");
    }

    public static void main(String[] args) {
        catty missy = new catty("missy", 3, 7, "white", "Angora");
        missy.print();
        catty mesi = new catty("mesi", 1, 50, "orange", "kampung");
        mesi.print();
    }

}
