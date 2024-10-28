package pt.uma.tpsi.arqd.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import pt.uma.tpsi.arqd.game.Animator;

public class Laser {
    protected int posX, posY;

    protected Animator animator;

    protected Rectangle boundingBox;

    public Laser(int posX, int posY, SpriteBatch batch){
        this.posX = posX;
        this.posY = posY;

        this.animator = new Animator();
    }


    public void render(){
        animator.render(posX, posY);
    }


    public void update(){
        this.posY+=5;
        boundingBox.setPosition(posX, posY);
    }
}
