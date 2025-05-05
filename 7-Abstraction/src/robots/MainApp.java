package robots;

public class MainApp {
    public static void main(String[] args) {
        BendingRobot br = new BendingRobot("Bender", 90);
        br.bend(45);
        br.bend(180);
        br.lift(80);
        br.lift(150);
    }
}
