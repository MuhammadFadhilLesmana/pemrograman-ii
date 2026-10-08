package Module2.PRAK203_2510817110006_MuhammadFadhilLesmana;

//Di baris 4, nama class-nya diganti dari "Pegawai" biar nyambung dan nggak error pas dipanggil.
//public class Pegawai {
public class Employee {
    public String name;
    //Baris 9 ini error soalnya tipe data 'char' cuma muat buat satu karakter aja.
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Error di baris 23 gara-gara method nya nggak dikasih parameter buat nangkep datanya.
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}
