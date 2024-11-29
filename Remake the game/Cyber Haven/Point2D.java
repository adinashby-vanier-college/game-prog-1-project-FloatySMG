public class Point2D
{
    private double x;
    private double y;

    // Constructor
    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }

    // Setters
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    // Update position by adding values to x and y
    public void setLocation(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}
