package pl.edu.pk.quadrateam;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main (String[]args) {
        Scanner odczyt = new Scanner(System.in);
        Integer activities_num = 0;
        Activity[] tab_activities = new Activity[10]; //max liczba zadań
        System.out.println("\n\n#HARMONOGRAM ZADAŃ#\n\n");
        while (true) {
            String str;
            Integer menu;
            Integer i = 0;
            System.out.println
                    ("1)UTWORZ NOWE ZADANIE\n" +
                            "2)WYŚWIETL LISTE ZADAŃ\n" +
                            "3)USUWANIE ZADANIA\n" +
                            "4)ZAKONCZENIE PROGRAMU\n");
            str = odczyt.nextLine();
            menu = Integer.parseInt(str);


            if (menu == 1) //Tworzenie nowego zadania
            {
                String wykonawca, zadanie;
                Integer dzien, miesiac, rok, godzina, minuta;
                System.out.println("Podaj wykonawce");
                wykonawca = odczyt.nextLine();
                System.out.println("Podaj typ zadania");
                zadanie = odczyt.nextLine();

                do {
                    System.out.println("Podaj dzien");
                    str = odczyt.nextLine();
                    dzien = Integer.parseInt(str);
                }while(dzien<0 || dzien>31);

                do {
                    System.out.println("Podaj miesiac");
                    str = odczyt.nextLine();
                    miesiac = Integer.parseInt(str);
                }while(miesiac<0 || miesiac>12);
                do {
                    System.out.println("Podaj rok");
                    str = odczyt.nextLine();
                    rok = Integer.parseInt(str);
                }while(rok<2018);

                do {
                    System.out.println("Podaj godzine");
                    str = odczyt.nextLine();
                    godzina = Integer.parseInt(str);
                }while(godzina<0 || godzina>23);

                do{
                    System.out.println("Podaj minute");
                    str = odczyt.nextLine();
                    minuta = Integer.parseInt(str);
                }while(minuta<0 || minuta>60);

                activities_num += 1;
                tab_activities[activities_num - 1]
                        = new Activity(wykonawca, zadanie, dzien, miesiac, rok, godzina, minuta);


            } else if (menu == 2) { //Wyświetlanie listy zadań
                i = 0;
                if(activities_num==0)
                {
                    System.out.println("Brak zadan do wyswietlenia!\n");
                    continue;
                }
                for (i = 0; i < activities_num; i++) {
                    System.out.println(i + 1);
                    tab_activities[i].get_info();
                    System.out.println("\n");
                }


            } else if (menu == 3) { //Usuwanie zadania
                System.out.println("Podaj numer zadania do usuniecia");
                str = odczyt.nextLine();
                Integer numer = Integer.parseInt(str);
                if(numer>activities_num || numer==0)
                {
                    System.out.println("Podane zadanie nie istnieje\n");
                    continue;
                }
                for (i = numer - 1; i < activities_num - 1; i++) {
                    tab_activities[i] = tab_activities[i + 1];
                }
                activities_num -= 1;

            } else if (menu == 4) { //Zakończenie działania programu
                System.exit(0);
            } else {
                System.out.println("WPROWADZILES NIEPOPRAWNA OPCJE MENU.\n"
                        + "WPISZ JESZCZE RAZ\n\n");
            }
        }
    }
}
