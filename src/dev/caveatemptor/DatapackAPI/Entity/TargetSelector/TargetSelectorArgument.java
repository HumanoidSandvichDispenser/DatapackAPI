package dev.caveatemptor.DatapackAPI.Entity.TargetSelector;


/**
 * An argument for a targetSelector.
 */
public class TargetSelectorArgument {
    private TargetSelectorArgumentType argumentType;
    private String argumentValue;


    /**
     * Creates a TargetSelectorArgument. Care should be taken when using these, as there is currently no way to check if the argument created is valid. If done wrong, this will fail in-game. See minecraft.fandom.com/wiki/Target_selectors.
     * @param argumentType The Type of argument.
     * @param argumentValue The value of the argument.
     */

    // TODO: Implement the rest of the arguments // https://minecraft.fandom.com/wiki/Target_selectors
    // TODO: Error checking
    public TargetSelectorArgument(TargetSelectorArgumentType argumentType, int argumentValue) {
        this.argumentType = argumentType;
        this.argumentValue = Integer.toString(argumentValue);
    }


    /**
     * The argument value.
     * @return The argument value.
     */
    public String getArgumentValue() {
        return argumentValue;
    }


    /**
     * The argument type.
     * @return The argument type.
     */
    public TargetSelectorArgumentType getArgumentType() {
        return argumentType;
    }


    /**
     * Whether the target selector is valid and will work in-game.
     * @return Whether the target selector is valid and will work in-game.
     *
     */
    public boolean isValid() { // TODO: finish this
        return valid;
    }


    /**
     * Converts the TargetSelectorArgument into a String usable in mcfunctions.
     * @return String representation of the TargetSelectorArgument.
     */
    public String generate() {
        return "[" + argumentType.name().toLowerCase() + "=" + argumentValue + "]";
    }
}
