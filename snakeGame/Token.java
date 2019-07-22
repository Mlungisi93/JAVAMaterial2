package snakeGame;

import java.awt.*;

public class Token {
    private int x, y;
    private int score;
    private Snake snake;
    public Token(Snake snake)
    {
        x = (int)(Math.random()*395);
        y = (int)(Math.random()*395);
        this.snake = snake;
        score = 0;
    }

    public void changePosition()
    {
        x = (int)(Math.random()*395);
        y = (int)(Math.random()*395);
    }

    public boolean collision()
    {
        int xHead = snake.getXHead()+2;
        int yHead = snake.getYHead()+2;

        if(xHead >x -1 && xHead < x+7)
        {
            if(yHead > y-1 && yHead <y+7)
            {
                changePosition();
                score+=10;
                snake.setElongate(true);
               return true;
            }
        }
        return false;
    }

    public int getScore() {
        return score;
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(x,y,6,6);
    }
}
