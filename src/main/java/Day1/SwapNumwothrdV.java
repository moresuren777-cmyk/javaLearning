package Day1;

public class SwapNumwothrdV {

    public static void main(String[] args) {
        int i = 10;
        int j =7;

        System.out.println("i & j before swap is =" + " i = " + i + " j =" + j);

        i = i + j;
        j = i - j;
        i = i - j;

        System.out.println("i & j After swap is =" + " i = " + i + " j =" + j);


    }
}
