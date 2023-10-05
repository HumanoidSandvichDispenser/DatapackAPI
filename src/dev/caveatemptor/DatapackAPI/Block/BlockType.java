package dev.caveatemptor.DatapackAPI.Block;

/**
 * Every block in minecraft
 */

// TODO: fill this out
public enum BlockType {
    DIRT;


    public String generate() {
        return "minecraft:" + this.name().toLowerCase();
    }
}
