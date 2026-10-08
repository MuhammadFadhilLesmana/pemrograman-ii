package Module2.PRAK201_2510817110006_MuhammadFadhilLesmana;

public class Fruit {
    private String fruitName;
    private double unitWeight;
    private double unitPrice;
    private double totalPurchase;

    public Fruit(String fruitName, double unitWeight, double unitPrice, double totalPurchase) {
        this.fruitName = fruitName;
        this.unitWeight = unitWeight;
        this.unitPrice = unitPrice;
        this.totalPurchase = totalPurchase;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + fruitName);
        System.out.println("Berat: " + unitWeight);
        System.out.println("Harga: " + unitPrice);
        System.out.println("Jumlah Beli: " + totalPurchase + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getPreDiscountPrice());
        System.out.printf("Total Diskon: Rp%.2f\n", getDiscountTotal());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return (totalPurchase / unitWeight) * unitPrice;
    }

    public double getDiscountTotal() {
        double totalBlock = Math.floor(totalPurchase / 4);
        return totalBlock * 0.02 * unitPrice * 4;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}