package zork.command.normal;

import zork.command.Command;
import zork.game.Game;
import zork.game.Observation;
import zork.scene.LevelScene;

public class Start implements Command {
    @Override
    public Observation do_the_command(Game game) {
        game.setNextScene(new LevelScene());
        return new Observation("Let! play the game");
    }

    @Override
    public String get_name_command() {
        return "start";
    }
}
