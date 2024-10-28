package pt.uma.tpsi.arqd.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.tpsi.arqd.game.Animator;

import java.util.ArrayList;

public class Player extends Ship {
    private int posX, posY;

    private Animator animator;

    private SpriteBatch batch;

    private ArrayList<Laser> lasers;

    public Player(int posX, int posY, SpriteBatch batch, String path, int rows, int columns) {
        super(posX, posY, batch, path, rows, columns);
    }

    public ArrayList<Laser> getLasers() {
        return lasers;
    }

    public void create() {
        animator.create();
    }


    public void render() {
        animator.render(posX, posY);
    }

    public void handleInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) && posX < Gdx.graphics.getWidth() - animator.getWidth()) {
            posX++;
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT) && posX > 0) {
            posX--;
        }
        boundingBox.setPosition(posX, posY);
    }

    @Override
    public void shoot() {
        Laser laser = new Laser(posX, posY, batch);
    }

}
