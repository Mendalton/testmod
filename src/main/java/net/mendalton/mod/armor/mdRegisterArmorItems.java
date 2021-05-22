package net.mendalton.mod.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class mdRegisterArmorItems {
    public static final ArmorMaterial MD_ARMOR_MATERIAL = new mdArmorMaterials();
    public static final Item MD_MATERIAL_HELMET = new ArmorItem(MD_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item MD_MATERIAL_CHESTPLATE = new ArmorItem(MD_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item MD_MATERIAL_LEGGINGS = new ArmorItem(MD_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item MD_MATERIAL_BOOTS = new ArmorItem(MD_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("testmod", "md_helmet"), MD_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("testmod", "md_chestplate"), MD_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("testmod", "md_leggings"), MD_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("testmod", "md_boots"), MD_MATERIAL_BOOTS);
    }
}
