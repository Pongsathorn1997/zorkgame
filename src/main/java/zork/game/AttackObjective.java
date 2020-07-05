package zork.game;

public class AttackObjective {

    private int damage;
    private int StunTurn;

    // get the damage
    public int getDamage(){
        return damage;
    }
    // get the turn that sturn
    public int getStunTurn(){
        return StunTurn;
    }

    public static class Builder {

        private int damage = 0;
        private int StunTurn = 0;

        // set the damage from in the class
        public Builder damage(int damage){
            this.damage = damage;
            return this;
        }

        public Builder StunTurn(int stunTurn){
            this.StunTurn = stunTurn;
            return this;
        }

        public AttackObjective build(){
            AttackObjective attackObjective = new AttackObjective();
            attackObjective.damage = this.damage;
            attackObjective.StunTurn = this.StunTurn;
            return attackObjective;
        }

    }

}
