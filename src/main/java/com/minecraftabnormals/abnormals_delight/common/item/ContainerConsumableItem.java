package com.minecraftabnormals.abnormals_delight.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.items.ConsumableItem;

public class ContainerConsumableItem extends ConsumableItem {
	private final ResourceLocation compatItem;

	public ContainerConsumableItem(ResourceLocation compatItem, Properties properties) {
		super(properties);
		this.compatItem = compatItem;
	}

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		Item item = ForgeRegistries.ITEMS.getValue(this.compatItem);
		return item == null ? ItemStack.EMPTY : new ItemStack(item);
	}
}
