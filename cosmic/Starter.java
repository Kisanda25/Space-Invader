public class Starter {
    public Starter() {

    }

    public void starter1() {

        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.picture(0.5, 0.5, "front1.png", 1.0, 1.5);
        StdDraw.text(0.5, 0.9, "Space Invaders: The Return Of The Aliens!");
        StdDraw.text(0.5, 0.85, "Press Space to Save the World!");
        StdDraw.text(0.5, 0.2, "Shoot(w)");
        StdDraw.text(0.5, 0.15, "Rotate: left(a), Stop(s), Right(d)");
        StdDraw.text(0.5, 0.1, "Move: left(z), Stop(x), Right(c)");
        StdDraw.text(0.5, 0.05, "Quit(q), Screencap(p)");
    }


}
