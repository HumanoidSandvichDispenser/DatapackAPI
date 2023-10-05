package dev.caveatemptor.DatapackAPI.Command.Setblock;

import dev.caveatemptor.DatapackAPI.Block.BlockType;
import dev.caveatemptor.DatapackAPI.Command.Command;
import dev.caveatemptor.DatapackAPI.Vector.Vector3;


/**
 * Setblock command.
 */
public class Setblock implements Command {
    Vector3 location;
    BlockType block;
    SetblockReplaceType replaceType;


    /**
     * New setblock command.
     * @param location The position to set the block at
     * @param block The block to set.
     */
    public Setblock(Vector3 location, BlockType block) {
        this.location = location;
        this.block = block;
    }

    /**
     * New setblock command.
     * @param location The position to set the block at
     * @param block The block to set.
     * @param replaceType The type of replacement to do.
     */
    public Setblock(Vector3 location, BlockType block, SetblockReplaceType replaceType) {
        this.location = location;
        this.block = block;
        this.replaceType = replaceType;
    }


    @Override
    public String generate() {
        String generated = "setblock " + location.generate() + " " + block.generate();

        if (replaceType != null) {
            generated += " " + replaceType.generate();
        }

        return generated;
    }
}
