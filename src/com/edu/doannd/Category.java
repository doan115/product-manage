package com.edu.doannd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {

    private String categoryCode;
    private String categoryName;
    private List<Product> productList = new ArrayList<>();

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void inputCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter category code: ");
        this.categoryCode = scanner.nextLine();
        System.out.print("Enter category name: ");
        this.categoryName = scanner.nextLine();

        System.out.println("--------- Enter product corresponding category--------");
        System.out.print("Enter number of product: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("PRODUCT " + "[" + (i+1) + "]");
            Product product = new Product();
            product.inputProduct();
            this.productList.add(product);
            System.out.println("------------------------------");
        }
    }

    @Override
    public String toString() {
        return "\n" + "CATEGORY:     " + "[code]= " + categoryCode + "     " + "[name]= " + categoryName;
    }

}
