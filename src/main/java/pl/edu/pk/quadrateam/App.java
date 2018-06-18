package pl.edu.pk.quadrateam;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("start program");
        Model model = new Model();
        View view = new View(model);
        Controler controler = new Controler(view, model);
    }
}
