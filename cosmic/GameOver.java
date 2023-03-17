public class GameOver {
    public GameOver() {

    }

    public void GameOver() {
        StdDraw.picture(0.5, 0.3, "wow.png", 3.0, 2.2);
        StdDraw.setPenColor(StdDraw.BLACK);


        StdDraw.text(0.5, 0.6, "GAME OVER");
        StdDraw.text(0.5, 0.4, "YOU MESSED UP!");

    }
}
