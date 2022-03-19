import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature : ");
        byte temp = (byte)sc.nextInt();
        System.out.println(temp);
        double temp_in_celcius = (double)(temp-32)/1.8;
        System.out.println(temp_in_celcius);
    }
}
