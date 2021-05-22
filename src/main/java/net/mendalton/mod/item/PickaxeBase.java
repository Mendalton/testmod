package net.mendalton.mod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial material_1, int attackDamage, float attackSpeed, Settings settings) {
        super(material_1, -1, -2.f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
