
package net.mcreator.vanillaforging.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.vanillaforging.itemgroup.BlocksItemGroup;
import net.mcreator.vanillaforging.VanillaforgingModElements;

import java.util.List;
import java.util.Collections;

@VanillaforgingModElements.ModElement.Tag
public class BaseMetalBlockBlock extends VanillaforgingModElements.ModElement {
	@ObjectHolder("vanillaforging:basemetalblock")
	public static final Block block = null;
	public BaseMetalBlockBlock(VanillaforgingModElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(BlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(6f, 30f).lightValue(0).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("basemetalblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
