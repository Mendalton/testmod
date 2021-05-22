package net.mendalton.mod.armor;

import net.mendalton.mod.testmod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class mdArmorMaterials implements ArmorMaterial{
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {150, 150, 150, 150};
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 500;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 25;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_ANVIL_HIT;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(testmod.FABRIC_ITEM);
    }
    @Override
    public String getName() {
        return "md";
    }
    @Override
    public float getToughness() {
        return 30.0f;
    }
    @Override
    public float getKnockbackResistance() {
        return 0;
    }
    
}
