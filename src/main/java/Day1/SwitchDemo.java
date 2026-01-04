package Day1;

public class SwitchDemo {
    public static void main(String[] args) {
        int monthnumber=9;
        String Monthname ="";
        switch (monthnumber){
            case 1:
                Monthname = "Jan";
                break;
            case 2:
                Monthname = "Feb";
                break;
            case 4:
                Monthname = "apr";
                break;
            default:
                Monthname = "NF";
                break;


        }
        System.out.println(monthnumber + "->"+ Monthname);


    }
}
