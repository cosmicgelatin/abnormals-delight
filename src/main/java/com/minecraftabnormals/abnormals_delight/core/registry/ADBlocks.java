package com.minecraftabnormals.abnormals_delight.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.minecraftabnormals.abnormals_delight.common.block.AbnormalsPantryBlock;
import com.minecraftabnormals.abnormals_delight.core.AbnormalsDelight;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AbnormalsDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ADBlocks {
	public static final BlockSubRegistryHelper HELPER = AbnormalsDelight.REGISTRY_HELPER.getBlockSubHelper();

	public static final RegistryObject<Block> ROSEWOOD_PANTRY = HELPER.createCompatBlock("atmospheric", "rosewood_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> MORADO_PANTRY = HELPER.createCompatBlock("atmospheric", "morado_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> YUCCA_PANTRY = HELPER.createCompatBlock("atmospheric", "yucca_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> KOUSA_PANTRY = HELPER.createCompatBlock("atmospheric", "kousa_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> ASPEN_PANTRY = HELPER.createCompatBlock("atmospheric", "aspen_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> GRIMWOOD_PANTRY = HELPER.createCompatBlock("atmospheric", "grimwood_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

	public static final RegistryObject<Block> MAPLE_PANTRY = HELPER.createCompatBlock("autumnity", "maple_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

	public static final RegistryObject<Block> POISE_PANTRY = HELPER.createCompatBlock("endergetic", "poise_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

	public static final RegistryObject<Block> WILLOW_PANTRY = HELPER.createCompatBlock("environmental", "willow_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> WISTERIA_PANTRY = HELPER.createCompatBlock("environmental", "wisteria_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> CHERRY_PANTRY = HELPER.createCompatBlock("environmental", "cherry_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

	public static final RegistryObject<Block> DRIFTWOOD_PANTRY = HELPER.createCompatBlock("upgrade_aquatic", "driftwood_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> RIVER_PANTRY = HELPER.createCompatBlock("upgrade_aquatic", "river_pantry", () -> new AbnormalsPantryBlock(Block.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
}
