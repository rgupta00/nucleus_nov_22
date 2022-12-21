package com.customerapp.dao.country;

public class State {
   private int sid;
   private  String sname;

    public State() {}

    public State(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("State{");
        sb.append("sid=").append(sid);
        sb.append(", sname='").append(sname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
