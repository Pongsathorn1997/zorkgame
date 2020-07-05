package zork.command;

public class ExitCommand implements Command {
    @Override
    public void execute(String arg) {
        System.exit(0); // normal exit (exit the game)
    }
}
