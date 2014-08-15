package com.ewyboy.blink.Blocks.Technical;

import com.ewyboy.blink.Blocks.Block.Marker;
import com.ewyboy.blink.Blocks.Block.Swapper;
import cpw.mods.fml.common.registry.GameRegistry;

public class Block {

    public static net.minecraft.block.Block Swapper;
    public static net.minecraft.block.Block Marker;

    public static void Init () {

        registerBlocks();
        addBlocks();
    }

    public static void registerBlocks() {
        Swapper = new Swapper().setBlockName(BlockInfo.SwapperBlockName);
        Marker = new Marker().setBlockName(BlockInfo.MarkerBlockName);
    }

    public static void addBlocks() {
        GameRegistry.registerBlock(Swapper, BlockInfo.SwapperKey);
        GameRegistry.registerBlock(Marker, BlockInfo.MarkerKey);
    }

}
