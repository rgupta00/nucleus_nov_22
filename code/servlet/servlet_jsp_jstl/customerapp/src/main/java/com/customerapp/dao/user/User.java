package com.customerapp.dao.user;

public class User {
   private int id;
    private  String name;
    private String password ;
   private String profile;

    public User(int id, String name, String password, String profile) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.profile = profile;
    }

    public User(String name, String password, String profile) {
        this.name = name;
        this.password = password;
        this.profile = profile;
    }

    public User() {
  }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", profile='").append(profile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
