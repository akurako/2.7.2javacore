import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        boolean main_cycle = true;
        boolean inner_cycle;
        int leftop = 0;
        int rightop = 0;
        char action = 0;
        Scanner in = new Scanner(System.in);
        while (main_cycle == true) {
            System.out.println("Vvedite pervoe chislo");
            leftop = leftop + in.nextInt();
            inner_cycle = true;

            while (inner_cycle == true) {

                System.out.println("Chto budem delatj? +,-,*,/,c,q");
                action = in.next().charAt(0);
                if (action == 'c') {
                    leftop = 0;
                    break;
                }
                    else
                        if (action == 'q') {
                            inner_cycle = false;
                            main_cycle = false;
                            break;
                        }
                    System.out.println("Vvedite vtoroe chislo");
                    rightop = in.nextInt();

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
                        default:
                            System.out.println("Ty vtiraesh mne kakuju-to dich!");
                            inner_cycle = false;
                    }
                }
            }
        }
    }
