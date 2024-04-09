package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    public void draw() {
        System.out.println("core.basesyntax.Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1 + " units, base2: " + base2 + " units, height: "
                + height + " units");
    }
}
