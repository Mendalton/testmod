package net.mendalton.mod.blocks;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class epicOre {
    public static final Block EPIC_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).strength(3, 1f));

    private static ConfiguredFeature<?, ?> EPIC_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, EPIC_ORE.getDefaultState(), 9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)))
            .spreadHorizontally()
            .repeat(20);

    public static void register(){
        Registry.register(Registry.BLOCK, new Identifier("testmod", "epic_ore"), EPIC_ORE);
        Registry.register(Registry.ITEM, new Identifier("testmod", "epic_ore"), new BlockItem(EPIC_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        RegistryKey<ConfiguredFeature<?, ?>> epicOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("testmod", "epic_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, epicOreOverworld.getValue(), EPIC_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, epicOreOverworld);
    }
}
