package com.ewyboy.blink.Blocks.Block;

import com.ewyboy.blink.Blocks.Technical.BlockInfo;
import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
import com.ewyboy.blink.Textures.TexturePath;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class Swapper extends Block {

    public Swapper() {
        super(Material.iron);
        setHardness(1.0f);
        setCreativeTab(BlinkCreativeTabs.BlinkBlockTab);
    }

    private void spawnEnderEffectsPlayer(World world, EntityPlayer player, double x, double y, double z) {

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

    private void spawnEnderEffectsEntity(World world, Entity player, double x, double y, double z) {

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

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int par2, int par3, int par4)
    {
        float f = 0.05F;
        return AxisAlignedBB.getBoundingBox((double) par2, (double) par3, (double) par4, (double) (par2 + 1), (double) ((float) (par3 + 1) - f), (double) (par4 + 1));
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    public String posToString(int x, int y, int z) {
        return x + " " + y + " " + z;
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
            if(entity instanceof EntityPlayer)
            {
                EntityPlayer player = (EntityPlayer) entity;

                ArrayList<String> test = new ArrayList<String>();
                Random random = new Random();

                if (player.isSneaking() == true) {
                    if (!world.isRemote) {
                        if     (world.getBlock(x - 2, y, z) == this){ test.add(posToString       (x-2, y, z));}
                        else if(world.getBlock(x + 2, y, z) == this){ test.add(posToString       (x+2, y, z));}
                        else if(world.getBlock(x, y, z - 2) == this){ test.add(posToString       (x, y, z-2));}
                        else if(world.getBlock(x, y, z + 2) == this){ test.add(posToString       (x, y, z+2));}

                        else if(world.getBlock(x + 2, y, z + 2) == this){ test.add(posToString   (x+2, y, z+2));}
                        else if(world.getBlock(x - 2, y, z + 2) == this){  test.add(posToString  (x-2, y, z+2));}
                        else if(world.getBlock(x + 2, y, z - 2) == this){  test.add(posToString  (x+2, y, z-2));}
                        else if(world.getBlock(x - 2, y, z - 2) == this){  test.add(posToString  (x-2, y, z-2));}

                        else if(world.getBlock(x,y,z) == this) { test.add(posToString(x,y,z));}

                        int selection = random.nextInt(test.size());
                        String posString = test.get(selection);
                        String[] POS = posString.split(" ");
                        String X = POS[0], Y = POS[1], Z = POS[2];
                        int iX = Integer.parseInt(X), iY = Integer.parseInt(Y), iZ = Integer.parseInt(Z);
                        player.setPositionAndUpdate(iX + 0.5, iY + 1.5, iZ + 0.5);
                    }
                    spawnEnderEffectsPlayer(world,player,x,y,z);
                    spawnEnderEffectsEntity(world,entity,x,y,z);
                }
            }

            if(entity instanceof EntityItem){

                ArrayList<String> test = new ArrayList<String>();
                Random random = new Random();

                if     (world.getBlock(x - 2, y, z) == this){ test.add(posToString(x-3, y, z));}
                else if(world.getBlock(x + 2, y, z) == this){ test.add(posToString(x+3, y, z));}
                else if(world.getBlock(x, y, z - 2) == this){ test.add(posToString(x, y, z-3));}
                else if(world.getBlock(x, y, z + 2) == this){ test.add(posToString(x, y, z+3));}

                else if(world.getBlock(x + 2, y, z + 2) == this){  test.add(posToString(x+3, y, z+3));}
                else if(world.getBlock(x - 2, y, z + 2) == this){  test.add(posToString(x-3, y, z+3));}
                else if(world.getBlock(x + 2, y, z - 2) == this){  test.add(posToString(x+3, y, z-3));}
                else if(world.getBlock(x - 2, y, z - 2) == this){  test.add(posToString(x-3, y, z-3));}

                else if(world.getBlock(x,y,z) == this) { test.add(posToString(x,y,z));}

                int selection = random.nextInt(test.size());
                String posString = test.get(selection);
                String[] POS = posString.split(" ");
                String X = POS[0], Y = POS[1], Z = POS[2];
                int iX = Integer.parseInt(X), iY = Integer.parseInt(Y), iZ = Integer.parseInt(Z);
                entity.setPosition(iX + 0.5, iY + 1.5, iZ + 0.5);
                spawnEnderEffectsEntity(world,entity,x,y,z);
            }
    }

    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SidesIcon;

    @SideOnly(Side.CLIENT)
    private IIcon BotIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        TopIcon = register.registerIcon(TexturePath.TextureLocation + ":" +  BlockInfo.SwapperTopTexture);
        SidesIcon = register.registerIcon(TexturePath.TextureLocation + ":" +  BlockInfo.SwapperSidesTexture);
        BotIcon = register.registerIcon(TexturePath.TextureLocation + ":" +  BlockInfo.SwapperBotTexture);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 1) {
            return TopIcon;
        }
        else if (side == 0) {
            return BotIcon;
        }
        return SidesIcon;
    }

}
