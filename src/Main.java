import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //zorgt voor rode text bij een foutmelding
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    //dit zijn alle aangemaakte arratlists
    public static ArrayList<String> ProdID =new ArrayList<String>();
    public static ArrayList<String> ProdDrinken =new ArrayList<String>();
    public static ArrayList<String> Bestelling =new ArrayList<String>();

    public Scanner sc = new Scanner(System.in);
    //zet de kosten van de producten
    public double[] cost = {2.15, 1.00, 1.00, 1.10, 1.10};
    public int id;
    public String answer;
    //zet het begin budet
    public double budget = 15;

    public static void main(String[] args) {

        Main main = new Main();
        main.start();

    }

    public void start() {

        //add producten aan de arraylist
        ProdID.add("Gevulde koek €" + cost[0] );
        ProdID.add("Maltesers €" + cost[1] );
        ProdID.add("Snicker €" + cost[2] );
        ProdDrinken.add("Fanta €" + cost[3] );
        ProdDrinken.add("Aquarius €" + cost[4] );

        do {
            //print de eerste zinnetjes
            System.out.println("Goedendag\n");
            System.out.println("Wilt u wat eten of drinken?");
            System.out.println("1.Eten  2.Drinken");

            Scanner scan = new Scanner(System.in);
            int EtenDrinken = scan.nextInt();
            //1 = Eten  2 = Drinken
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
                    System.out.println(i + 4 + ". " + ProdDrinken.get(i));
                }
            }

            //geeft aan wat je budget is
            System.out.println("Wat wilt u bestellen? uw budget is €" + budget);

            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[0];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[0]);
                    System.out.print("Werp het geld nu in.\n");

                    //voegt je keuze toe aan een array
                    Bestelling.add("{====================}");
                    Bestelling.add("(=====Gevuldekoek====)");
                    Bestelling.add("{====================}\n");


                break;

                case 2:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[1];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[1]);
                    System.out.print("Werp het geld nu in.\n");

                    //voegt je keuze toe aan een array
                    Bestelling.add("[=============]");
                    Bestelling.add("[==MALTESERS==]");
                    Bestelling.add("[=============]\n");

                    break;

                case 3:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[2];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[2]);
                    System.out.print("Werp het geld nu in.\n");

                    //voegt je keuze toe aan een array
                    Bestelling.add("[=============]");
                    Bestelling.add("[===SNICKER===]");
                    Bestelling.add("[=============]\n");

                    break;

                case 4:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[3];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[3]);
                    System.out.print("Werp het geld nu in.\n");

                    //voegt je keuze toe aan een array
                    Bestelling.add("(----------)");
                    Bestelling.add("|==========|");
                    Bestelling.add("|==FANTA===|");
                    Bestelling.add("|==========|");
                    Bestelling.add("(----------)\n");

                    break;

                case 5:
                    //haalt de kosten van het product van het budget af
                    budget -= cost[4];
                    System.out.println("Uw nieuwe budget is " + "€" + budget);
                    //print de totale kosten die berekend zijn
                    System.out.printf("Totale kosten : €%.2f\n", cost[4]);
                    System.out.print("Werp het geld nu in.\n");

                    //voegt je keuze toe aan een array
                    Bestelling.add("(------------)");
                    Bestelling.add("|============|");
                    Bestelling.add("|==AQUARIUS==|");
                    Bestelling.add("|============|");
                    Bestelling.add("(------------)\n");

                    break;
            }

            if (budget < 0) {
                //stopt met executen als het budget onder 0 euro is
                System.out.println(ANSI_RED + "U heeft te weinig saldo!");
                System.out.println("Neem uw geld terug." + ANSI_RESET);
                System.exit(1);

            }

            System.out.println("wilt u nog iet kopen? Ja of Nee");
            answer = sc.next();
        }
        //zorgt ervoor dat als je Ja invoerd dat de do opnieuw start
        while (answer.equalsIgnoreCase("ja")) ;
        if (answer.equalsIgnoreCase("nee")) {

            //print je bestelling in ascii art en daarna sluit hij af
            Bestelling.forEach(System.out::println);
            System.out.println("Bedankt voor uw aankoop!");
            System.out.println("Fijne dag verder!");
            //Geeft aan hoeveel euro je overhebt
            System.out.println("Uw heeft € " + budget + " over");
            System.exit(1);
        }

        }

    }





