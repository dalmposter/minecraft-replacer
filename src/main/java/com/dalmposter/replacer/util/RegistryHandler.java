package com.dalmposter.replacer.util;

import com.dalmposter.replacer.Replacer;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Replacer.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Replacer.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);


    public static void init ()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}