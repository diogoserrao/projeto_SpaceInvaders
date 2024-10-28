package pt.uma.tpsi.arqd.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.tpsi.arqd.game.Animator;
import com.badlogic.gdx.math.Rectangle;

import java.awt.*;

public abstract class Ship {
    protected int posX, posY;

    protected Animator animator;

    protected Rectangle boundingBox;

    public Ship(int posX, int posY, Animator animator){
        this.posX = 0;
        this.posY = 0;
    }

    public Ship(int posX, int posY, SpriteBatch batch, String path, int rows,  int columns){
        this.posX = posX;
        this.posY = posY;
        animator = new Animator(batch, path, rows, columns);
        boundingBox = new Rectangle(posX, posY, animator.getWidth(), animator.getHeight());
    }
    //public abstract void shoot();

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }

    public void setPosX(int posX){
        this.posX = posX;
    }

    public void setPosY(int posY){
        this.posY = posY;
    }


    public abstract void shoot();
}
