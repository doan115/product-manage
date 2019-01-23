package com.edu.doannd;

import java.util.Scanner;

public class Product {

    private String productCode;
    private String productName;
    private int productPrice;
    private String productAddress;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductAddress() {
        return productAddress;
    }

    public void setProductAddress(String productAddress) {
        this.productAddress = productAddress;
    }

    public void inputProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product code: ");
        this.productCode = scanner.nextLine();
        System.out.print("Enter product name: ");
        this.productName = scanner.nextLine();
        System.out.print("Enter product price: ");
        this.productPrice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter product address: ");
        this.productAddress = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "\n" + "PRODUCT:     " + "[code]= " + productCode + "     " + "[name]= " + productName + "     " + "[price]= " + productPrice+ "     " + "[address]= " + productAddress;
    }
}
