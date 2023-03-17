public class Alien {
    public double ax;
    public double ay;
    private double dx;
    private double dy;
    boolean visible;
    boolean left = false;
    boolean right = true;
    Alien[][] a = new Alien[3][5];


    public Alien(double x, double y, double dx, double dy) {
        this.ax = x;
        this.ay = y;
        this.dx = dx;
        this.dy = dy;
    }

    public void moveLeft() {
        ax -= dx;
        
    }

    public void moveRight() {
        this.ax += dx;
    }

    public void moveDown() {
        this.ay -= dy;
    }

    public double x_Alien() {
        return ax;
    }

    public double y_Alien() {
        return ay;
    }

    public void incrementX(double newx) {
        ax = ax + newx;
    }

    public void decrementX(double newx) {
        ax = ax - newx;
    }

    public void decrementY(double newy) {
        ay = ay - newy;
    }
}


