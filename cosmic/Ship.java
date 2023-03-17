public class Ship {
    private double x;
    private double y;
    private double dx;


    public Ship(double x, double y, double dx) {
        this.x = x;
        this.y = y;
        this.dx = dx;
    }

    public void moveLeft() {
        if (x <= 0.9) x -= dx;
        if (x > 0.9) x = 0.9;
    }

    public void moveRight() {
        if (x >= 0.1) x += dx;
        if (x < 0.1) x = 0.1;
    }

    public double x_coord() {
        return x;
    }

    public double y_coord() {
        return y;
    }


    public void draw() {
        StdDraw.setScale(0, 1.0);
        StdDraw.picture(x, y, "Ship.png", 0.1, 0.08, 0);
    }


    public Missile fire() {
        return new Missile(x, y);
    }


}
