package com.ewyboy.blink.Items.Item;

import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
import com.ewyboy.blink.Items.Techical.ItemInfo;
import com.ewyboy.blink.Textures.TexturePath;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class OffTaker extends Item {

    public OffTaker() {
        super();
        setCreativeTab(BlinkCreativeTabs.BlinkItemTab);
    }

    private void spawnEffectsForClock(World world, EntityPlayer player, double x, double y, double z) {

        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY -0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY -0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());


        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());

        world.spawnParticle("portal", player.posX + Math.random(), player.posY +0.5 - Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 + Math.random(), player.posZ - Math.random(), Math.random(), Math.random(), Math.random());
        world.spawnParticle("portal", player.posX - Math.random(), player.posY +0.5 - Math.random(), player.posZ + Math.random(), Math.random(), Math.random(), Math.random());

        world.playSound(x + 0.5D, y + 0.5D, z + 0.5D, "mob.endermen.portal", 0.5F, 0.4F + 0.8F, false);
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hit) {
        player.jump();
        spawnEffectsForClock(world,player,x,y,z);

        return true;
    }

    @SideOnly(Side.CLIENT)
    private IIcon OffTakerIcons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        OffTakerIcons = register.registerIcon(TexturePath.TextureLocation + ":" + ItemInfo.OffTakerTexture);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage (int dmg) {
        return OffTakerIcons;
    }
}
