package dev.caveatemptor.DatapackAPI.Positional.Rotation;

public class Rotation {
    private final double yaw;
    private final double pitch;
    private boolean yawRelative, pitchRelative;


    public Rotation(double yaw, double pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public Rotation(double yaw, double pitch, boolean yawRelative, boolean pitchRelative) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.yawRelative = yawRelative;
        this.pitchRelative = pitchRelative;
    }


    public String generate() {
        String generated = "";
        if (yawRelative) {
            generated += "~";
        }
        generated += yaw;

        if (pitchRelative) {
            generated += "~";
        }
        generated += pitch;

        return generated;
    }
}
