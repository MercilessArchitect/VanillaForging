
package net.mcreator.vanillaforging.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.vanillaforging.block.SmithingbrickstorageblockBlock;
import net.mcreator.vanillaforging.VanillaforgingModElements;

@VanillaforgingModElements.ModElement.Tag
public class BlocksItemGroup extends VanillaforgingModElements.ModElement {
	public BlocksItemGroup(VanillaforgingModElements instance) {
		super(instance, 209);
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
