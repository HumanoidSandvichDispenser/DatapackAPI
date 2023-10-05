package dev.caveatemptor.DatapackAPI.Vector;


/**
 * A 3D vector, useful for storing locations and other 3D values.
 */
public class Vector3 implements Vector {
    private double x, y, z;
    private boolean xRelative, yRelative, zRelative;


    /**
     * Creates a 3D vector with the given x, y, and z values.
     * @param x The X component of the vector.
     * @param y The Y component of the vector.
     * @param z The Z component of the vector.
     */
    public Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.xRelative = false;
        this.yRelative = false;
        this.zRelative = false;
    }

    /**
     * Creates a 3D vector with the given x, y, and z values, and whether each value is relative to the entity.
     * @param x The X component of the vector.
     * @param y The Y component of the vector.
     * @param z The Z component of the vector.
     */
    public Vector3(int x, int y, int z, boolean xRelative, boolean yRelative, boolean zRelative) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.xRelative = xRelative;
        this.yRelative = yRelative;
        this.zRelative = zRelative;
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
     * @param x The value to set the X component to.
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
     * @param y The value to set the Y component to.
     * @return True if success, false if failure.
     */
    public boolean setY(int y) {
        this.y = y;
        return true;
    }


    /**
     *
     * @return The Z component of the vector.
     */
    public double getZ() {
        return z;
    }

    /**
     *
     * @param z The value to set the Z component to.
     * @return True if success, false if failure.
     */
    public boolean setZ(int z) {
        this.z = z;
        return true;
    }


    /**
     * Whether the X value is relative to the entity.
     * @return Whether the X value is relative to the entity.
     */
    public boolean isxRelative() {
        return xRelative;
    }

    /**
     * Set whether the X value is relative to the entity.
     * @param xRelative Whether the X value is relative to the entity.
     */
    public void setxRelative(boolean xRelative) {
        this.xRelative = xRelative;
    }

    /**
     * Whether the U value is relative to the entity.
     * @return Whether the Y value is relative to the entity.
     */
    public boolean isyRelative() {
        return yRelative;
    }

    /**
     * Set whether the Y value is relative to the entity.
     * @param yRelative Whether the Y value is relative to the entity.
     */
    public void setyRelative(boolean yRelative) {
        this.yRelative = yRelative;
    }

    /**
     * Whether the Z value is relative to the entity.
     * @return Whether the Z value is relative to the entity.
     */
    public boolean iszRelative() {
        return zRelative;
    }

    /**
     * Set whether the Z value is relative to the entity.
     * @param zRelative Whether the Z value is relative to the entity.
     */
    public void setzRelative(boolean zRelative) {
        this.zRelative = zRelative;
    }


    /**
     * Converts the vector into a String usable in mcfunctions
     * @return The X, Y, and Z components of the vector separated by spaces.
     */
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
