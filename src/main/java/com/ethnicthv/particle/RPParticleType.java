package com.ethnicthv.particle;

import com.ethnicthv.execption.ParticleLoctionListExepction;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.Vector;

import java.util.List;

public enum RPParticleType{
    LINE((p,l,c) -> {
        if(l.size() != 2){
            throw new ParticleLoctionListExepction();
        }
        Vector begin = l.get(0).toVector().clone();
        Vector end = l.get(1).toVector();
        World w = l.get(0).getWorld();
        Vector a = new Vector(Math.abs(begin.getX() - end.getX()), Math.abs(begin.getY()-end.getY()), Math.abs(begin.getZ()-end.getZ()));
        double length = a.length();
        Vector cvil = new Vector(0,0,0);
        a.normalize();
        while(cvil.length() < length){
            c.setLocation(begin.add(cvil).toLocation(w));
            p.addParticle(c.create());
            cvil.add(a);
        }
    }),

    ;
    RPParticleDisplay method;
    RPParticleType(RPParticleDisplay m){
        method = m;
    }

    public void run(RPParticleContainer particle, List<Location> locations, RPParticleBuilder p) throws ParticleLoctionListExepction {
        method.display(particle, locations, p);
    }

}
