package edu.wctc.sales.iface;

import edu.wctc.sales.Sale;

import java.util.List;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}