package dev.caveatemptor.DatapackAPI.Vector;


/**
 * A 2D vector, useful for storing rotation and other 2D values.
 */
public class Vector2 implements Vector {
    private double x, y;
    private boolean xRelative, yRelative;


    /**
     * Creates a 2D vector with an X and Y value.
     * @param x The X value of the vector.
     * @param y The Y value of the vector.
     */
    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
        this.xRelative = false;
        this.yRelative = false;
    }

    /**
     * Creates a 2D vector with an X and Y value.
     * @param x The X value of the vector.
     * @param y The Y value of the vector.
     * @param xRelative Whether X is relative to the entity.
     * @param yRelative Whether Y is relative to the entity.
     */
    public Vector2(int x, int y, boolean xRelative, boolean yRelative) {
        this.x = x;
        this.y = y;
        this.xRelative = xRelative;
        this.yRelative = yRelative;
    }


    /**
     *
     * @return The X component of the vector.
     */
    public double getX() {
        return x;
    }

    /**
     *
     * @param x The X component of the vector.
     * @return True if success, false if failure.
     */
    public boolean setX(int x) {
        this.x = x;
        return true;
    }


    /**
     *
     * @return The Y component of the vector.
     */
    public double getY() {
        return y;
    }


    /**
     *
     * @param y The Y component of the vector.
     * @return True if success, false if failure.
     */
    public boolean setY(int y) {
        this.y = y;
        return true;
    }

    /**
     * Whether X is relative to the entity.
     * @return Whether X is relative to the entity.
     */
    public boolean isxRelative() {
        return xRelative;
    }

    /**
     * Set Whether X is relative to the entity.
     * @param xRelative Whether X is relative to the entity.
     */
    public void setxRelative(boolean xRelative) {
        this.xRelative = xRelative;
    }

    /**
     * Whether Y is relative to the entity.
     * @return Whether Y is relative to the entity.
     */
    public boolean isyRelative() {
        return yRelative;
    }

    /**
     * Set Whether Y is relative to the entity.
     * @param yRelative Whether Y is relative to the entity.
     */
    public void setyRelative(boolean yRelative) {
        this.yRelative = yRelative;
    }


    /**
     * Converts the vector into a String usable in mcfunctions
     * @return The X and Y components of the vector separated by spaces.
     */
    @Override
    public String generate() {
        String generated = "";
        if (xRelative) {
            generated += "~";
        }
        generated += x;

        if (yRelative) {
            generated += "~";
        }
        generated += y;

        return generated;
    }
}
