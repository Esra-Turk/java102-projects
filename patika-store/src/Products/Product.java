package Products;

import Trademark.Trademark;

public abstract class Product {
    private String productName;
    private int amountOfStock;
    private int ram;
    private int storage;
    private double unitPrice;
    private double discountRate;
    private double screenSize;
    private Trademark tradeMark;

    public Product(String productName,int amountOfStock, int ram, int storage, double unitPrice, double discountRate, double screenSize, Trademark tradeMark) {
        this.amountOfStock = amountOfStock;
        this.ram = ram;
        this.storage = storage;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.screenSize = screenSize;
        this.productName = productName;
        this.tradeMark = tradeMark;
    }


    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Trademark getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(Trademark tradeMark) {
        this.tradeMark = tradeMark;
    }
}
