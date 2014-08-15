package com.ewyboy.blink.Items.Item;

import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
import com.ewyboy.blink.Items.Techical.ItemInfo;
import com.ewyboy.blink.Main.Blink;
import com.ewyboy.blink.Network.Proxies.ClientProxy;
import com.ewyboy.blink.Textures.TexturePath;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class Blitzer extends Item {

    public Blitzer()
    {
        super();
        setCreativeTab(BlinkCreativeTabs.BlinkItemTab);
        setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
    {
        info.add("Press shift to show info");

        if (ClientProxy.shiftPressed())
        {
            info.add("Telport trough 1 block thick walls");
            info.add("Sneak to go down");
            info.add("Jump to go up");
            info.add("Sprinting to go trough 2 block thick walls");
        }
    }

    private void spawnEnderEffects(World world, EntityPlayer player, double x, double y, double z) {

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

   public boolean canPlayerFitInSpace(World world, EntityPlayer player, double x, double y , double z){
       return world.getBlock((int)x, (int)y, (int)z) == Blocks.air && world.getBlock((int)x, (int)y+1,(int) z) == Blocks.air;
   }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hit) {

        double X = player.posX;
        double Z = player.posZ;
        double Y = player.posY;

        double upY = 3.75;
        double downY = 2.75;
        double blink = 1.75;

        int test = MathHelper.floor_double((double)((player.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        spawnEnderEffects(world,player,X,Y,Z);

        if (!world.isRemote) {

            if (player.isSprinting()) {
                if (test == 1) {
                    if(canPlayerFitInSpace(world ,player ,x-2.2,y-1,z) == true) {
                        X = X - blink * 2;
                    }
                }
                if (test == 3) {
                    if(canPlayerFitInSpace(world ,player ,x+2.2,y-1,z) == true) {
                        X = X + blink * 2;
                    }
                }
                if (test == 2) {
                    if(canPlayerFitInSpace(world ,player ,x,y-1,z-2.2) == true) {
                        Z = Z - blink * 2;
                    }
                }
                if (test == 0) {
                    if(canPlayerFitInSpace(world ,player ,x,y-1,z+2.2) == true) {
                        Z = Z + blink * 2;
                    }
                }
            } else if(!player.onGround) {
                if(canPlayerFitInSpace(world ,player ,x,y+2,z) == true) {
                    Y = Y + upY;
                }
            } else if (player.isSneaking()) {
                if(canPlayerFitInSpace(world,player,x,y-1.5,z) == true) {
                    Y = Y - downY;
                }
            } else {
                if (test == 1) {
                    if(canPlayerFitInSpace(world ,player ,x-1,y-1.2,z) == true) {
                        X = X - blink;
                    }
                }
                if (test == 3) {
                    if(canPlayerFitInSpace(world ,player ,x+1,y-1.2,z) == true) {
                        X = X + blink;
                    }
                }
                if (test == 2) {
                    if(canPlayerFitInSpace(world ,player ,x,y-1,z-1.2) == true) {
                        Z = Z - blink;
                    }
                }
                if (test == 0) {
                    if(canPlayerFitInSpace(world ,player ,x,y-1,z+1.2) == true) {
                        Z = Z + blink;
                    }
                }
            }
               player.setPositionAndUpdate(X, Y, Z);
        } else {
            return false;
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    private IIcon BlitzerIcons;
    private IIcon BlitzerActiveIcons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        BlitzerIcons = register.registerIcon(TexturePath.TextureLocation + ":" + ItemInfo.BlitzerTexture);
        BlitzerActiveIcons = register.registerIcon(TexturePath.TextureLocation + ":" + ItemInfo.BlitzerActivatedTexture);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage (int dmg) {
        return BlitzerActiveIcons;
    }
}
