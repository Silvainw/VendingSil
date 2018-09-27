import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";

//arraylist aangemaakt
    public static ArrayList<String> ProdID =new ArrayList<String>();
    public static ArrayList<String> Cost  = new ArrayList<String>();

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        int id;{

//Producten geadd aan de arraylist
            ProdID.add("Broodje frikandel € 2,15");
            ProdID.add("Snicker € 1,-");
            ProdID.add("Mars € 1,-");
            ProdID.add("Cola € 1,10");
            ProdID.add("Fanta € 1,10");
        }

        String answer;
        do {
//print de eerste zinnetjes
            System.out.println("Voer de prijs van het atikel in om hem te kopen.\n");
            System.out.println("Dit zijn onze artikelen: ");


//print de arraylist
            for (int i = 0; i < ProdID.size(); i++) {
                System.out.println(ProdID.get(i));
            }


            System.out.println("Wat wilt u bestellen? :");
            double price = keyboard.nextDouble();

            // vermedigvuldigd de prijs met het aantal artikelen
            System.out.println("Hoeveel wilt u er?  :");
            int qty = keyboard.nextInt();

            double total = price * qty;

//print de totale kosten die berekend zijn
            System.out.printf("Totale kosten : $%.2f\n", total);

            if (total > 15){

                System.out.println(ANSI_RED + "U heeft te weinig saldo!" );

            }

            System.out.print("Werp het geld nu in.\n");

            System.out.println("wilt u nog iet kopen? Ja of Nee");
          answer = keyboard.next();
        }
        //zorgt ervoor dat als je Ja invoerd dat de do opnieuw start
            while (answer.equals("Ja"));
    }

}




