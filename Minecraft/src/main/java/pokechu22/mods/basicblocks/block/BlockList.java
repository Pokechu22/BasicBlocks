package pokechu22.mods.basicblocks.block;

import pokechu22.mods.basicblocks.block.BlockCorner.CornerType;
import pokechu22.mods.basicblocks.block.BlockSlope.SlopeType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockList {

	/**
	 * Basic tab for all mod contents
	 */
	public static CreativeTabs tabBasicBlocks = new CreativeTabs("basicBlocksModTab") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.experience_bottle;
		}
	};
	
	public final static Block baseBlock = new BasicBlock(Material.iron).setHardness(1)
			.setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("baseBlock").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeNorth = new BlockSlope(Material.iron, SlopeType.NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeNorth").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeEast = new BlockSlope(Material.iron, SlopeType.EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeSouth = new BlockSlope(Material.iron, SlopeType.SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeSouth").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeWest = new BlockSlope(Material.iron, SlopeType.WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerNorthEast = new BlockCorner(Material.iron, BlockCorner.CornerType.NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerNorthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerNorthWest = new BlockCorner(Material.iron, BlockCorner.CornerType.NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerNorthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerSouthEast = new BlockCorner(Material.iron, BlockCorner.CornerType.SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerSouthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerSouthWest = new BlockCorner(Material.iron, BlockCorner.CornerType.SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerSouthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerNorthEast = new BlockInnerCorner(Material.iron, BlockInnerCorner.CornerType.NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerNorthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerNorthWest = new BlockInnerCorner(Material.iron, BlockInnerCorner.CornerType.NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerNorthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerSouthEast = new BlockInnerCorner(Material.iron, BlockInnerCorner.CornerType.SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerSouthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerSouthWest = new BlockInnerCorner(Material.iron, BlockInnerCorner.CornerType.SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerSouthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	//Steep slopes.
	public final static Block steepSlopeNorthUpper = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.UPPER_NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeNorthUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeEastUpper = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.UPPER_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeSouthUpper = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.UPPER_SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeSouthUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeWestUpper = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.UPPER_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeNorthLower = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.LOWER_NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeNorthLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeEastLower = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.LOWER_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeSouthLower  = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.LOWER_SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeSouthLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeWestLower = new BlockSteepSlope(Material.iron, BlockSteepSlope.SlopeType.LOWER_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
}
