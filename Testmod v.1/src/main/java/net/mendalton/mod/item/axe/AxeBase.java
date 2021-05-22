package net.mendalton.mod.item.axe;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;

public class AxeBase extends AxeItem{

    public AxeBase(ToolMaterial material_1, float attackDamage, float attackSpeed, Settings settings) {
        super(material_1, -48, -1.f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
