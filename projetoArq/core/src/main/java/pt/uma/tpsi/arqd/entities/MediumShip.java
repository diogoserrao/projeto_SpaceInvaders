package pt.uma.tpsi.arqd.entities;

import pt.uma.tpsi.arqd.game.Animator;

public class MediumShip extends Ship{
    public MediumShip(int posX, int posY, Animator animator){
        super(posX, posY, animator);
    }

    @Override
    public void shoot(){
        System.out.println("Medium ship shooting...");
    }
}
