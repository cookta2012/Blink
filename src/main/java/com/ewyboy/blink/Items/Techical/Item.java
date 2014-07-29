package com.ewyboy.blink.Items.Techical;

import com.ewyboy.blink.Items.Item.Blitzer;
import com.ewyboy.blink.Items.Item.OffTaker;
import com.ewyboy.blink.Items.Item.RodOfAges;
import cpw.mods.fml.common.registry.GameRegistry;

public class Item {

    public static net.minecraft.item.Item Blitzer;
    public static net.minecraft.item.Item RodOfAges;
    public static net.minecraft.item.Item EnderCapsule;
    public static net.minecraft.item.Item OffTaker;


    public static void Init() {
        registerItems();
        addItems();
    }

    public static void registerItems() {
        Blitzer = new Blitzer().setUnlocalizedName(ItemInfo.BlitzerUnlocalized);
        RodOfAges = new RodOfAges().setUnlocalizedName(ItemInfo.RodOfAgesUnlocalized);
        EnderCapsule = new com.ewyboy.blink.Items.Item.EnderCapsule().setUnlocalizedName(ItemInfo.EnderCapsuleUnlocalized);
        OffTaker = new com.ewyboy.blink.Items.Item.OffTaker().setUnlocalizedName(ItemInfo.OffTakerUnlocalized);
    }

    public static void addItems() {
        GameRegistry.registerItem(Blitzer,ItemInfo.BlitzerUnlocalized);
        GameRegistry.registerItem(RodOfAges,ItemInfo.RodOfAgesUnlocalized);
        GameRegistry.registerItem(EnderCapsule,ItemInfo.EnderCapsuleUnlocalized);
        GameRegistry.registerItem(OffTaker, ItemInfo.OffTakerUnlocalized);
    }

}
