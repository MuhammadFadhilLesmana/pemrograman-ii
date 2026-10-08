package Module2.PRAK203_2510817110006_MuhammadFadhilLesmana;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        //Baris 9 ini error soalnya kurang titik koma (;) di akhirnya.
        //e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //Di baris 13 kode umur diisi
        e.age = 17;

        //Baris 17 ini disesuaikan biar outputnya sama persis kayak permintaan soal.
        //System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        //Baris 22 dikasih tambahan kata "tahun" di belakang umur menyesuaikan hasil tabel.
        //System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}
