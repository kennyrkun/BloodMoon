package uk.co.jacekk.bukkit.bloodmoon.entity;

import net.minecraft.server.v1_8_R3.EntityMonster;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftLivingEntity;
import uk.co.jacekk.bukkit.bloodmoon.BloodMoon;

public class BloodMoonEntityBlaze extends BloodMoonEntityMonster {

    public BloodMoonEntityBlaze(BloodMoon plugin, EntityMonster nmsEntity, CraftLivingEntity bukkitEntity, BloodMoonEntityType type) {
        super(plugin, nmsEntity, bukkitEntity, type);
    }
    
}
