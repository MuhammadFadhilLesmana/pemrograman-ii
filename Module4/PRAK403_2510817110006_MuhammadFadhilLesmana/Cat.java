package Module4.PRAK403_2510817110006_MuhammadFadhilLesmana;

public class Cat extends Pet {
    private String furColor;

    public Cat(String name, String breed, String furColor) {
        super(name, breed);
        this.furColor = furColor;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
    }
}
