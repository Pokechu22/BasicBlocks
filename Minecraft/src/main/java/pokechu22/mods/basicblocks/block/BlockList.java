package pokechu22.mods.basicblocks.block;

import pokechu22.mods.basicblocks.block.BlockCorner.CornerType;
import pokechu22.mods.basicblocks.block.BlockSlope.SlopeType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
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
	
	public final static Block baseBlock = new BasicBlock(Material.glass).setHardness(1)
			.setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("baseBlock").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeNorth = new BlockSlope(Material.glass, SlopeType.NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeNorth").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeEast = new BlockSlope(Material.glass, SlopeType.EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeSouth = new BlockSlope(Material.glass, SlopeType.SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeSouth").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeWest = new BlockSlope(Material.glass, SlopeType.WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerNorthEast = new BlockCorner(Material.glass, BlockCorner.CornerType.NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerNorthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerNorthWest = new BlockCorner(Material.glass, BlockCorner.CornerType.NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerNorthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerSouthEast = new BlockCorner(Material.glass, BlockCorner.CornerType.SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerSouthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerSouthWest = new BlockCorner(Material.glass, BlockCorner.CornerType.SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerSouthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerNorthEast = new BlockInnerCorner(Material.glass, BlockInnerCorner.CornerType.NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerNorthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerNorthWest = new BlockInnerCorner(Material.glass, BlockInnerCorner.CornerType.NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerNorthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerSouthEast = new BlockInnerCorner(Material.glass, BlockInnerCorner.CornerType.SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerSouthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block innerCornerSouthWest = new BlockInnerCorner(Material.glass, BlockInnerCorner.CornerType.SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("innerCornerSouthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	//Steep slopes.
	public final static Block steepSlopeNorthUpper = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.UPPER_NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeNorthUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeEastUpper = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.UPPER_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeSouthUpper = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.UPPER_SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeSouthUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeWestUpper = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.UPPER_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeNorthLower = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.LOWER_NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeNorthLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeEastLower = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.LOWER_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeSouthLower  = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.LOWER_SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeSouthLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepSlopeWestLower = new BlockSteepSlope(Material.glass, BlockSteepSlope.SlopeType.LOWER_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepSlopeWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	//Steep corners
	public final static Block steepCornerNorthEastUpper = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.UPPER_NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerNorthEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepCornerNorthWestUpper = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.UPPER_NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerNorthWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepCornerSouthEastUpper = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.UPPER_SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerSouthEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepCornerSouthWestUpper = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.UPPER_SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerSouthWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepCornerNorthEastLower = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.LOWER_NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerNorthEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepCornerNorthWestLower = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.LOWER_NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerNorthWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepCornerSouthEastLower = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.LOWER_SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerSouthEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepCornerSouthWestLower = new BlockSteepCorner(Material.glass, BlockSteepCorner.CornerType.LOWER_SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepCornerSouthWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	//Steep inner corners
	public final static Block steepInnerCornerNorthEastUpper = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.UPPER_NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerNorthEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepInnerCornerNorthWestUpper = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.UPPER_NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerNorthWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepInnerCornerSouthEastUpper = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.UPPER_SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerSouthEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepInnerCornerSouthWestUpper = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.UPPER_SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerSouthWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepInnerCornerNorthEastLower = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.LOWER_NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerNorthEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepInnerCornerNorthWestLower = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.LOWER_NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerNorthWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepInnerCornerSouthEastLower = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.LOWER_SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerSouthEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block steepInnerCornerSouthWestLower = new BlockSteepInnerCorner(Material.glass, BlockSteepInnerCorner.InnerCornerType.LOWER_SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("steepInnerCornerSouthWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);

	//Shallow slopes.
	public final static Block shallowSlopeNorthUpper = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.UPPER_NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeNorthUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowSlopeEastUpper = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.UPPER_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowSlopeSouthUpper = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.UPPER_SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeSouthUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowSlopeWestUpper = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.UPPER_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowSlopeNorthLower = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.LOWER_NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeNorthLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowSlopeEastLower = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.LOWER_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowSlopeSouthLower  = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.LOWER_SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeSouthLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowSlopeWestLower = new BlockShallowSlope(Material.glass, BlockShallowSlope.SlopeType.LOWER_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowSlopeWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	//"Triangle block"s.
	public final static Block triangleNorthEast = new BlockTriangle(Material.glass, BlockTriangle.TriangleType.NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("triangleNorthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block triangleNorthWest = new BlockTriangle(Material.glass, BlockTriangle.TriangleType.NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("triangleNorthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block triangleSouthEast = new BlockTriangle(Material.glass, BlockTriangle.TriangleType.SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("triangleSouthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block triangleSouthWest = new BlockTriangle(Material.glass, BlockTriangle.TriangleType.SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("triangleSouthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	//Shallow corners
	public final static Block shallowCornerNorthEastLower = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.LOWER_NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerNorthEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerNorthWestLower = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.LOWER_NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerNorthWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerSouthEastLower = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.LOWER_SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerSouthEastLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerSouthWestLower = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.LOWER_SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerSouthWestLower").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerNorthEastMiddle = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.MIDDLE_NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerNorthEastMiddle").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerNorthWestMiddle = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.MIDDLE_NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerNorthWestMiddle").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerSouthEastMiddle = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.MIDDLE_SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerSouthEastMiddle").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerSouthWestMiddle = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.MIDDLE_SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerSouthWestMiddle").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerNorthEastUpper = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.UPPER_NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerNorthEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerNorthWestUpper = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.UPPER_NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerNorthWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerSouthEastUpper = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.UPPER_SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerSouthEastUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block shallowCornerSouthWestUpper = new BlockShallowCorner(Material.glass, BlockShallowCorner.ShallowCornerType.UPPER_SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("shallowCornerSouthWestUpper").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
}
