
package net.mcreator.vanillaforging.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.vanillaforging.itemgroup.MainForgePartsItemGroup;
import net.mcreator.vanillaforging.VanillaForgingElements;

@VanillaForgingElements.ModElement.Tag
public class HardenedSulfurSteelIngotItem extends VanillaForgingElements.ModElement {
	@ObjectHolder("vanillaforging:hardenedsulfursteelingot")
	public static final Item block = null;
	public HardenedSulfurSteelIngotItem(VanillaForgingElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MainForgePartsItemGroup.tab).maxStackSize(64));
			setRegistryName("hardenedsulfursteelingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
