public class Missile {
    private double x;
    private double y;
    private double dy;

    public Missile(double x, double y) {
        this.x = x;
        this.y = y;
        dy = 0.01;
    }

    public void drawMissile(double x, double y) {
        StdDraw.setPenColor(255, 0, 0);
        StdDraw.filledRectangle(this.x, this.y, 0.001, 0.01);
    }

    public void moveMissile() {
        y += dy;
    }

    public double xMissile() {
        return x;
    }

    public double yMissile() {
        return y;
    }
}
