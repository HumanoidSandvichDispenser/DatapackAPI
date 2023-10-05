package dev.caveatemptor.DatapackAPI.Position;


/**
 * A position, storing whole numbers.
 */
public class Position {
    private final int x;
    private final int y;
    private final int z;
    private final boolean xRelative;
    private final boolean yRelative;
    private final boolean zRelative;


    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xRelative = false;
        this.yRelative = false;
        this.zRelative = false;
    }

    public Position(int x, int y, int z, boolean xRelative, boolean yRelative, boolean zRelative) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xRelative = xRelative;
        this.yRelative = yRelative;
        this.zRelative = zRelative;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }


    public boolean isxRelative() {
        return xRelative;
    }

    public boolean isyRelative() {
        return yRelative;
    }

    public boolean iszRelative() {
        return zRelative;
    }


    public String generate() {
        String generated = "";
        if (xRelative) {
            generated += "~";
        }
        generated += x + " ";

        if (yRelative) {
            generated += "~";
        }
        generated += y + " ";

        if (zRelative) {
            generated += "~";
        }
        generated += z;

        return generated;
    }
}
