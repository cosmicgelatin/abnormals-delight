package com.minecraftabnormals.abnormals_delight.core.data;

import com.minecraftabnormals.abnormals_delight.core.AbnormalsDelight;
import com.minecraftabnormals.abnormals_delight.core.registry.ADBlocks;
import com.minecraftabnormals.abnormals_delight.core.registry.ADItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.LanguageProvider;
import org.apache.commons.lang3.text.WordUtils;

public class LanguageGenerator extends LanguageProvider {
	public LanguageGenerator(DataGenerator gen) {
		super(gen, AbnormalsDelight.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		this.add(ADBlocks.ROSEWOOD_PANTRY.get());
		this.add(ADBlocks.MORADO_PANTRY.get());
		this.add(ADBlocks.YUCCA_PANTRY.get());
		this.add(ADBlocks.KOUSA_PANTRY.get());
		this.add(ADBlocks.ASPEN_PANTRY.get());
		this.add(ADBlocks.GRIMWOOD_PANTRY.get());
		this.add(ADBlocks.MAPLE_PANTRY.get());
		this.add(ADBlocks.POISE_PANTRY.get());
		this.add(ADBlocks.WILLOW_PANTRY.get());
		this.add(ADBlocks.CHERRY_PANTRY.get());
		this.add(ADBlocks.WISTERIA_PANTRY.get());
		this.add(ADBlocks.DRIFTWOOD_PANTRY.get());
		this.add(ADBlocks.RIVER_PANTRY.get());

		this.add(ADItems.SILVER_KNIFE.get());
		this.add(ADItems.NECROMIUM_KNIFE.get());

		this.addRaw(ADItems.DUCK_FILLET.get());
		this.add(ADItems.COOKED_DUCK_FILLET.get());
		this.addRaw(ADItems.VENISON_SHANKS.get());
		this.add(ADItems.COOKED_VENISON_SHANKS.get());
		this.addRaw(ADItems.PIKE_SLICE.get());
		this.add(ADItems.COOKED_PIKE_SLICE.get());
		this.addRaw(ADItems.PERCH_SLICE.get());
		this.add(ADItems.COOKED_PERCH_SLICE.get());

		this.add(ADItems.CHERRY_COOKIE.get());
		this.add(ADItems.MULBERRY_COOKIE.get());
		this.add(ADItems.MAPLE_COOKIE.get());

		this.add(ADItems.SEARED_VENISON.get());
		this.add(ADItems.PASSIONFRUIT_GLAZED_DUCK.get());
		this.add(ADItems.DUNE_PLATTER.get());
		this.add(ADItems.DUCK_NOODLES.get());
		this.add(ADItems.PERCH_WITH_MUSHROOMS.get());
		this.add(ADItems.PIKE_WITH_BEETROOT.get());
		this.add(ADItems.VENISON_WITH_BAMBOO_SHOOTS.get());

		this.add(ADItems.ESCARGOT.get());
		this.add(ADItems.MAPLE_GLAZED_BACON.get());
		this.add(ADItems.SLABDISH.get());

		this.add(ADItems.CHERRY_CREAM_SODA.get());
		this.add(ADItems.PASSION_ALOE_NECTAR.get());
		this.add(ADItems.PICKERELWEED_JUICE.get());

		this.addSlice(ADItems.VANILLA_CAKE_SLICE.get());
		this.addSlice(ADItems.CHOCOLATE_CAKE_SLICE.get());
		this.addSlice(ADItems.STRAWBERRY_CAKE_SLICE.get());
		this.addSlice(ADItems.BANANA_CAKE_SLICE.get());
		this.addSlice(ADItems.MINT_CAKE_SLICE.get());
		this.addSlice(ADItems.ADZUKI_CAKE_SLICE.get());
		this.addSlice(ADItems.YUCCA_GATEAU_SLICE.get());

		this.add("itemGroup." + AbnormalsDelight.MOD_ID, "Farmer's Delight");
		this.add("tooltip." + AbnormalsDelight.MOD_ID + ".slabdish.when_feeding", "When fed to a tamed Slabfish:");
	}

	private void add(Item item) {
		if (item.getRegistryName() != null)
			this.add(item, format(item.getRegistryName()));
	}

	private void addRaw(Item item) {
		if (item.getRegistryName() != null)
			this.add(item, "Raw " + format(item.getRegistryName()));
	}

	private void add(Block block) {
		if (block.getRegistryName() != null)
			this.add(block, format(block.getRegistryName()));
	}

	private String format(ResourceLocation registryName) {
		return WordUtils.capitalizeFully(registryName.getPath().replace("_", " ")).replace("With", "with");
	}

	private void addSlice(Item item) {
		if (item.getRegistryName() != null)
			this.add(item, "Slice of " + format(item.getRegistryName()).replace(" Slice", ""));
	}
}