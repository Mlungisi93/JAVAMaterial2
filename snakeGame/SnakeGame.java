package snakeGame;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements Runnable, KeyListener {
private Snake snake;
private Token token;
private Thread thread;
private Graphics gpx;
private Image img;
private boolean isGameOver;
private boolean isPaused;


    @Override
    public void init()
    {
        this.resize(400, 400);
        snake = new Snake();
        token = new Token(snake);
        thread = new Thread(this);
        img = createImage(400,400);
        gpx = img.getGraphics();
        isGameOver =false;
        isPaused = false;
        thread.start();
        this.addKeyListener(this);
        this.setFocusable(true);

    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void repaint(Graphics g)
    {
        paint(g);
    }

    public void paint(Graphics g)
    {
        this.setFocusable(true);
        gpx.setColor(Color.BLACK);
        gpx.fillRect(0,0,400,400);
        if(!isGameOver)
        {
            if(isPaused)
            {
                snake.draw(gpx);
                token.draw(gpx);
                gpx.setColor(Color.RED);
                gpx.drawString("Game Paused",150,150);
                gpx.drawString("Your Current Score is: "+token.getScore(),150,160);
                gpx.drawString("Press ESC To Continue",150,170);
            }
            if(isPaused ==false)
            {
                snake.draw(gpx);
                token.draw(gpx);
            }


        }else
        {
            gpx.setColor(Color.RED);
            gpx.drawString("Game Over",150,150);
            gpx.drawString("Your Score is: "+token.getScore(),150,160);
            gpx.drawString("Press ESC To Restart",150,170);


        }

        g.drawImage(img,0,0,null);
    }

    public void checkGameOver()
    {
        if(snake.getXHead() < 0 || snake.getXHead()>395)
        {
            this.isGameOver = true;
        }

        if(snake.getYHead() < 0 || snake.getYHead()>395)
        {
            this.isGameOver = true;
        }

        if(snake.collision() == true)
        {
            this.isGameOver = true;
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(!snake.isMoving())
        {
            if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN
                    || e.getKeyCode() == KeyEvent.VK_RIGHT)
            {
                snake.setMoving(true);
            }

        }

        if(snake.isMoving())
        {
            if(e.getKeyCode() == KeyEvent.VK_UP)
            {
                if(snake.getyDir() !=1)
                {
                    snake.setyDir(-1);
                    snake.setxDir(0);

                }
            }

            if(e.getKeyCode() == KeyEvent.VK_DOWN)
            {
                if(snake.getyDir() !=-1)
                {
                    snake.setyDir(1);
                    snake.setxDir(0);
                }
            }

            if(e.getKeyCode() == KeyEvent.VK_LEFT)
            {
                if(snake.getxDir() !=1)
                {
                    snake.setxDir(-1);
                    snake.setyDir(0);
                }
            }

            if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            {
                if(snake.getxDir() !=-1)
                {
                    snake.setxDir(1);
                    snake.setyDir(0);
                }
            }

            if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            {
                if(isGameOver)
                {
                    this.resize(400, 400);
                    snake = new Snake();
                    token = new Token(snake);
                    thread = new Thread(this);
                    img = createImage(400,400);
                    gpx = img.getGraphics();
                    isGameOver =false;
                }else
                {
                    if(isPaused ==true)
                    {
                        snake.setMoving(true);
                        isPaused = false;
                    }else
                    {
                        snake.setMoving(false);
                        isPaused = true;
                    }
                }
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
for(;;)
{
    if(!isGameOver)
    {
        snake.move();
        token.collision();
        this.checkGameOver();
    }
    this.repaint();
    try {
        thread.sleep(30);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }
}
