package com.empapp.dao;

public class Project {
    private  int pid;
    private String pname;
    private double pcost;

    public Project(int pid, String pname, double pcost) {
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
    }

    public Project( ) {}

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPcost() {
        return pcost;
    }

    public void setPcost(double pcost) {
        this.pcost = pcost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Project{");
        sb.append("pid=").append(pid);
        sb.append(", pname='").append(pname).append('\'');
        sb.append(", pcost=").append(pcost);
        sb.append('}');
        return sb.toString();
    }
}
