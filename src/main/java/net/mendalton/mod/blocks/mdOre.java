package net.mendalton.mod.blocks;


import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.structure.rule.BlockMatchRuleTest;
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

public class mdOre{

    public static final Block ORE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 4).sounds(BlockSoundGroup.STONE).strength(50, 600));

    private static ConfiguredFeature<?, ?> ORE_BLOCK_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), ORE_BLOCK.getDefaultState(), 3))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 54)))
            .spreadHorizontally()
            .repeat(3);

    public static void register(){

        Registry.register(Registry.BLOCK, new Identifier("testmod", "md_ore"), ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("testmod", "md_ore"), new BlockItem(ORE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        RegistryKey<ConfiguredFeature<?, ?>> oreOveworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("testmod", "md_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreOveworld.getValue(), ORE_BLOCK_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreOveworld);

    }
}


 
