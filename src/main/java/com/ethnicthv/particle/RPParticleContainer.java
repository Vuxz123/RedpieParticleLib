package com.ethnicthv.particle;

import com.ethnicthv.execption.ParticleLoctionListExepction;
import org.bukkit.Location;
import org.bukkit.util.Vector;
import xyz.xenondevs.particle.ParticleBuilder;

import java.util.ArrayList;
import java.util.List;

public class RPParticleContainer {
    private List<Object> packages;

    public RPParticleContainer(){
        packages = new ArrayList<>();
    }

    public void addParticle(ParticleBuilder p){
        packages.add(p.toPacket());
    }

    public List<Object> getPackages() {
        return packages;
    }
}
