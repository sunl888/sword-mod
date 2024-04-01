package com.sunl.swordmod.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

/**
 * 自定义剑
 *
 * @author sunl
 * @date 2024/4/1
 */
public class CustomSwordItem extends SwordItem {
    public CustomSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
