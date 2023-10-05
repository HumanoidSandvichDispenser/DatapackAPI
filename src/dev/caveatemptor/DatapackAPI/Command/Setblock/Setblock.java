package dev.caveatemptor.DatapackAPI.Command.Setblock;

import dev.caveatemptor.DatapackAPI.Block.BlockType;
import dev.caveatemptor.DatapackAPI.Command.Command;
import dev.caveatemptor.DatapackAPI.Position.Position;


/**
 * Setblock command.
 */
public class Setblock implements Command {
    Position position;
    BlockType block;
    SetblockReplaceType replaceType;


    /**
     * New setblock command.
     * @param position The position to set the block at
     * @param block The block to set.
     */
    public Setblock(Position position, BlockType block) {
        this.position = position;
        this.block = block;
    }

    /**
     * New setblock command.
     * @param location The position to set the block at
     * @param block The block to set.
     * @param replaceType The type of replacement to do.
     */
    public Setblock(Position location, BlockType block, SetblockReplaceType replaceType) {
        this.position = location;
        this.block = block;
        this.replaceType = replaceType;
    }


    @Override
    public String generate() {
        String generated = "setblock " + position.generate() + " " + block.generate();

        if (replaceType != null) {
            generated += " " + replaceType.generate();
        }

        return generated;
    }
}
