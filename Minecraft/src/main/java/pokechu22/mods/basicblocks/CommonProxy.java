package pokechu22.mods.basicblocks;

import pokechu22.mods.basicblocks.block.BlockList;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	// Client stuff
	public void registerRenderers() {
		// Nothing here as the server doesn't render graphics or entities!
	}
	
	/**
	 * Registers all mod blocks.
	 */
	public void registerBlocks() {
		GameRegistry.registerBlock(BlockList.baseBlock, "genericDirt");
		//Slopes
		GameRegistry.registerBlock(BlockList.slopeNorth, "slopeNorth");
		GameRegistry.registerBlock(BlockList.slopeEast, "slopeEast");
		GameRegistry.registerBlock(BlockList.slopeSouth, "slopeSouth");
		GameRegistry.registerBlock(BlockList.slopeWest, "slopeWest");
		//Outer corners
		GameRegistry.registerBlock(BlockList.cornerNorthEast, "cornerNorthEast");
		GameRegistry.registerBlock(BlockList.cornerNorthWest, "cornerNorthWest");
		GameRegistry.registerBlock(BlockList.cornerSouthEast, "cornerSouthEast");
		GameRegistry.registerBlock(BlockList.cornerSouthWest, "cornerSouthWest");
		//Inner corners
		GameRegistry.registerBlock(BlockList.innerCornerNorthEast, "innerCornerNorthEast");
		GameRegistry.registerBlock(BlockList.innerCornerNorthWest, "innerCornerNorthWest");
		GameRegistry.registerBlock(BlockList.innerCornerSouthEast, "innerCornerSouthEast");
		GameRegistry.registerBlock(BlockList.innerCornerSouthWest, "innerCornerSouthWest");
		//Steep slopes
		GameRegistry.registerBlock(BlockList.steepSlopeNorthUpper, "steepSlopeNorthUpper");
		GameRegistry.registerBlock(BlockList.steepSlopeEastUpper, "steepSlopeEastUpper");
		GameRegistry.registerBlock(BlockList.steepSlopeSouthUpper, "steepSlopeSouthUpper");
		GameRegistry.registerBlock(BlockList.steepSlopeWestUpper, "steepSlopeWestUpper");
		GameRegistry.registerBlock(BlockList.steepSlopeNorthLower, "steepSlopeNorthLower");
		GameRegistry.registerBlock(BlockList.steepSlopeEastLower, "steepSlopeEastLower");
		GameRegistry.registerBlock(BlockList.steepSlopeSouthLower, "steepSlopeSouthLower");
		GameRegistry.registerBlock(BlockList.steepSlopeWestLower, "steepSlopeWestLower");
		//Steep corners
		GameRegistry.registerBlock(BlockList.steepCornerNorthEastUpper, "steepCornerNorthEastUpper");
		GameRegistry.registerBlock(BlockList.steepCornerNorthWestUpper, "steepCornerNorthWestUpper");
		GameRegistry.registerBlock(BlockList.steepCornerSouthEastUpper, "steepCornerSouthEastUpper");
		GameRegistry.registerBlock(BlockList.steepCornerSouthWestUpper, "steepCornerSouthWestUpper");
		GameRegistry.registerBlock(BlockList.steepCornerNorthEastLower, "steepCornerNorthEastLower");
		GameRegistry.registerBlock(BlockList.steepCornerNorthWestLower, "steepCornerNorthWestLower");
		GameRegistry.registerBlock(BlockList.steepCornerSouthEastLower, "steepCornerSouthEastLower");
		GameRegistry.registerBlock(BlockList.steepCornerSouthWestLower, "steepCornerSouthWestLower");
		//Shallow slopes
		GameRegistry.registerBlock(BlockList.shallowSlopeNorthUpper, "shallowSlopeNorthUpper");
		GameRegistry.registerBlock(BlockList.shallowSlopeEastUpper, "shallowSlopeEastUpper");
		GameRegistry.registerBlock(BlockList.shallowSlopeSouthUpper, "shallowSlopeSouthUpper");
		GameRegistry.registerBlock(BlockList.shallowSlopeWestUpper, "shallowSlopeWestUpper");
		GameRegistry.registerBlock(BlockList.shallowSlopeNorthLower, "shallowSlopeNorthLower");
		GameRegistry.registerBlock(BlockList.shallowSlopeEastLower, "shallowSlopeEastLower");
		GameRegistry.registerBlock(BlockList.shallowSlopeSouthLower, "shallowSlopeSouthLower");
		GameRegistry.registerBlock(BlockList.shallowSlopeWestLower, "shallowSlopeWestLower");
	}
}