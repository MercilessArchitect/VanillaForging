package net.mcreator.vanillaforging.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.vanillaforging.item.SulfurSteelIngotItem;
import net.mcreator.vanillaforging.item.RodCastItem;
import net.mcreator.vanillaforging.item.PlateCastItem;
import net.mcreator.vanillaforging.item.IronplateItem;
import net.mcreator.vanillaforging.item.IronToolRodItem;
import net.mcreator.vanillaforging.item.IngotCastItem;
import net.mcreator.vanillaforging.item.InfusedcarbonItem;
import net.mcreator.vanillaforging.item.HardenedSulfurSteelBucketItem;
import net.mcreator.vanillaforging.item.CopperingotItem;
import net.mcreator.vanillaforging.item.CastingAlloyIngotItem;
import net.mcreator.vanillaforging.VanillaForgingElements;

@VanillaForgingElements.ModElement.Tag
public class BasicMetallurgyTableProcedureProcedure extends VanillaForgingElements.ModElement {
	public BasicMetallurgyTableProcedureProcedure(VanillaForgingElements instance) {
		super(instance, 138);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BasicMetallurgyTableProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BasicMetallurgyTableProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BasicMetallurgyTableProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BasicMetallurgyTableProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((new Object() {
			public int getAmount(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity) {
					ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 3) && (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(InfusedcarbonItem.block, (int) (1)).getItem())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.FIRE_CHARGE, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(InfusedcarbonItem.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(SulfurSteelIngotItem.block, (int) (1)).getItem())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof LockableLootTileEntity)
																			return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof LockableLootTileEntity)
																					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(InfusedcarbonItem.block, (int) (1))
																						.getItem())
																				&& (((new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof LockableLootTileEntity)
																							return ((LockableLootTileEntity) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
																						.getItem() == new ItemStack(InfusedcarbonItem.block,
																								(int) (1)).getItem())
																						&& (((new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								TileEntity inv = world.getTileEntity(pos);
																								if (inv instanceof LockableLootTileEntity)
																									return ((LockableLootTileEntity) inv)
																											.getStackInSlot(sltid);
																								return ItemStack.EMPTY;
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (10)))
																										.getItem() == new ItemStack(Items.FIRE_CHARGE,
																												(int) (1)).getItem())
																								&& (((new Object() {
																									public ItemStack getItemStack(BlockPos pos,
																											int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof LockableLootTileEntity)
																											return ((LockableLootTileEntity) inv)
																													.getStackInSlot(sltid);
																										return ItemStack.EMPTY;
																									}
																								}.getItemStack(
																										new BlockPos((int) x, (int) y, (int) z),
																										(int) (11)))
																												.getItem() == new ItemStack(
																														Items.FIRE_CHARGE, (int) (1))
																																.getItem())
																										&& (((new Object() {
																											public ItemStack getItemStack(
																													BlockPos pos, int sltid) {
																												TileEntity inv = world
																														.getTileEntity(pos);
																												if (inv instanceof LockableLootTileEntity)
																													return ((LockableLootTileEntity) inv)
																															.getStackInSlot(sltid);
																												return ItemStack.EMPTY;
																											}
																										}.getItemStack(
																												new BlockPos((int) x, (int) y,
																														(int) z),
																												(int) (12)))
																														.getItem() == new ItemStack(
																																Items.FIRE_CHARGE,
																																(int) (1)).getItem())
																												&& ((new Object() {
																													public ItemStack getItemStack(
																															BlockPos pos, int sltid) {
																														TileEntity inv = world
																																.getTileEntity(pos);
																														if (inv instanceof LockableLootTileEntity)
																															return ((LockableLootTileEntity) inv)
																																	.getStackInSlot(
																																			sltid);
																														return ItemStack.EMPTY;
																													}
																												}.getItemStack(
																														new BlockPos((int) x, (int) y,
																																(int) z),
																														(int) (13)))
																																.getItem() == new ItemStack(
																																		Items.LAVA_BUCKET,
																																		(int) (1))
																																				.getItem())))))))))))))))
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
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 3) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14)))
						.getItem() == new ItemStack(HardenedSulfurSteelBucketItem.block, (int) (1)).getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem())))) {
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
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (6), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (9), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (10), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (11), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (12), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (13), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(HardenedSulfurSteelBucketItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (14), _setstack);
				}
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (13), _setstack);
				}
			}
		}
		if (((((new Object() {
			public int getAmount(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity) {
					ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 2) && (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1))
				.getItem()) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.BLAZE_POWDER, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(CopperingotItem.block, (int) (1)).getItem()) && (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof LockableLootTileEntity)
																			return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof LockableLootTileEntity)
																					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1))
																						.getItem())
																				&& (((new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof LockableLootTileEntity)
																							return ((LockableLootTileEntity) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
																						.getItem() == new ItemStack(CastingAlloyIngotItem.block,
																								(int) (1)).getItem())
																						&& (((new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								TileEntity inv = world.getTileEntity(pos);
																								if (inv instanceof LockableLootTileEntity)
																									return ((LockableLootTileEntity) inv)
																											.getStackInSlot(sltid);
																								return ItemStack.EMPTY;
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (10)))
																										.getItem() == new ItemStack(
																												Items.BLAZE_POWDER, (int) (1))
																														.getItem())
																								&& (((new Object() {
																									public ItemStack getItemStack(BlockPos pos,
																											int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof LockableLootTileEntity)
																											return ((LockableLootTileEntity) inv)
																													.getStackInSlot(sltid);
																										return ItemStack.EMPTY;
																									}
																								}.getItemStack(
																										new BlockPos((int) x, (int) y, (int) z),
																										(int) (11)))
																												.getItem() == new ItemStack(
																														Items.BLAZE_POWDER, (int) (1))
																																.getItem())
																										&& (((new Object() {
																											public ItemStack getItemStack(
																													BlockPos pos, int sltid) {
																												TileEntity inv = world
																														.getTileEntity(pos);
																												if (inv instanceof LockableLootTileEntity)
																													return ((LockableLootTileEntity) inv)
																															.getStackInSlot(sltid);
																												return ItemStack.EMPTY;
																											}
																										}.getItemStack(
																												new BlockPos((int) x, (int) y,
																														(int) z),
																												(int) (12)))
																														.getItem() == new ItemStack(
																																Items.BLAZE_POWDER,
																																(int) (1)).getItem())
																												&& ((new Object() {
																													public ItemStack getItemStack(
																															BlockPos pos, int sltid) {
																														TileEntity inv = world
																																.getTileEntity(pos);
																														if (inv instanceof LockableLootTileEntity)
																															return ((LockableLootTileEntity) inv)
																																	.getStackInSlot(
																																			sltid);
																														return ItemStack.EMPTY;
																													}
																												}.getItemStack(
																														new BlockPos((int) x, (int) y,
																																(int) z),
																														(int) (13)))
																																.getItem() == new ItemStack(
																																		Items.LAVA_BUCKET,
																																		(int) (1))
																																				.getItem())))))))))))))))
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
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 2) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14))).getItem() == new ItemStack(IngotCastItem.block, (int) (1))
						.getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem())))) {
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
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (6), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (9), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (10), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (11), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (12), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (13), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(IngotCastItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (14), _setstack);
				}
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (13), _setstack);
				}
			}
		}
		if (((((new Object() {
			public int getAmount(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity) {
					ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 2) && (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1))
				.getItem()) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.BLAZE_POWDER, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(IronplateItem.block, (int) (1)).getItem()) && (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof LockableLootTileEntity)
																			return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof LockableLootTileEntity)
																					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1))
																						.getItem())
																				&& (((new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof LockableLootTileEntity)
																							return ((LockableLootTileEntity) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
																						.getItem() == new ItemStack(CastingAlloyIngotItem.block,
																								(int) (1)).getItem())
																						&& (((new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								TileEntity inv = world.getTileEntity(pos);
																								if (inv instanceof LockableLootTileEntity)
																									return ((LockableLootTileEntity) inv)
																											.getStackInSlot(sltid);
																								return ItemStack.EMPTY;
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (10)))
																										.getItem() == new ItemStack(
																												Items.BLAZE_POWDER, (int) (1))
																														.getItem())
																								&& (((new Object() {
																									public ItemStack getItemStack(BlockPos pos,
																											int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof LockableLootTileEntity)
																											return ((LockableLootTileEntity) inv)
																													.getStackInSlot(sltid);
																										return ItemStack.EMPTY;
																									}
																								}.getItemStack(
																										new BlockPos((int) x, (int) y, (int) z),
																										(int) (11)))
																												.getItem() == new ItemStack(
																														Items.BLAZE_POWDER, (int) (1))
																																.getItem())
																										&& (((new Object() {
																											public ItemStack getItemStack(
																													BlockPos pos, int sltid) {
																												TileEntity inv = world
																														.getTileEntity(pos);
																												if (inv instanceof LockableLootTileEntity)
																													return ((LockableLootTileEntity) inv)
																															.getStackInSlot(sltid);
																												return ItemStack.EMPTY;
																											}
																										}.getItemStack(
																												new BlockPos((int) x, (int) y,
																														(int) z),
																												(int) (12)))
																														.getItem() == new ItemStack(
																																Items.BLAZE_POWDER,
																																(int) (1)).getItem())
																												&& ((new Object() {
																													public ItemStack getItemStack(
																															BlockPos pos, int sltid) {
																														TileEntity inv = world
																																.getTileEntity(pos);
																														if (inv instanceof LockableLootTileEntity)
																															return ((LockableLootTileEntity) inv)
																																	.getStackInSlot(
																																			sltid);
																														return ItemStack.EMPTY;
																													}
																												}.getItemStack(
																														new BlockPos((int) x, (int) y,
																																(int) z),
																														(int) (13)))
																																.getItem() == new ItemStack(
																																		Items.LAVA_BUCKET,
																																		(int) (1))
																																				.getItem())))))))))))))))
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
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 2) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14))).getItem() == new ItemStack(PlateCastItem.block, (int) (1))
						.getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem())))) {
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
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (6), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (9), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (10), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (11), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (12), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (13), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(PlateCastItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (14), _setstack);
				}
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (13), _setstack);
				}
			}
		}
		if (((((new Object() {
			public int getAmount(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity) {
					ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 2) && (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1))
				.getItem()) && (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.BLAZE_POWDER, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(IronToolRodItem.block, (int) (1)).getItem()) && (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof LockableLootTileEntity)
																			return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1)).getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof LockableLootTileEntity)
																					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(CastingAlloyIngotItem.block, (int) (1))
																						.getItem())
																				&& (((new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof LockableLootTileEntity)
																							return ((LockableLootTileEntity) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9)))
																						.getItem() == new ItemStack(CastingAlloyIngotItem.block,
																								(int) (1)).getItem())
																						&& (((new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								TileEntity inv = world.getTileEntity(pos);
																								if (inv instanceof LockableLootTileEntity)
																									return ((LockableLootTileEntity) inv)
																											.getStackInSlot(sltid);
																								return ItemStack.EMPTY;
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (10)))
																										.getItem() == new ItemStack(
																												Items.BLAZE_POWDER, (int) (1))
																														.getItem())
																								&& (((new Object() {
																									public ItemStack getItemStack(BlockPos pos,
																											int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof LockableLootTileEntity)
																											return ((LockableLootTileEntity) inv)
																													.getStackInSlot(sltid);
																										return ItemStack.EMPTY;
																									}
																								}.getItemStack(
																										new BlockPos((int) x, (int) y, (int) z),
																										(int) (11)))
																												.getItem() == new ItemStack(
																														Items.BLAZE_POWDER, (int) (1))
																																.getItem())
																										&& (((new Object() {
																											public ItemStack getItemStack(
																													BlockPos pos, int sltid) {
																												TileEntity inv = world
																														.getTileEntity(pos);
																												if (inv instanceof LockableLootTileEntity)
																													return ((LockableLootTileEntity) inv)
																															.getStackInSlot(sltid);
																												return ItemStack.EMPTY;
																											}
																										}.getItemStack(
																												new BlockPos((int) x, (int) y,
																														(int) z),
																												(int) (12)))
																														.getItem() == new ItemStack(
																																Items.BLAZE_POWDER,
																																(int) (1)).getItem())
																												&& ((new Object() {
																													public ItemStack getItemStack(
																															BlockPos pos, int sltid) {
																														TileEntity inv = world
																																.getTileEntity(pos);
																														if (inv instanceof LockableLootTileEntity)
																															return ((LockableLootTileEntity) inv)
																																	.getStackInSlot(
																																			sltid);
																														return ItemStack.EMPTY;
																													}
																												}.getItemStack(
																														new BlockPos((int) x, (int) y,
																																(int) z),
																														(int) (13)))
																																.getItem() == new ItemStack(
																																		Items.LAVA_BUCKET,
																																		(int) (1))
																																				.getItem())))))))))))))))
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
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) <= 2) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14))).getItem() == new ItemStack(RodCastItem.block, (int) (1))
						.getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (14))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem())))) {
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
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (6), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (9), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (10), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (11), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (12), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (13), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(RodCastItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (14))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (14), _setstack);
				}
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (13))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (13), _setstack);
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
