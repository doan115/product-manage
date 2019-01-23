package com.edu.doannd;

import java.util.Scanner;

public class Main {

    private void showMenu() {
        int option;
        Scanner scanner = new Scanner(System.in);
        ProductManage productManage = new ProductManage();
        do {
            System.out.println("-----------------------menu-----------------------");
            System.out.println("0.Exit");
            System.out.println("1.Add category and product");
            System.out.println("2.Show Information");
            System.out.println("3.Search product with category code");
            System.out.println("4.Update product information");
            System.out.println("5.Delete product");
            System.out.println("6.Total price");
            System.out.println("7.Search products has address China");
            System.out.println("-------------------------------------------------");
            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    productManage.addCategoryAndProduct();
                    break;
                case 2:
                    productManage.showInfo();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("[Search] Enter category code: ");
                    String categoryCode = scanner.nextLine();
                    productManage.searchProductByCategoryCode(categoryCode);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("[Update]Enter product code: ");
                    String productCode = scanner.nextLine();
                    productManage.updateProduct(productCode);
                    break;
                case 5:
                    System.out.println("[Delete] Enter product code: ");
                    String productCodeDelete = scanner.nextLine();
                    productManage.deleteProduct(productCodeDelete);
                    break;
                case 6:
                    System.out.println("Total price: " + productManage.totalPrice());
                    break;
                case 7:
                    productManage.searchProductFromChina("China");
                    break;
                default:
                    System.out.println("---> Wrong option");
                    break;
            }
        } while(option != 0);
    }

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.showMenu();
    }

}
