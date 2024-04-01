package com.sunl.swordmod.toolmaterial;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * 高级材质（自定义材质，类似mc官方的木质、石质、铁质、金质和钻石质等工具材料）
 *
 * @author sunl
 * @date 2024/3/30
 */
public class AdvancedToolMaterial implements ToolMaterial {
    // ToolMaterial不需要注册。将其传递给需要的工具的一种较好的方法，是将实例保存在某个地方（然后在需要时引用它）。
    // 在本例中，我们把实例放在ToolMaterial类的顶部：
    public static final AdvancedToolMaterial INSTANCE = new AdvancedToolMaterial();

    /**
     * 使用此材料时的耐久
     */
    @Override
    public int getDurability() {
        return 1000;
    }

    /**
     * 工具破坏方块的速度。木制工具的速度为2.0F，钻石工具的速度为8.0F
     */
    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    /**
     *  工具的基本伤害。注意大多数工具在其构造器中都需要一个整数，
     *  这意味着最终的攻击伤害为(float) materialDamage + (int) toolDamage + 1。
     *  如果你需要工具在其构造器中完全控制其伤害数量，你可以让材料返回0F的攻击伤害。
     *  */
    @Override
    public float getAttackDamage() {
        return 10F;
    }

    /**
     * 设置了工具的挖掘等级。钻石的挖掘等级为3，黑曜石需要3+的挖掘等级来挖掘。
     */
    @Override
    public int getMiningLevel() {
        return 0;
    }

    /**
     * 定义了工具可以如何附魔。金有22的附魔能力，钻石的附魔能力为10。更高的附魔能力意味着更好（更高等级）的附魔。
     */
    @Override
    public int getEnchantability() {
        return 30;
    }

    /**
     * 返回在铁砧中修复物品所需要的Ingredient
     */
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.POTATO);
    }
}
