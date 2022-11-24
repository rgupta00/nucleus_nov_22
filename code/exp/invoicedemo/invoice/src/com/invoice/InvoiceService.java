package com.invoice;
import java.util.*;
public class InvoiceService {
    public List<Invoice> getAll(){
        List<Invoice> invoices=List.of(new Invoice("nu training"), new Invoice("kronos training"));
        return invoices;
    }
}
