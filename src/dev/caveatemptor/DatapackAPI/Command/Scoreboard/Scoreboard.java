package dev.caveatemptor.DatapackAPI.Command.Scoreboard;

import dev.caveatemptor.DatapackAPI.Command.Command;

/**
 * Scoreboard command.
 */
public class Scoreboard implements Command {
    ScoreboardCommand scoreboardCommand;
    String subcommandValue;

    /**
     * Creates a new scoreboard command.
     * @param scoreboardCommand The scoreboard command type.
     * @param subcommandValue The subcommand value.
     */
    Scoreboard(ScoreboardCommand scoreboardCommand, String subcommandValue) {
        this.scoreboardCommand = scoreboardCommand;
        this.subcommandValue = subcommandValue;
    }

    /**
     * @return Converts the Command into a String usable in mcfunctions
     */
    @Override
    public String generate() {
        return null;
    }
}
