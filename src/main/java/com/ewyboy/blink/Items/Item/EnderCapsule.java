    package com.ewyboy.blink.Items.Item;

    import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
    import com.ewyboy.blink.Items.Techical.ItemInfo;
    import com.ewyboy.blink.Network.Proxies.ClientProxy;
    import com.ewyboy.blink.Textures.TexturePath;
    import cpw.mods.fml.relauncher.Side;
    import cpw.mods.fml.relauncher.SideOnly;
    import net.minecraft.client.renderer.texture.IIconRegister;
    import net.minecraft.entity.player.EntityPlayer;
    import net.minecraft.item.Item;
    import net.minecraft.item.ItemStack;
    import net.minecraft.util.IIcon;

    import java.util.List;

    public class EnderCapsule extends Item {

        public EnderCapsule() {
            super();
            setMaxStackSize(64);
            setCreativeTab(BlinkCreativeTabs.BlinkItemTab);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
        {
            info.add("Press shift to show info");

            if (ClientProxy.shiftPressed())
            {
                info.add("A crafting component for the swapper");
            }
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

