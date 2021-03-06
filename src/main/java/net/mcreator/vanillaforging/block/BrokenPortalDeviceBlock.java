
package net.mcreator.vanillaforging.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.vanillaforging.itemgroup.BlocksItemGroup;
import net.mcreator.vanillaforging.item.PortalcoreItem;
import net.mcreator.vanillaforging.VanillaforgingModElements;

import java.util.List;
import java.util.Collections;

@VanillaforgingModElements.ModElement.Tag
public class BrokenPortalDeviceBlock extends VanillaforgingModElements.ModElement {
	@ObjectHolder("vanillaforging:brokenportaldevice")
	public static final Block block = null;
	public BrokenPortalDeviceBlock(VanillaforgingModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(BlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(10f, 600f).lightValue(0));
			setRegistryName("brokenportaldevice");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(PortalcoreItem.block, (int) (1)));
		}
	}
}
