package pt.uma.tpsi.arqd.entities;

import pt.uma.tpsi.arqd.game.Animator;

public class SmallShip extends Ship {
    public SmallShip(int posX, int posY, Animator animator){
        super(posX, posY, animator);
    }

    @Override
    public void shoot(){
        System.out.println("Small ship shooting...");
    }
}
