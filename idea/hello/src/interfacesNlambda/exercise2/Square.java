package interfacesNlambda.exercise2;

public record Square(double side) implements GeometricArea{
    @Override
    public double getArea() {
        return side*side;
    }
}
