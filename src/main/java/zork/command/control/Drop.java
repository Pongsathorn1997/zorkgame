package zork.command.control;

import zork.character.Player;
import zork.command.Command;
import zork.game.Game;
import zork.game.Observation;
import zork.items.Item;
import zork.items.itemUseInFight.FightItem;
import zork.location.rooms.Room;

public class Drop implements Command {
    @Override
    public Observation do_the_command(Game game) {
        Observation ob = null;
        game.notifyObserver(new Observation("What items do you want to drop?"));
        for (Class<? extends Item> itemType: game.getPlayer().getInventory().keySet()){
            new Observation(itemType.getSimpleName().toLowerCase() + ", ");
        }
        String input = game.getInput().receiveInputAsString().toLowerCase();
        for (Class<? extends Item> itemType: game.getPlayer().getInventory().keySet()){
            if(input.startsWith(itemType.getSimpleName().toLowerCase())){
                ob = game.getPlayer().dropItem(itemType).drop(game);
            }
        }
        if (ob == null){
            ob = new Observation("This item does not exist!!");
        }
        return ob;


    }

    @Override
    public String get_name_command() {
        return "drop";
    }
}
