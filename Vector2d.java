public class Vector2d {
    private double x;
    private double y;

    public Vector2d(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }

    public Vector2d add(Vector2d other){
        return new Vector2d(this.x+other.x, this.y+other.y);
    }
    public Vector2d subtract(Vector2d other){
        return new Vector2d(this.x-other.x, this.y-other.y);
    }

    public Vector2d multiply(double scalar){
        Vector2d vector2d = new Vector2d(this.x * scalar, this.y * scalar);
        return vector2d;
    }

    public Vector2d dotProduct(Vector2d other){
        return new Vector2d(this.x*other.x, this.y*other.y);
    }

    public double magnitude(){
        return Math.sqrt(x*x + y*y);
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
