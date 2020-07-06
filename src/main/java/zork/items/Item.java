package zork.items;

import zork.game.Game;
import zork.game.Observation;

public interface Item {

    // each item should be usable
    public abstract Observation use(Game game);

    // each item can be run out
    public abstract boolean canRunOut();
}
