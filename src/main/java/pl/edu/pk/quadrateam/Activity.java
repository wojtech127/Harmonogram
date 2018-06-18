package pl.edu.pk.quadrateam;

public class Activity
{
    private String wykonawca, rodzaj_zadania;
    private Integer dzien_wykonania, miesiac_wykonania, rok_wykonania,
                    godzina_wykonania, minuta_wykonania;

     Activity(String wykonawca, String rodzaj_zadania, Integer dzien, Integer miesiac, Integer rok, Integer godzina, Integer minuta)
    {
        this.wykonawca=wykonawca;
        this.rodzaj_zadania=rodzaj_zadania;
        this.dzien_wykonania=dzien;
        this.miesiac_wykonania=miesiac;
        this.rok_wykonania=rok;
        this.godzina_wykonania=godzina;
        this.minuta_wykonania=minuta;
        System.out.println("Zadanie zostalo utworzone!");
    }

    public void get_wykonawca()
    {
        System.out.println(this.wykonawca);
    }

    public void get_rodzaj()
    {
         System.out.println(this.rodzaj_zadania);
    }

    public void get_data()
    {
        String data = this.dzien_wykonania + "/" + this.miesiac_wykonania + "/" + this.rok_wykonania;
        System.out.println(data);
    }

    public void get_czas()
    {
        String czas = this.godzina_wykonania + ":" + this.minuta_wykonania;
        System.out.println(czas);
    }

    public void get_info()
    {
        System.out.println("######");
        this.get_wykonawca();
        this.get_rodzaj();
        this.get_data();
        this.get_czas();
        System.out.println("######");
    }
}
