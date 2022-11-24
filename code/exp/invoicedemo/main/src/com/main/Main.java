package com.main;

import com.delivery.DeliveryService;
import com.invoice.Invoice;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService=new DeliveryService();
       List<Invoice> invoices=  deliveryService.processInvoices();
    }
}