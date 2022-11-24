import java.util.Arrays;

public class DemoArraysCopyOf {
    public static void main(String[] args) {
        int arr[]={4,6,8};
        arr= Arrays.copyOf(arr, arr.length*2);

        for(int i: arr){
            System.out.println(i);
        }
    }
}
