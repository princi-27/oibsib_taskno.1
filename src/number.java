import java.util.Scanner;

public class number {
    static int res = 0;

    public static int generateNumber() {
        int min = 1, max = 100;
        int range = max - min + 1;
        int ran_no = (int) (Math.random() * range) + min;
        return ran_no;
    }

    public static int result(int total, int tries) {
        int sc = total - (tries * 10);
        return sc;
    }

    public static boolean round1(){
        Scanner scq = new Scanner(System.in);
        int tries = 0 ;
        int odd = generateNumber();
        System.out.println("round one \n");
        System.out.println("starting...");
        System.out.println("the number is \n");
        while(tries<6){
            System.out.println("\n guessing your number");
            int guess = scq.nextInt();
            if(guess>0&& guess <101){
                if(guess<odd){
                    tries++;
                    System.out.println("\n your guessing number is lower from actual.");

                }
                else if(guess>odd){
                    tries++;
                    System.out.println("\n your guessing number is higher from actual.");
                }
                else if(guess== odd){
                    res = result(100,tries);
                    tries++;
                    System.out.println("\n congrats.... this attempt is right"+tries+" the attempt with the score ("+res+")");
                    break;
                }
            }
                else {
                    tries++;
                    System.out.println("\n please try again");

                }
            }
                if (res>30)
                    return true;
                return false;
            }

    public static boolean round2() {
                Scanner scq = new Scanner(System.in);
                res =0;
                int tries=0;
                int odd = generateNumber();
                System.out.println("round two \n");
                System.out.println("the number is \n");
                 while(tries<4){
                    System.out.println("\n guessing your number");
                    int guess = scq.nextInt();
                    if(guess>0&& guess <101){
                        if(guess<odd){
                            tries++;
                            System.out.println("\n your guessing number is lower from actual.");

                }
                else if(guess>odd){
                    tries++;
                    System.out.println("\n your guessing number is higher from actual.");
                }
                else if(guess== odd){
                    res = result(100,tries);
                    tries++;
                    System.out.println("\n congrats.... this attempt is right"+tries+" the attempt with the score ("+res+")");
                    break;
                }
            }
                else{
                    tries++;
                    System.out.println("\n please try again");

                }

            }
            if (res>50)
                    return true;
                return false;
            }

    public static boolean round3() {
                Scanner scq = new Scanner(System.in);
                res =0;
                int tries=0;
                int odd = generateNumber();
                System.out.println("round two \n");
                System.out.println("the number is \n");
                while(tries<3){
                    System.out.println("\n guessing your number");
                    int guess = scq.nextInt();
                    if(guess>0&& guess <101){
                        if(guess<odd){
                            tries++;
                            System.out.println("\n your guessing number is lower from actual.");

                }
                else if(guess>odd){
                    tries++;
                    System.out.println("\n your guessing number is higher from actual.");
                }
                else if(guess== odd){
                    res = result(100,tries);
                    tries++;
                    System.out.println("\n congrats.... this attempt is right"+tries+" the attempt with the score ("+res+")");
                    break;
                }
            }
                else{
                    tries++;
                    System.out.println("\n please try again");

                }

            }
            if (res>70)
                    return true;
                return false;
            }

    public static void main(String[] args) {
        boolean r_first = round1();
        if (r_first) {
            System.out.println("\n congrats you have cleared the first round \n\n now move towards the second round");
            boolean r_second = round2();
            if (r_second) {
                System.out
                        .println("\n congrats you have cleared the second round\n\n now move towards the final round ");
                boolean r_third = round3();
                if (r_third) {
                    System.out.println("hurrah you won the game");

                } else
                    System.out.println("\n you lost in final round");
            } else
                System.out.println("\n you lost in second round");
        } else
            System.out.println("\n you lost in first game");
    }
}