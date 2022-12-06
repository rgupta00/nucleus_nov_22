package com.doubts;

public class Demo {
    private  static int temp=77;
    static  class MyDemo{
        String data;

        public MyDemo(String data) {
            this.data = data;
        }

        public void foof(){
            System.out.println(temp);
        }
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("MyDemo{");
            sb.append("data='").append(data).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

}
