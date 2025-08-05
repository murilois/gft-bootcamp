package interfacesNlambda.exercise2;

public record Rectangle(double height, double base) implements GeometricArea {
    @Override
    public double getArea() {
        return height * base;
    }
}
