package com.ethnicthv.particle;

import com.ethnicthv.execption.ParticleLoctionListExepction;
import org.bukkit.Location;

import java.util.List;

public interface RPParticleDisplay {
    abstract public void display(RPParticleContainer particle, List<Location> locations, RPParticleBuilder color) throws ParticleLoctionListExepction;
}
