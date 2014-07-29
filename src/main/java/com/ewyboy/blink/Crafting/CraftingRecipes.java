package com.ewyboy.blink.Crafting;

import com.ewyboy.blink.Blocks.Technical.Block;
import com.ewyboy.blink.Items.Techical.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes {


    public static void init()
    {
        registerRecipies();
    }

    private static void registerRecipies() {

        GameRegistry.addRecipe(new ItemStack(Item.Blitzer),
                new Object[] {  "XAX","IOI","XAX"  ,
                        'X', new ItemStack(Items.ender_pearl),
                        'O', new ItemStack(Items.clock),
                        'A', new ItemStack(Items.blaze_rod),
                        'I', new ItemStack(Items.blaze_powder)});

        GameRegistry.addRecipe(new ItemStack(Item.OffTaker),
                new Object[] { "FXF"," I "," I ",
                        'I', new ItemStack(Items.blaze_rod),
                        'X', new ItemStack(Items.ender_pearl),
                        'F', new ItemStack(Items.feather),
                });

        GameRegistry.addRecipe(new ItemStack(Item.EnderCapsule, 2),
                new Object[] {" X ","XOX"," X ",
                        'X', new ItemStack(Items.gold_ingot),
                        'O', new ItemStack(Items.ender_pearl),
                });

        GameRegistry.addRecipe(new ItemStack(Block.Swapper),
                new Object[] {"XAX","XOX","XAX",
                        'X', new ItemStack(Items.gold_ingot),
                        'O', new ItemStack(Item.EnderCapsule),
                        'A', new ItemStack(Blocks.stone)
                });
    }
}
