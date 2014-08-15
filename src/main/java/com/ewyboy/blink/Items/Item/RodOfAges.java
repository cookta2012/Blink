package com.ewyboy.blink.Items.Item;

import com.ewyboy.blink.Blocks.Technical.Block;
import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
import com.ewyboy.blink.Items.Techical.ItemInfo;
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
import net.minecraft.world.World;

import java.util.List;

public class RodOfAges extends Item {

    public RodOfAges() {
        super();
        setMaxStackSize(1);
        setCreativeTab(BlinkCreativeTabs.BlinkItemTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hit) {
        if (player.isSneaking() == true) {
            //Store player pos and draw a texture onto the block im standing on if possible
            if (world.isAirBlock(x, y+1 ,z) && (world.isAirBlock(x, y+2 ,z))) {
                world.setBlock(x, y + 1 , z , Block.Marker);
            }
            if (world.getBlock(x, y, z) == Block.Marker) {
                world.setBlockToAir(x,y+1,z);
            }
        }
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
    {
        info.add("Shift to show info");

        if (ClientProxy.shiftPressed())
        {
            info.add("Work in progress");
        }
    }

    public int getItemEnchantability() {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    private IIcon RodIcons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        RodIcons = register.registerIcon(TexturePath.TextureLocation + ":" + ItemInfo.RodOfAgesTexture);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage (int dmg) {
        return RodIcons;
    }

}
