package net.mendalton.mod.item;

import net.mendalton.mod.gui.guiMain;
import net.mendalton.mod.gui.guiScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GuiTestItem extends Item {
    public GuiTestItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        MinecraftClient.getInstance().openScreen(new guiScreen(new guiMain()));
        return super.use(world, user, hand);
    }
}
