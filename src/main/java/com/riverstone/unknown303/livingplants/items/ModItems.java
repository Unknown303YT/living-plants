package com.riverstone.unknown303.livingplants.items;

import com.riverstone.unknown303.livingplants.PlantsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PlantsMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        MOD_ITEMS.register(eventBus);
    }
}
