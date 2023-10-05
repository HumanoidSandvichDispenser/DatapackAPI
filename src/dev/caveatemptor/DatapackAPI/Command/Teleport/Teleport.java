package dev.caveatemptor.DatapackAPI.Command.Teleport;

import dev.caveatemptor.DatapackAPI.Entity.Entity;
import dev.caveatemptor.DatapackAPI.Positional.Location.Location;
import dev.caveatemptor.DatapackAPI.Positional.Rotation.Rotation;


// TODO: Implement facingEntity

/**
 * Represents the teleport command.
 */
public class Teleport implements dev.caveatemptor.DatapackAPI.Command.Command {
    Entity target;
    Location location;
    Rotation rotation;
    Location facingLocation;


    /**
     * Creates a new Teleport command with the given Target and location.
     * @param target Defines what entities will be selected as a target.
     * @param location The location to teleport the target(s) to.
     */
    public Teleport(Entity target, Location location) {
        this.target = target;
        this.location = location;
    }


    /**
     * Creates a new Teleport command with the given Target, location, and rotation.
     * @param target Defines what entities will be selected as a target.
     * @param location The location to teleport the target(s) to.
     * @param rotation The rotation to set the target(s) to.
     */
    public Teleport(Entity target, Location location, Rotation rotation) {
        this.target = target;
        this.location = location;
        this.rotation = rotation;
    }

    /**
     * Creates a new Teleport command with the given location, facing facingLocation.
     * @param target Defines what entities will be selected as a target.
     * @param location The location to teleport the target to.
     * @param facingLocation The location to face towards.
     */
    public Teleport(Entity target, Location location, Location facingLocation) {
        this.target = target;
        this.location = location;
        this.facingLocation = facingLocation;
    }

    /**
     * Creates a new Teleport command with the given location. This will only affect the entity executing the command.
     * @param location The location to teleport the target to.
     */
    public Teleport(Location location) {
        this.location = location;
    }


    /**
     * Converts the Teleport command into a String usable in mcfunctions
     * @return The generated Minecraft command.
     */
    @Override
    public String generate() {
        String generated = "teleport ";

        if (target != null) {
            generated += target.generate() + " ";
        }

        generated += location.generate();

        if (rotation != null) {
            generated += " " + rotation.generate() + " ";
        }

        if (facingLocation != null) {
            generated += " facing " + facingLocation.generate();
        }

        return generated;
    }
}
