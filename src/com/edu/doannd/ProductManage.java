package com.edu.doannd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {

    Scanner scanner = new Scanner(System.in);

    private List<Product> productList;
    private List<Category> categoryList;

    public ProductManage() {
        productList = new ArrayList<>();
        categoryList = new ArrayList<>();
    }

    public void addCategoryAndProduct() {
        System.out.print("Enter number of category= ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("CATEGORY " + "[" + (i+1) + "]");
            Category category = new Category();
            category.inputCategory();
            categoryList.add(category);
        }
    }

    public void showInfo() {
        System.out.println("-----------------information---------------------");
        for (Category category : categoryList) {
            System.out.println(category.toString());
            for (Product product : category.getProductList()) {
                System.out.println(product.toString());
            }
            System.out.println("---------------------------------------------");
        }
    }

    public void searchProductByCategoryCode(String categoryCode) {
        for (Category category : categoryList) {
            if (category.getCategoryCode().equals(categoryCode)) {
                for (Product product : category.getProductList()) {
                    System.out.println(product.toString());
                }
            } else {
                System.out.println("Not category code!!!");
            }
        }
    }

    public void updateProduct(String productCode) {
        for(Category category : categoryList) {
            productList = category.getProductList();
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getProductCode().equals(productCode)) {
                    Product product = new Product();
                    product.inputProduct();
                    productList.set(i,product);
                } else {
                    System.out.println("Not1 product code!!!");
                }
            }
        }
    }

    public void deleteProduct(String productCode) {
        for(Category category : categoryList) {
            productList = category.getProductList();
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getProductCode().equals(productCode)) {
                    productList.remove(i);
                } else {
                    System.out.println("Not product code!!!");
                }
            }
        }
    }

    public int totalPrice() {
        int total = 0;
        for (Category category : categoryList) {
            for (Product product : category.getProductList()) {
                total += product.getProductPrice();
            }
        }
        return total;
    }

    public void searchProductFromChina(String productAddress) {
        for (Category category : categoryList) {
            if (category.getCategoryCode().equals(productAddress)) {
                for (Product product : category.getProductList()) {
                    System.out.println(product.toString());
                }
            } else {
                System.out.println("Not product from China!!!");
            }
        }
    }



}
