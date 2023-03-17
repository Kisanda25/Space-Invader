public class cosmic {
    public static void main(String[] args) {
        boolean isPlaying = false;
        while (isPlaying == false) {
            Starter s = new Starter();
            s.starter1();
            if (StdDraw.isKeyPressed(32)) {
                isPlaying = true;
            }
        }
        while (isPlaying == true) {
            StdDraw.enableDoubleBuffering();
            Board board = new Board();
            StdDraw.clear();
            board.drawBoard();
            StdDraw.show();


            StdDraw.pause(10);
            StdDraw.show();
            if (StdDraw.isKeyPressed(81)) {
                isPlaying = false;

            }

        }


    }
}






