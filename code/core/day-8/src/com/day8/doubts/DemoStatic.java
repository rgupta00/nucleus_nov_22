package com.day8.doubts;

class  Player{
    private  int id;
    private String name;
    private static  int idCounter=0;

    public Player(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
public class DemoStatic {
    public static void main(String[] args) {
        Player player=new Player("ravi");
        Player player2=new Player("rajit");
        Player player3=new Player("foo");
        Player player4=new Player("bar");


        System.out.println(player);
        System.out.println(player2);

        System.out.println(player3);

        System.out.println(player4);




    }
}
