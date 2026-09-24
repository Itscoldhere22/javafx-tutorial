public class Duke {
    private String commandType = "";

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        // This tutorial app echoes input; classify only for reply styling.
        // When a command parser is added, use the successfully executed command's type.
        String command = input.strip().split("\\s+", 2)[0];
        commandType = switch (command) {
        case "todo", "deadline", "event" -> "AddCommand";
        case "mark", "unmark" -> "ChangeMarkCommand";
        case "delete" -> "DeleteCommand";
        default -> "";
        };
        return "Duke heard: " + input;
    }
    /** Returns the style category for the most recent input. */
    public String getCommandType() {
        return commandType;
    }
}
