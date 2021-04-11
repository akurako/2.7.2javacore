import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        int program_state = 1;
        float leftop = 0;
        float rightop = 0;
        char action = 0;
        Scanner in = new Scanner(System.in);
        while (program_state >= 1) {
            System.out.println("Vvedite pervoe chislo");
            leftop += in.nextInt();
            program_state = 2;

            while (program_state == 2) {
                System.out.println("Chto budem delatj? +,-,*,/,c,q");
                action = in.next().charAt(0);

                switch (action) {
                    case 'q':
                        program_state = 0;
                        break;
                    case 'c':
                        leftop = 0;
                        program_state = 1;
                        break;
                    case '+', '-', '*', '/': {

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
                                if (rightop == 0) {
                                    System.out.println("Delitj na 0 nelzja!");
                                }
                                else {
                                    System.out.println(leftop = leftop / rightop);
                                }
                                break;
                            case '*':
                                System.out.println(leftop = leftop * rightop);
                                break;
                        }
                        break;
                    }
                    default:
                        System.out.println("Ty vtiraesh mne kakuju-to dich!");
                        program_state = 2;
                }
            }
        }
    }
}
