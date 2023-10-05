package dev.caveatemptor.DatapackAPI.Location;

public class Location {
    private final double x;
    private final double y;
    private final double z;
    private final boolean xRelative;
    private final boolean yRelative;
    private final boolean zRelative;


    public Location(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xRelative = false;
        this.yRelative = false;
        this.zRelative = false;
    }

    public Location(double x, double y, double z, boolean xRelative, boolean yRelative, boolean zRelative) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xRelative = xRelative;
        this.yRelative = yRelative;
        this.zRelative = zRelative;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
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
