package com.sunl.swordmod;

import com.sunl.swordmod.item.CustomSwordItem;
import com.sunl.swordmod.toolmaterial.AdvancedToolMaterial;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * 剑模组
 *
 * @author sunl
 * @date 2024/4/1
 */
public class SwordMod implements ModInitializer {
    public static final Item CUSTOM_SWORD_ITEM =
            new CustomSwordItem(AdvancedToolMaterial.INSTANCE, 1, 2f, new FabricItemSettings());

    @Override
    public void onInitialize() {
        // 注册一个自定义剑物品
        Registry.register(Registries.ITEM, new Identifier("swordmod", "custom_sword"), CUSTOM_SWORD_ITEM);
        // 添加到物品组
        		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{
        			content.add(CUSTOM_SWORD_ITEM);
        		});
    }
}
