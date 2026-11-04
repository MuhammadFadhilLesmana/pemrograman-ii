package Module4.PRAK403_2510817110006_MuhammadFadhilLesmana;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String race) {
        this.name = name;
        this.breed = race;
    }

    public void display() {
        System.out.println("Detail hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + name);
        System.out.println("Dengan ras: " + breed);
    }
}

