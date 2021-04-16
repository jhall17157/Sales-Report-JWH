package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale){return 0;}
}
