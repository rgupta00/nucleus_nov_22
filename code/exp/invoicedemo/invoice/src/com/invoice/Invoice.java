package com.invoice;

public class Invoice {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Invoice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Invoice{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
