package dev.caveatemptor.DatapackAPI.Entity.TargetSelector;

/**
 * The types of target selectors. Not fully implemented.
 */
public enum TargetSelectorType {
    NEAREST_PLAYER("@p"),
    RANDOM_PLAYER("@r"),
    ALL_PLAYERS("@a"),
    ALL_ENTITIES("@e"),
    /**
     * The entity executing the command.
     */
    SELF("@s");


    private final String selector;

    /**
     * Changes the selector based on the enum chosen.
     * @param selector The target selector type.
     */
    TargetSelectorType(String selector) {
        this.selector = selector;
    }


    /**
     * While named generate() to be consistent with the rest of the API, this simply returns selector.
     * @return The string representation of the target selector type.
     */
    public String generate() {
        return selector;
    }
}
