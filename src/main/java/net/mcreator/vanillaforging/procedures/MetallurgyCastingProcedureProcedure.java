package net.mcreator.vanillaforging.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.vanillaforging.item.WootzSulfurSteelIngotItem;
import net.mcreator.vanillaforging.item.WootzSulfurSteelBucketItem;
import net.mcreator.vanillaforging.item.IngotCastItem;
import net.mcreator.vanillaforging.item.HammerItem;
import net.mcreator.vanillaforging.item.CoaldustItem;
import net.mcreator.vanillaforging.VanillaForgingElements;

@VanillaForgingElements.ModElement.Tag
public class MetallurgyCastingProcedureProcedure extends VanillaForgingElements.ModElement {
	public MetallurgyCastingProcedureProcedure(VanillaForgingElements instance) {
		super(instance, 236);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MetallurgyCastingProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MetallurgyCastingProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MetallurgyCastingProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MetallurgyCastingProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((new Object() {
			public int getAmount(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity) {
					ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (7))) < 64) && ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(WootzSulfurSteelBucketItem.block, (int) (1))
				.getItem()) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.PACKED_ICE, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(CoaldustItem.block, (int) (1))
								.getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(Blocks.PACKED_ICE, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Items.REDSTONE, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(IngotCastItem.block, (int) (1)).getItem()) && ((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(HammerItem.block, (int) (1)).getItem())))))))
				&& ((((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity) {
							ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (7))) <= 62) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
						.getItem() == new ItemStack(WootzSulfurSteelIngotItem.block, (int) (1)).getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7))).getItem() == new ItemStack(Blocks.CAVE_AIR, (int) (1))
								.getItem()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (4), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(WootzSulfurSteelIngotItem.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity) {
								ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (7))) + 2));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (9), _setstack);
				}
			}
		}
	}
}
