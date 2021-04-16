package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.ShippingPolicy;

public class FlatRateDomesticShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        return sale.getCountry().equals("United States") ? 5.99 : sale.getAmount() * .1;
    }
}
