package com.customerapp.dao.country;

public class Country {
   private int cid;
   private  String cname;

    public Country() {}

    public Country(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("cid=").append(cid);
        sb.append(", cname='").append(cname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
