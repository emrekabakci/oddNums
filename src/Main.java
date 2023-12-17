import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined.
        int num;
        int total = 0;

        //Scanner created.
        Scanner inp = new Scanner(System.in);

        //It will work until an odd number is entered.
        do {
            System.out.print("Enter Number: ");
            num = inp.nextInt();
            if (num % 2 == 0) {
                total += num;
            }
        }
        while (num % 2 == 0);

        System.out.println("Girilen sayıların toplamı: " + total);
    }
}