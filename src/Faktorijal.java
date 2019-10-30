import java.util.ArrayList;
import  java.util.Scanner;

public class Faktorijal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>brojevi = new ArrayList<>();
        int sum = 0;
        while (true){
            System.out.println("Unesite broje: ");
            int broj = in.nextInt();
            brojevi.add(broj);
            if (broj == 0)break;
        }
        for (Integer broj: brojevi){
            int fakto = 1;
            for (int i = broj; i > 0; i--){
                fakto*=i;
            }
            sum +=fakto;
        }
        System.out.println(sum);
    }
}