package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> saleList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String input = "Y";
        while (input.equalsIgnoreCase("Y")){
            System.out.println("Customer Name: ");
            String name = keyboard.nextLine();
            System.out.println("Country: ");
            String country = keyboard.nextLine();
            System.out.println("Amount: ");
            double amount = Double.parseDouble(keyboard.nextLine());
            System.out.println("Tax: ");
            double tax = Double.parseDouble(keyboard.nextLine());
            Sale sale = new Sale(name, country, amount, tax);
            saleList.add(sale);
            System.out.println("Add another?");
            input = keyboard.nextLine();
        }
        return saleList;
    }
}
