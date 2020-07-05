package zork;

import zork.command.Command;
import zork.command.CommandFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = ""; // empty
        while (true){
            System.out.print("please typing > ");
            cmd = scanner.nextLine();
            String[] words = cmd.split(" ");
            Command command = CommandFactory.getCommand(words[0]); // first element in the words should be command
            if (command != null){
                if (words.length == 1){
                    command.execute(null);
                }else {
                    command.execute(words[1]);
                }
            }
        }
//        scanner.close();
//        System.out.println("Good Bye!!");
    }
}
