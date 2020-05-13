package net.mcreator.vanillaforging.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.vanillaforging.item.WootzSulfurSteelDustItem;
import net.mcreator.vanillaforging.item.WootzSulfurSteelBucketItem;
import net.mcreator.vanillaforging.item.WootzSteelBaseBucketItem;
import net.mcreator.vanillaforging.item.SteelHardeningDustItem;
import net.mcreator.vanillaforging.item.QuartzdustItem;
import net.mcreator.vanillaforging.item.IronDustItem;
import net.mcreator.vanillaforging.item.InfusedcarbonItem;
import net.mcreator.vanillaforging.item.HotBedrockDustItem;
import net.mcreator.vanillaforging.item.HardenedSulfurSteelDustItem;
import net.mcreator.vanillaforging.item.EmeraldDustItem;
import net.mcreator.vanillaforging.item.DiamondDustItem;
import net.mcreator.vanillaforging.item.DaoriteNuggetItem;
import net.mcreator.vanillaforging.item.CoaldustItem;
import net.mcreator.vanillaforging.item.BaseDustItem;
import net.mcreator.vanillaforging.VanillaForgingElements;

@VanillaForgingElements.ModElement.Tag
public class MetallurgyTableGUIProcedureProcedure extends VanillaForgingElements.ModElement {
	public MetallurgyTableGUIProcedureProcedure(VanillaForgingElements instance) {
		super(instance, 230);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MetallurgyTableGUIProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MetallurgyTableGUIProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MetallurgyTableGUIProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MetallurgyTableGUIProcedure!");
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
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (17))) < 64) && ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Items.LAVA_BUCKET, (int) (1)).getItem())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(BaseDustItem.block, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(HardenedSulfurSteelDustItem.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(BaseDustItem.block, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(HardenedSulfurSteelDustItem.block, (int) (1)).getItem())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(IronDustItem.block, (int) (1)).getItem()) && (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(IronDustItem.block, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof LockableLootTileEntity)
																			return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(IronDustItem.block, (int) (1)).getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof LockableLootTileEntity)
																					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(IronDustItem.block, (int) (1)).getItem())
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
																										.getItem() == new ItemStack(
																												DiamondDustItem.block, (int) (1))
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
																										(int) (11))).getItem() == new ItemStack(
																												InfusedcarbonItem.block, (int) (1))
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
																																DiamondDustItem.block,
																																(int) (1)).getItem())
																												&& (((new Object() {
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
																																		Items.DRAGON_BREATH,
																																		(int) (1))
																																				.getItem())
																														&& (((new Object() {
																															public ItemStack getItemStack(
																																	BlockPos pos,
																																	int sltid) {
																																TileEntity inv = world
																																		.getTileEntity(
																																				pos);
																																if (inv instanceof LockableLootTileEntity)
																																	return ((LockableLootTileEntity) inv)
																																			.getStackInSlot(
																																					sltid);
																																return ItemStack.EMPTY;
																															}
																														}.getItemStack(
																																new BlockPos((int) x,
																																		(int) y,
																																		(int) z),
																																(int) (14)))
																																		.getItem() == new ItemStack(
																																				Items.EXPERIENCE_BOTTLE,
																																				(int) (1))
																																						.getItem())
																																&& (((new Object() {
																																	public ItemStack getItemStack(
																																			BlockPos pos,
																																			int sltid) {
																																		TileEntity inv = world
																																				.getTileEntity(
																																						pos);
																																		if (inv instanceof LockableLootTileEntity)
																																			return ((LockableLootTileEntity) inv)
																																					.getStackInSlot(
																																							sltid);
																																		return ItemStack.EMPTY;
																																	}
																																}.getItemStack(
																																		new BlockPos(
																																				(int) x,
																																				(int) y,
																																				(int) z),
																																		(int) (15)))
																																				.getItem() == new ItemStack(
																																						Items.DRAGON_BREATH,
																																						(int) (1))
																																								.getItem())
																																		&& (((new Object() {
																																			public ItemStack getItemStack(
																																					BlockPos pos,
																																					int sltid) {
																																				TileEntity inv = world
																																						.getTileEntity(
																																								pos);
																																				if (inv instanceof LockableLootTileEntity)
																																					return ((LockableLootTileEntity) inv)
																																							.getStackInSlot(
																																									sltid);
																																				return ItemStack.EMPTY;
																																			}
																																		}.getItemStack(
																																				new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z),
																																				(int) (16)))
																																						.getItem() == new ItemStack(
																																								Items.DRAGON_BREATH,
																																								(int) (1))
																																										.getItem())
																																				&& ((new Object() {
																																					public ItemStack getItemStack(
																																							BlockPos pos,
																																							int sltid) {
																																						TileEntity inv = world
																																								.getTileEntity(
																																										pos);
																																						if (inv instanceof LockableLootTileEntity)
																																							return ((LockableLootTileEntity) inv)
																																									.getStackInSlot(
																																											sltid);
																																						return ItemStack.EMPTY;
																																					}
																																				}.getItemStack(
																																						new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z),
																																						(int) (17)))
																																								.getItem() == new ItemStack(
																																										Items.BUCKET,
																																										(int) (1))
																																												.getItem()))))))))))))))))))
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
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (18))) <= 62) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (18)))
						.getItem() == new ItemStack(WootzSulfurSteelBucketItem.block, (int) (1)).getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (18))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (14), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (15), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (16), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (17), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(WootzSulfurSteelBucketItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (18))) + 2));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (18), _setstack);
				}
			}
		}
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
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (17))) < 64) && ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(BaseDustItem.block, (int) (1)).getItem())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(CoaldustItem.block, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(EmeraldDustItem.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(CoaldustItem.block, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(EmeraldDustItem.block, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(HotBedrockDustItem.block, (int) (1)).getItem())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(IronDustItem.block, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof LockableLootTileEntity)
																			return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(HotBedrockDustItem.block, (int) (1)).getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof LockableLootTileEntity)
																					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(IronDustItem.block, (int) (1)).getItem())
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
																										.getItem() == new ItemStack(
																												DiamondDustItem.block, (int) (1))
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
																										(int) (11))).getItem() == new ItemStack(
																												InfusedcarbonItem.block, (int) (1))
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
																																DiamondDustItem.block,
																																(int) (1)).getItem())
																												&& (((new Object() {
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
																																		QuartzdustItem.block,
																																		(int) (1))
																																				.getItem())
																														&& (((new Object() {
																															public ItemStack getItemStack(
																																	BlockPos pos,
																																	int sltid) {
																																TileEntity inv = world
																																		.getTileEntity(
																																				pos);
																																if (inv instanceof LockableLootTileEntity)
																																	return ((LockableLootTileEntity) inv)
																																			.getStackInSlot(
																																					sltid);
																																return ItemStack.EMPTY;
																															}
																														}.getItemStack(
																																new BlockPos((int) x,
																																		(int) y,
																																		(int) z),
																																(int) (14)))
																																		.getItem() == new ItemStack(
																																				QuartzdustItem.block,
																																				(int) (1))
																																						.getItem())
																																&& (((new Object() {
																																	public ItemStack getItemStack(
																																			BlockPos pos,
																																			int sltid) {
																																		TileEntity inv = world
																																				.getTileEntity(
																																						pos);
																																		if (inv instanceof LockableLootTileEntity)
																																			return ((LockableLootTileEntity) inv)
																																					.getStackInSlot(
																																							sltid);
																																		return ItemStack.EMPTY;
																																	}
																																}.getItemStack(
																																		new BlockPos(
																																				(int) x,
																																				(int) y,
																																				(int) z),
																																		(int) (15)))
																																				.getItem() == new ItemStack(
																																						QuartzdustItem.block,
																																						(int) (1))
																																								.getItem())
																																		&& (((new Object() {
																																			public ItemStack getItemStack(
																																					BlockPos pos,
																																					int sltid) {
																																				TileEntity inv = world
																																						.getTileEntity(
																																								pos);
																																				if (inv instanceof LockableLootTileEntity)
																																					return ((LockableLootTileEntity) inv)
																																							.getStackInSlot(
																																									sltid);
																																				return ItemStack.EMPTY;
																																			}
																																		}.getItemStack(
																																				new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z),
																																				(int) (16)))
																																						.getItem() == new ItemStack(
																																								QuartzdustItem.block,
																																								(int) (1))
																																										.getItem())
																																				&& ((new Object() {
																																					public ItemStack getItemStack(
																																							BlockPos pos,
																																							int sltid) {
																																						TileEntity inv = world
																																								.getTileEntity(
																																										pos);
																																						if (inv instanceof LockableLootTileEntity)
																																							return ((LockableLootTileEntity) inv)
																																									.getStackInSlot(
																																											sltid);
																																						return ItemStack.EMPTY;
																																					}
																																				}.getItemStack(
																																						new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z),
																																						(int) (17)))
																																								.getItem() == new ItemStack(
																																										Blocks.AIR,
																																										(int) (1))
																																												.getItem()))))))))))))))))))
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
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (18))) <= 58) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (18)))
						.getItem() == new ItemStack(SteelHardeningDustItem.block, (int) (1)).getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (18))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (14), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (15), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (16), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (17), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(SteelHardeningDustItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (18))) + 6));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (18), _setstack);
				}
			}
		}
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
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (17))) < 64) && ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Items.LAVA_BUCKET, (int) (1)).getItem())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(DiamondDustItem.block, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(WootzSulfurSteelDustItem.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(DiamondDustItem.block, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof LockableLootTileEntity)
													return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(WootzSulfurSteelDustItem.block, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof LockableLootTileEntity)
															return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(SteelHardeningDustItem.block, (int) (1)).getItem())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof LockableLootTileEntity)
																	return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(DaoriteNuggetItem.block, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof LockableLootTileEntity)
																			return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(SteelHardeningDustItem.block, (int) (1))
																				.getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof LockableLootTileEntity)
																					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(DaoriteNuggetItem.block, (int) (1))
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
																						.getItem() == new ItemStack(Items.REDSTONE, (int) (1))
																								.getItem())
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
																										.getItem() == new ItemStack(Items.REDSTONE,
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
																														Items.REDSTONE, (int) (1))
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
																																Items.REDSTONE,
																																(int) (1)).getItem())
																												&& (((new Object() {
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
																																		HotBedrockDustItem.block,
																																		(int) (1))
																																				.getItem())
																														&& (((new Object() {
																															public ItemStack getItemStack(
																																	BlockPos pos,
																																	int sltid) {
																																TileEntity inv = world
																																		.getTileEntity(
																																				pos);
																																if (inv instanceof LockableLootTileEntity)
																																	return ((LockableLootTileEntity) inv)
																																			.getStackInSlot(
																																					sltid);
																																return ItemStack.EMPTY;
																															}
																														}.getItemStack(
																																new BlockPos((int) x,
																																		(int) y,
																																		(int) z),
																																(int) (14)))
																																		.getItem() == new ItemStack(
																																				Blocks.BLUE_ICE,
																																				(int) (1))
																																						.getItem())
																																&& (((new Object() {
																																	public ItemStack getItemStack(
																																			BlockPos pos,
																																			int sltid) {
																																		TileEntity inv = world
																																				.getTileEntity(
																																						pos);
																																		if (inv instanceof LockableLootTileEntity)
																																			return ((LockableLootTileEntity) inv)
																																					.getStackInSlot(
																																							sltid);
																																		return ItemStack.EMPTY;
																																	}
																																}.getItemStack(
																																		new BlockPos(
																																				(int) x,
																																				(int) y,
																																				(int) z),
																																		(int) (15)))
																																				.getItem() == new ItemStack(
																																						HotBedrockDustItem.block,
																																						(int) (1))
																																								.getItem())
																																		&& (((new Object() {
																																			public ItemStack getItemStack(
																																					BlockPos pos,
																																					int sltid) {
																																				TileEntity inv = world
																																						.getTileEntity(
																																								pos);
																																				if (inv instanceof LockableLootTileEntity)
																																					return ((LockableLootTileEntity) inv)
																																							.getStackInSlot(
																																									sltid);
																																				return ItemStack.EMPTY;
																																			}
																																		}.getItemStack(
																																				new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z),
																																				(int) (16)))
																																						.getItem() == new ItemStack(
																																								Blocks.BLUE_ICE,
																																								(int) (1))
																																										.getItem())
																																				&& ((new Object() {
																																					public ItemStack getItemStack(
																																							BlockPos pos,
																																							int sltid) {
																																						TileEntity inv = world
																																								.getTileEntity(
																																										pos);
																																						if (inv instanceof LockableLootTileEntity)
																																							return ((LockableLootTileEntity) inv)
																																									.getStackInSlot(
																																											sltid);
																																						return ItemStack.EMPTY;
																																					}
																																				}.getItemStack(
																																						new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z),
																																						(int) (17)))
																																								.getItem() == new ItemStack(
																																										Items.BUCKET,
																																										(int) (1))
																																												.getItem()))))))))))))))))))
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
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (18))) <= 62) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (18)))
						.getItem() == new ItemStack(WootzSteelBaseBucketItem.block, (int) (1)).getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (18))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (14), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (15), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (16), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (17), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(WootzSteelBaseBucketItem.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (18))) + 2));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (18), _setstack);
				}
			}
		}
	}
}
