package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesReport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummarySalesReport implements SalesReport {
    private final String format = "%-20s%-10.2f%-10.2f%-10.2f\n";

    @Override
    public void generateReport(List<Sale> saleList){
        Map<String, Sale> countryMap = new HashMap<>();

        for (Sale sale : saleList) {
            if(!countryMap.containsKey(sale.getCountry())){
                countryMap.put(sale.getCountry(), new Sale(sale.getCountry()));
            }
            Sale totaller = countryMap.get(sale.getCountry());
            totaller.setAmount(totaller.getAmount() + sale.getAmount());
            totaller.setTax(totaller.getTax() + sale.getTax());
            totaller.setShipping((totaller.getShipping() + sale.getShipping()));
        }
        System.out.println("Sales Summary Report");
        System.out.printf("%-20s%-10s%-10s%-10s\n", "Country", "Amount", "Tax", "Shipping");
        for (Sale sale : countryMap.values()) {
            System.out.printf(format, sale.getCountry(), sale.getAmount(), sale.getTax(), sale.getShipping());
        }
    }
}
