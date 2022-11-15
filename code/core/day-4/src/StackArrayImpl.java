public class StackArrayImpl implements Stack {
    private final int[] arr;
    private  int top;
    private static final int SIZE=5;
    public StackArrayImpl(){
        arr=new int[SIZE];
        top=-1;
    }

    public void push(int data){
        if(top==SIZE-1){
            System.out.println("stack is full");
            return;
        }
        arr[++top]=data;
    }

    public int pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return -999;
        }
        return  arr[top--];
    }

}
