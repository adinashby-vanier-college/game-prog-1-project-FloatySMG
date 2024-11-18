public class Vector2D
{
    private double x;
    private double y;

    // Constructor
    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    // Vector addition (v1 + v2)
    public static Vector2D add(Vector2D v1, Vector2D v2)
    {
        return new Vector2D(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    // Scalar multiplication (v * scalar)
    public static Vector2D multiply(Vector2D v, double scalar)
    {
        return new Vector2D(v.getX() * scalar, v.getY() * scalar);
    }

    // Normalize the vector (make its length 1)
    public void normalize()
    {
        double length = Math.sqrt(x * x + y * y);
        if (length != 0)
        {
            x /= length;
            y /= length;
        }
    }

    // Calculate the length of the vector (magnitude)
    public double length()
    {
        return Math.sqrt(x * x + y * y);
    }
}
