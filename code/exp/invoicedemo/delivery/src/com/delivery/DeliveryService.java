package com.delivery;
import com.invoice.Invoice;
import com.invoice.InvoiceService;

import  java.util.*;
public class DeliveryService {
    private InvoiceService invoiceService=new InvoiceService();
    public List<Invoice> processInvoices(){

        List<Invoice> invoices=invoiceService.getAll();
        invoices.forEach(i-> System.out.println(i));
        return invoices;
    }
}
