package net.mendalton.mod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class mendorite extends Item{

    public mendorite(Settings settings) {
        super(settings);
    }

    public static final Item MENDORITE = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item MENDORITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC)){
        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand) {

            PlayerEntity.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
            return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
        }
    };

    public static void register(){

        Registry.register(Registry.ITEM, new Identifier("testmod", "mendorite"), MENDORITE);
        Registry.register(Registry.ITEM, new Identifier("testmod", "mendorite_ingot"), MENDORITE_INGOT);
    }
    
}
