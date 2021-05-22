package net.mendalton.mod.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMod implements ToolMaterial{
    @Override
    public float getAttackDamage(){
        return 3.1f;
    }
    @Override
    public int getDurability(){
        return 1000;
    }
    @Override 
    public int getEnchantability(){
        return 30;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 200000;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
    
}
