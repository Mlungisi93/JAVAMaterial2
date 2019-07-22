package snakeGame;

import java.awt.*;
import java.util.ArrayList;

public class Snake {

    private int xDir, yDir;
    private ArrayList<Point> snakePoints;
    private boolean elongate, isMoving;
    private final int SNAKESIZE = 20, XSTART = 150, YSTART = 150;

    public Snake() {
        xDir = 0;
        yDir = 0;
        elongate = false;
        isMoving = false;
        Point p = new Point(XSTART, YSTART);
        snakePoints = new ArrayList<>();
        snakePoints.add(p);

        for (int i = 1; i < SNAKESIZE; i++) {
            snakePoints.add(new Point(p.getX() - 4 * i, p.getY()));

        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        for (Point p : snakePoints) {
            g.fillRect(p.getX(), p.getY(), 4, 4);
        }
    }

    public int getXHead()
    {
        return snakePoints.get(0).getX();
    }
    public int getYHead()
    {
        return snakePoints.get(0).getY();
    }


public boolean collision()
{
 int x = getXHead();
 int y = getYHead();

    for (int i = 1; i < snakePoints.size(); i++) {
        if(x == snakePoints.get(i).getX() && y == snakePoints.get(i).getY())
        {
            return true;
        }
    }
    return false;
}

public void move()
{
    if(isMoving)
    {
        Point pHead = snakePoints.get(0);
        Point pTail = snakePoints.get(snakePoints.size()-1);
        Point newPoint = new Point(pHead.getX() + 4*xDir, pHead.getY() + 4*yDir);

        for (int i = snakePoints.size()-1; i >=1 ; i--) {
            snakePoints.set(i, snakePoints.get(i-1));
        }
        snakePoints.set(0, newPoint);

        if(elongate)
        {
            snakePoints.add(pTail);
            snakePoints.add(pTail);
            snakePoints.add(pTail);
            snakePoints.add(pTail);
            this.elongate = false;
        }

    }
}

    public int getxDir() {
        return xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

    public boolean isElongate() {
        return elongate;
    }

    public void setElongate(boolean elongate) {
        this.elongate = elongate;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }
}
