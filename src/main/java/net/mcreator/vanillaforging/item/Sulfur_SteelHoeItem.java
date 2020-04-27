
package net.mcreator.vanillaforging.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.vanillaforging.VanillaForgingElements;

@VanillaForgingElements.ModElement.Tag
public class Sulfur_SteelHoeItem extends VanillaForgingElements.ModElement {
	@ObjectHolder("vanillaforging:sulfur_steelhoe")
	public static final Item block = null;
	public Sulfur_SteelHoeItem(VanillaForgingElements instance) {
		super(instance, 102);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sulfur_steelhoe"));
	}
}
