package net.mendalton.mod;



import net.fabricmc.api.ModInitializer;
import net.mendalton.mod.blocks.epicOre;
import net.mendalton.mod.blocks.mdOre;
import net.mendalton.mod.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mendalton.mod.armor.mdRegisterArmorItems;
import net.mendalton.mod.blocks.MdBlock;
import net.mendalton.mod.item.axe.AxeBase;
import net.mendalton.mod.item.axe.AxeMod;
import net.mendalton.mod.item.sword.SwordBase;
import net.mendalton.mod.item.sword.SwordMod;

public class testmod implements ModInitializer {

    public static final String MODID = "testmod";

    public static final Item FABRIC_ITEM = new FabricItem(new Item.Settings().group(ItemGroup.MISC));

    public static final Block FABRIC_BLOCK = new MdBlock();

    public static Item GUITEST_ITEM = new GuiTestItem(new Item.Settings().group(ItemGroup.MISC));
    @Override
    public void onInitialize(){
        Registry.register(Registry.ITEM, new Identifier(MODID, "fabric_item"), FABRIC_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "fabric_pickaxe"), new PickaxeBase(new ToolMod(), 0, 0, null));
        Registry.register(Registry.ITEM, new Identifier(MODID, "mendalton_axe"), new AxeBase(new AxeMod(), 0, 0, null));
        Registry.register(Registry.ITEM, new Identifier(MODID, "mendalton_sword"), new SwordBase(new SwordMod(), 0, 0, null));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "mod_block"), FABRIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "mod_block"), new BlockItem(FABRIC_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "gui_item"), GUITEST_ITEM);


        mdRegisterArmorItems.register();
        mendorite.register();
        epicOre.register();
        mdOre.register();



    }
    
}
