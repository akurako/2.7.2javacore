import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite pervoe chislo");
        int leftop = in.nextInt();
        boolean cycle = true;
        while (cycle = true) {

            System.out.println("Chto budem delatj? +,-,*,/,c,q");
            char action = in.next().charAt(0);
            System.out.println("VVedite vtoroe chislo");
            int rightop = in.nextInt();

            switch (action) {
                case '+':
                    System.out.println(leftop = leftop + rightop);
                    break;
                case '-':
                    System.out.println(leftop = leftop - rightop);
                    break;
                case '/':
                    System.out.println(leftop = leftop / rightop);
                    break;
                case '*':
                    System.out.println(leftop = leftop * rightop);
                    break;
                case 'c':
                    leftop = 0;
                    cycle = false;
                    break;
                default:
                    System.out.println("Ty vtiraesh mne kakuju-to dich!");
            }
        }
    }


}