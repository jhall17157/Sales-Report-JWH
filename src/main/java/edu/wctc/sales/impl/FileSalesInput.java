package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> saleList = new ArrayList<>();

        try {
            Scanner read = new Scanner(new File("sales.txt"));
            while (read.hasNext()) {
                String[] line = read.nextLine().split(",");
                Sale sale = new Sale(line[0], line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]));
                saleList.add(sale);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return saleList;
    }
}
