public class Vector2D
{
    private double x;
    private double y;

    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    // Normalize the vector
    public void normalize()
    {
        double length = Math.sqrt(x * x + y * y);
        if (length != 0)
        {
            x /= length;
            y /= length;
        }
    }

    // Multiply the vector by a scalar
    public static Vector2D multiply(Vector2D vector, double scalar)
    {
        return new Vector2D(vector.getX() * scalar, vector.getY() * scalar);
    }

    // Add two vectors
    public static Vector2D add(Vector2D v1, Vector2D v2)
    {
        return new Vector2D(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    // Get the magnitude of the vector
    public double getMagnitude()
    {
        return Math.sqrt(x * x + y * y);
    }
}
