
package net.mcreator.vanillaforging.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.vanillaforging.item.SulfurSteelIngotItem;
import net.mcreator.vanillaforging.VanillaForgingElements;

@VanillaForgingElements.ModElement.Tag
public class MainForgePartsItemGroup extends VanillaForgingElements.ModElement {
	public MainForgePartsItemGroup(VanillaForgingElements instance) {
		super(instance, 126);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmainforgeparts") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SulfurSteelIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
