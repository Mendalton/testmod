package net.mendalton.mod.item.sword;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;
public class SwordBase extends SwordItem{

    public SwordBase(ToolMaterial material_1, int attackDamage, float attackSpeed, Settings settings) {
        super(material_1, 500, 10.1f, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
