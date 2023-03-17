import java.util.ArrayList;

public class Board {
    double start_x = 0.25;
    double start_y = 0.05;
    double dx = 0.009;
    double dy = 0.009;
    Ship s = new Ship(start_x, start_y, dx);
    GameOver go = new GameOver();

    double m_x = 0;
    double m_y = 0;
    Missile bomb = new Missile(m_x, m_y);
    public ArrayList<Missile> m = new ArrayList<Missile>();

    boolean running = true;
    boolean visible = true;
    double x_alien = 0.1;
    double y_alien = 0.9;
    public ArrayList<Alien> enemy = new ArrayList<>();
    Alien[][] a = new Alien[3][6];
    Alien alien = new Alien(x_alien, y_alien, 0.02, 0.02);
    double ax_current = alien.x_Alien();
    double ay_current = alien.y_Alien();
    boolean right = false;
    boolean down;


    boolean leftEdge = false;
    boolean rightEdge = false;
    double last_missile = 0;


    public Board() {

    }

    public void update() {  //clears and redraws board to move objects
        if (StdDraw.isKeyPressed(81)) {
            running = false;
            System.exit(0);
        }
        if (StdDraw.isKeyPressed(90)) s.moveLeft();
        if (StdDraw.isKeyPressed(67)) s.moveRight();
        if (StdDraw.isKeyPressed(87)) {
            delay(150);
            StdAudio.play("Missile_sound.wav");
            visible = true;

        }
    }


    public void drawBoard() {
        StdAudio.play("sound2.wav");

        StdDraw.enableDoubleBuffering();
        StdDraw.setPenColor(255, 255, 255);
        drawAlien();
        while (running) {
            StdDraw.clear();
            //StdAudio.play("clash.wav");
            StdDraw.picture(0.6, 1.0, "back1.png", 3.0, 2.2);
            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
            StdDraw.text(0.5, 0.95, "You are Earth's last hope!");
            s.draw();
            //delay(500);
            moveAliens();
            update();

            //adding and removing missiles
            for (int i = 0; i < m.size(); i++) {
                Missile missile = m.get(i);
                double mx = missile.xMissile();
                double my = missile.yMissile();
                if (visible) {
                    missile.drawMissile(mx, my);
                    missile.moveMissile();
                }
                if (missile.yMissile() > 1) {
                    m.remove(i);
                    i--;
                }

            }
            StdDraw.show();
        }
    }


    public void drawAlien() {

        double axStart = x_alien;
        double ayStart = y_alien;

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 6; k++) {
                a[j][k] = new Alien(axStart, ayStart, dx, dy); //array of alien objects
                enemy.add(a[j][k]);
                StdDraw.picture(a[j][k].ax, a[j][k].ay, "alien1.png", 0.1, 0.08, 0);
                axStart += 0.1;

            }
            axStart = x_alien; //resets first position in new row
            ayStart -= 0.1;

            if (ayStart > 0.0) {
                System.out.println("Hello");
            }

        }
    }


    public void destroyAlien() {
        m_x = bomb.xMissile();
        m_y = bomb.yMissile();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (a[i][j] != null) {
                    // if alien position and missile position are the same then both are destroyed
               /* double e_y = e.y_Alien();
                if (e_x == bomb.xMissile()) {

                }
                if (miss.yMissile() > 1) {
                    m.remove(i);
                    i--;
                }

            }*/

                }
            }
        }
    }


    public void moveAliens() {

        for (Alien a : enemy) {

            if (a.ax <= 0.1) {
                right = false;
                down = true;
                break;
            }

            if (a.ax >= 0.9) {
                right = true;
                break;
            }
        }

        if (down) {
            for (Alien a : enemy)
                a.ay -= 0.05;
            down = false;
        }

        if (!right) {
            for (Alien a : enemy)
                a.moveRight();

        } else
            for (Alien a : enemy)
                a.moveLeft();

        for (Alien a : enemy)
            StdDraw.picture(a.ax, a.ay, "alien1.png", 0.1, 0.08, 0);

    }

    public void delay(int wait) {
        double time = System.currentTimeMillis();
        if (time > last_missile + wait) {
            m.add(s.fire());
            last_missile = time;
        }
    }


    public void booleans() {
        if (ax_current == 0.1) {
            rightEdge = false;
            leftEdge = true;
        }

        if (ax_current == 0.9) {
            leftEdge = false;
            rightEdge = true;
        }
    }
}
















