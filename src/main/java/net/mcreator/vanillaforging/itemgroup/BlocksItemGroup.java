
package net.mcreator.vanillaforging.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.vanillaforging.block.SmithingbrickstorageblockBlock;
import net.mcreator.vanillaforging.VanillaForgingElements;

@VanillaForgingElements.ModElement.Tag
public class BlocksItemGroup extends VanillaForgingElements.ModElement {
	public BlocksItemGroup(VanillaForgingElements instance) {
		super(instance, 185);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SmithingbrickstorageblockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
