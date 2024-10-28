package pt.uma.tpsi.arqd.entities;

import pt.uma.tpsi.arqd.game.Animator;

public class LargeShip extends Ship{
    public LargeShip(int posX, int posY, Animator animator){
        super(posX, posY, animator);
    }

    @Override
    public void shoot(){
        System.out.println("Medium ship shooting...");
    }
}
