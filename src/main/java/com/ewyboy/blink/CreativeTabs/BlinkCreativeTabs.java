package com.ewyboy.blink.CreativeTabs;

import com.ewyboy.blink.Blocks.Technical.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlinkCreativeTabs {

    public static void Init() {
        AddCreativeTabs();
    }

    public static void AddCreativeTabs()  {
    }

    public static CreativeTabs BlinkBlockTab = new CreativeTabs ("Blink Blocks") {
        public ItemStack getIconItemStack() {
            return new ItemStack(Block.Swapper);
        }

        @Override
        public Item getTabIconItem() {
            return null;
        }
    };

    public static CreativeTabs BlinkItemTab = new CreativeTabs ("Blink Items") {
        public ItemStack getIconItemStack() {
            return new ItemStack(com.ewyboy.blink.Items.Techical.Item.Blitzer);
        }

        @Override
        public Item getTabIconItem() {
            return null;
        }
    };
}
