package pt.uma.tpsi.arqd.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Fleet {
    private SpriteBatch batch;
    private ArrayList<Ship> shipArrayList;

    public Fleet(SpriteBatch batch){
        this.batch = batch;
        this.shipArrayList = new ArrayList<>();
    }

    public void render(){};

    public void create(){};

    public void handleCollisions(Player player){

    };
}
