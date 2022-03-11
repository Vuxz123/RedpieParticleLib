package com.ethnicthv;

import com.comphenix.protocol.ProtocolLib;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.ethnicthv.execption.ParticleLoctionListExepction;
import com.ethnicthv.particle.RPParticleBuilder;
import com.ethnicthv.particle.RPParticleContainer;
import com.ethnicthv.particle.RPParticleType;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.xenondevs.particle.ParticleEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class Main extends JavaPlugin {

    private ProtocolManager protocolManager;

    @Override
    public void onLoad(){
        protocolManager = ProtocolLibrary.getProtocolManager();
    }

    public ProtocolManager getProtocolManager(){
        return protocolManager;
    }

}
