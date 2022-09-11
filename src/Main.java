import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hava Durumunu Giriniz : ");
        int sicaklik = scan.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz...");
        } else if (sicaklik <= 25) {
            if (sicaklik >= 5 && sicaklik < 10) {
                System.out.println("Sinemaya Gidebilirsiniz...");
            } else if (sicaklik >= 10 && sicaklik <= 15) {
                System.out.println("Sinema veya Pikniğe Gidebilirsiniz...");
            } else {
                System.out.println("Pikniğe Gidebilirsiniz...");
            }
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz...");
        }


    }


}

