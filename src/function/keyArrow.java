package function;
import java.io.Console;

import java.io.Console;

public class keyArrow{
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        while (true) {
            char[] inputChars = console.readPassword("Press an arrow key (q to quit): ");
            if (inputChars.length > 0) {
                char input = inputChars[0];

                switch (input) {
                    case 'q':
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    case '\u0003': // Handle Ctrl+C as well
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    case '\u001B': // Escape character for arrow keys
                        try {
                            char[] escapeSequence = console.readPassword();
                            if (escapeSequence.length > 0 && escapeSequence[0] == '[') {
                                if (escapeSequence.length > 1) {
                                    char arrowKey = escapeSequence[1];
                                    handleArrowKey(arrowKey);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        System.out.println("Unknown input");
                }
            }
        }
    }

    private static void handleArrowKey(char arrowKey) {
        switch (arrowKey) {
            case 'A':
                System.out.println("Up arrow pressed");
                break;
            case 'B':
                System.out.println("Down arrow pressed");
                break;
            case 'C':
                System.out.println("Right arrow pressed");
                break;
            case 'D':
                System.out.println("Left arrow pressed");
                break;
            default:
                System.out.println("Unknown arrow key");
        }
    }
}
