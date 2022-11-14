class Cal{
    int add(int ...a){
        System.out.println("int add(int ...a)");
        int sum=0;
        for(int temp: a){
            sum+=temp;
        }
        return sum;
    }

    Integer add(Integer a, Integer b){
        System.out.println("int add(int a, int b) ");
        return a+b;
    }

}

public class FunctionOverloading {

    public static void main(String[] args) {
        Cal cal=new Cal();
        long sum=cal.add(3,5);
        System.out.println(sum);
    }
}
