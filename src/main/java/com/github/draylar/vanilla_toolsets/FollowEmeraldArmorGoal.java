package com.github.draylar.vanilla_toolsets;

import com.github.draylar.vanilla_toolsets.tools.emerald.ArmorEmerald;
import net.minecraft.entity.ai.goal.FollowTargetGoal;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.entity.player.PlayerEntity;

public class FollowEmeraldArmorGoal extends FollowTargetGoal
{
    public FollowEmeraldArmorGoal(MobEntityWithAi mobEntityWithAi_1, Class class_1, boolean boolean_1)
    {
        super(mobEntityWithAi_1, class_1, boolean_1);
    }

    @Override
    public boolean canStart()
    {
        this.field_6644 = this.entity.world.method_8439(this.entity.x, this.entity.y + (double) this.entity.getEyeHeight(), this.entity.z, this.getFollowRange(), this.getFollowRange(), null, null);
        PlayerEntity playerEntity = (PlayerEntity) field_6644;

        if(playerEntity != null)
        {
            if (
                    playerEntity.inventory.armor.get(0).getItem().equals(ArmorEmerald.emeraldBoots)
                            && playerEntity.inventory.armor.get(0).getItem().equals(ArmorEmerald.emeraldLeggings)
                            && playerEntity.inventory.armor.get(0).getItem().equals(ArmorEmerald.emeraldChestplate)
                            && playerEntity.inventory.armor.get(0).getItem().equals(ArmorEmerald.emeraldHelmet)
            )
            {
                System.out.println("found target");
                return true;
            } else
            {
                System.out.println("not");
            }
        }

        return false;
    }
}
