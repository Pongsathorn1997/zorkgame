package zork.character;

import java.util.Random;

public abstract class Character {

    protected Random rand = new Random();
    protected int health;
    protected boolean isAlive;

    // declare that character is not death
    public Character(){
        isAlive = true;
    }

    public abstract void getAttacked(Attacker ao, Observe ob);

    // return the HP of the character
    public int getHealth(){
        return health;
    }
}
