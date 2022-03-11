package com.ethnicthv.particle;

import org.bukkit.Location;
import org.bukkit.util.Vector;
import xyz.xenondevs.particle.ParticleBuilder;
import xyz.xenondevs.particle.ParticleEffect;

public class RPParticleBuilder {

    private Location location;
    private ParticleEffect particleEffect;
    private int amount;
    private Vector offset;
    private float speed;

    public RPParticleBuilder(ParticleEffect particle, Location location) {
        this.location = location;
        this.particleEffect = particle;
    }

    public RPParticleBuilder(ParticleEffect particle){
        this.particleEffect = particle;
    }

    public void setOffset(Vector offset) {
        this.offset = offset;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ParticleBuilder create(){
        if(location == null) return new  ParticleBuilder(particleEffect)
                .setOffset(offset)
                .setSpeed(speed)
                .setAmount(amount);
        else return new ParticleBuilder(particleEffect,location)
                .setOffset(offset)
                .setSpeed(speed)
                .setAmount(amount);
    }

    public Location getLocation(){
        return location;
    }
}
