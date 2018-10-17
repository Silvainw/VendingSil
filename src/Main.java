import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static HashMap<String, Double> items = new HashMap<String, Double>();
    public static ArrayList<String> ProdID =new ArrayList<String>();
    public static ArrayList<String> ProdDrinken =new ArrayList<String>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] cost = {2.15, 1.00, 1.00, 1.10, 1.10};




        int id;
        {

//Producten geadd aan de arraylist
            ProdID.add("Broodje frikandel" + " " + " €" + cost[0] );
            ProdID.add("Snicker" + " " + " €" + cost[1] );
            ProdID.add("Mars €" + cost[2] );
            ProdDrinken.add("Cola" + " " + " €" + cost[3] );
            ProdDrinken.add("Fanta" + " " + " €" + cost[4] );
        }


        String answer;
        do {
//print de eerste zinnetjes
            System.out.println("Goedendag\n");
            System.out.println("Wilt u wat eten of drinken?");
            System.out.println("1.Eten  2.Drinken");

            Scanner scan = new Scanner(System.in);
            int EtenDrinken = scan.nextInt();
            //1 == Eten  2 == Drinken

            System.out.println("Voer het nummer in van het product.\n");
            System.out.println("Dit zijn onze artikelen: ");


//print de arraylist eten
            if (EtenDrinken == 1) {
                for (int i = 0; i < ProdID.size(); i++) {
                    System.out.println(i + 1 + ". " + ProdID.get(i));
                }
            }
//print de arraylist drinken
            if (EtenDrinken == 2) {
                for (int i = 0; i < ProdDrinken.size(); i++) {
                    System.out.println(i + 1 + ". " + ProdDrinken.get(i));
                }
            }
            double budget = 15;
            System.out.println("Wat wilt u bestellen? uw bedget is €" + budget);

            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    budget = 15-cost[0];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[0]);
                    System.out.print("Werp het geld nu in.\n");
                    System.out.println("----------");
                    System.out.println("(=========)");
                    System.out.println("----------");


                break;

                case 2:
                budget = 15-cost[1];
                System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[1]);
                    System.out.print("Werp het geld nu in.\n");
                break;

            }

            if (budget < 0) {
//stopt met executen als het bedrag boven het budget is
                System.out.println(ANSI_RED + "U heeft te weinig saldo!");
                System.out.println("Neem uw geld terug." + ANSI_RESET);
                System.exit(1);

            }

            System.out.println("wilt u nog iet kopen? Ja of Nee");
            answer = sc.next();
        }
        //zorgt ervoor dat als je Ja invoerd dat de do opnieuw start
        while (answer.equals("Ja")) ;
    }

}




