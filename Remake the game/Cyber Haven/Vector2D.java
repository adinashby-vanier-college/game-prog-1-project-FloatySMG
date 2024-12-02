public class Vector2D {
    private double x;
    private double y;

    // constructor - gotta set the x and y values
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // get x value
    public double getX() {
        return x;
    }

    // get y value
    public double getY() {
        return y;
    }

    // set x value
    public void setX(double x) {
        this.x = x;
    }

    // set y value
    public void setY(double y) {
        this.y = y;
    }

    // normalize vector, make it a unit vector, like... normalize it
    public void normalize() {
        double length = Math.sqrt(x * x + y * y);
        if (length != 0) {
            x /= length;
            y /= length;
        }
    }

    // multiply vector by scalar, pretty simple
    public static Vector2D multiply(Vector2D vector, double scalar) {
        return new Vector2D(vector.getX() * scalar, vector.getY() * scalar);
    }

    // add two vectors together
    public static Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    // get the magnitude, or the length of the vector
    public double getMagnitude() {
        return Math.sqrt(x * x + y * y);
    }
}
