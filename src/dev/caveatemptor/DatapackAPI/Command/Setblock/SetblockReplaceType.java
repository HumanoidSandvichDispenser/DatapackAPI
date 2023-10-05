package dev.caveatemptor.DatapackAPI.Command.Setblock;

public enum SetblockReplaceType {
    /**
     * Destroys the old block, dropping it and its contents.
     */
    DESTROY,
    /**
     * Only changes air blocks.
     */
    KEEP,
    /**
     * The old block does not drop itself or its contents, playing no sounds.
     */
    REPLACE;


    public String generate() {
        return this.name().toLowerCase();
    }
}
