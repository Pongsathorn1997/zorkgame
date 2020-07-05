package zork.command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static Map<String,Command> commandMap = new HashMap<>();

    static {
        commandMap.put("exit", new ExitCommand());
        commandMap.put("echo", new EchoCommand());
    }

    public static Command getCommand(String command){
        return commandMap.get(command);
    }
}
