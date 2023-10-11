import java.util.Scanner;
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        boolean again = false;
        String a = "";
        do {


            System.out.print("Enter a move player A [R,P,S]: ");
            playerA = in.nextLine();

            if (playerA.equalsIgnoreCase("R")) {
                System.out.println("PlayerA move was Rock!");

            } else if (playerA.equalsIgnoreCase("P")) {
                System.out.println("PlayerA move was Paper!");
            } else if (playerA.equalsIgnoreCase("S")) {
                System.out.println("PlayerA move was Scissors! ");
            } else {
                System.out.println("Invalid move. Please try again. ");
            }
            System.out.print("Enter a move player B [R,P,S]: ");
            playerB = in.nextLine();

            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("PlayerB move was Rock!");

            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.println("PlayerB move was Paper!");
            } else if (playerB.equalsIgnoreCase("S")) {
                System.out.println("PlayerB move was Scissors! ");
            } else {
                System.out.println("Invalid move. Please try again. ");
            }
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock. Its a TIE! ");

                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper Covers Rock. PlayerB WINS! ");

                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock smashes Scissors. PlayerA WINS! ");

                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. PlayerA WINS! ");

                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper. Its a TIE! ");

                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper. PlayerB WINS! ");

                }
            } else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock smashes Scissors. PlayerB WINS! ");

                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper. PlayerA WINS! ");

                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors. ITS A TIE! ");

                }
            }
        System.out.print("Do you want ot play again? [Y or N]: ");
        a = in.nextLine();
        if(a.equalsIgnoreCase("N"))
        {
         again = true;
        }


        }while(!again);


    }


}

