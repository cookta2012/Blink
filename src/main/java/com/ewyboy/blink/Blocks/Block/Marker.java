package com.ewyboy.blink.Blocks.Block;

import com.ewyboy.blink.Blocks.Technical.BlockInfo;
import com.ewyboy.blink.CreativeTabs.BlinkCreativeTabs;
import com.ewyboy.blink.Textures.TexturePath;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Marker extends Block {

    public Marker() {
        super(Material.circuits);
        setCreativeTab(BlinkCreativeTabs.BlinkBlockTab);
        setLightLevel(0.250F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public Block setBlockUnbreakable()
    {
        this.setHardness(-1.0F);
        return this;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return 0;
    }

    public boolean isCollidable()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
    private IIcon TextureIcon;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        TextureIcon = register.registerIcon(TexturePath.TextureLocation + ":" +  BlockInfo.MarkerTexture);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
    {
        if (side == 1)
        {
            return TextureIcon;
        }
        else if (side == 0)
        {
            return TextureIcon;
        }
        return TextureIcon;
    }


}
