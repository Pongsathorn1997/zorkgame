package zork.scene;

import zork.command.normal.NormalCommandFactory;
import zork.game.Game;
import zork.game.Observation;

public class StartScene extends Scene {
    @Override
    public void playScene(Game game) {
        game.notifyObserver(new Observation("Welcome to the zork game!!"));
        game.setNextScene(null);

        while (game.getNextScene() == null){
            game.resetCommandsList();
            game.addCommandsToList(new NormalCommandFactory().getCommands());
            showCommand(game);
        }
    }
}
