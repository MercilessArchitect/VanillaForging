
package net.mcreator.vanillaforging.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.vanillaforging.VanillaforgingModElements;

@VanillaforgingModElements.ModElement.Tag
public class DaoriteAxeItem extends VanillaforgingModElements.ModElement {
	@ObjectHolder("vanillaforging:daoriteaxe")
	public static final Item block = null;
	public DaoriteAxeItem(VanillaforgingModElements instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 323;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("daoriteaxe"));
	}
}
