package pl.edu.pk.quadrateam;

class Model {
    Model(){}
    public static void main(String[] args)
    {
        Activity active = new Activity("Damian", "Oddaj jave", 18,
                                       6, 2018, 14, 30);


        active.get_info();
    }
}
