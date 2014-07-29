package com.ewyboy.blink.Items.Item;

import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
import com.ewyboy.blink.Items.Techical.ItemInfo;
import com.ewyboy.blink.Textures.TexturePath;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class EnderCapsule extends Item {

        public EnderCapsule() {
            super();
            setMaxStackSize(1);
            setCreativeTab(BlinkCreativeTabs.BlinkItemTab);
        }

    @SideOnly(Side.CLIENT)
    private IIcon EnderCapsuleIcons;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        EnderCapsuleIcons = register.registerIcon(TexturePath.TextureLocation + ":" + ItemInfo.EnderCapsuleTexture);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage (int dmg) {
        return EnderCapsuleIcons;
    }
}

