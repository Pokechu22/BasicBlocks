package pokechu22.mods.basicblocks;

import pokechu22.mods.basicblocks.block.BlockList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "BasicBlocks", name = "Basic Blocks for Simple Modeling", version = "0.0.0")
public class BasicBlocks {

	@Instance(value = "BasicBlocks")
	public static BasicBlocks instance;

	@SidedProxy(clientSide = "pokechu22.mods.basicblocks.client.ClientProxy", serverSide = "pokechu22.mods.basicblocks.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();

		GameRegistry.registerBlock(BlockList.baseBlock, "genericDirt");
		GameRegistry.registerBlock(BlockList.slopeNorth, "slopeNorth");
		GameRegistry.registerBlock(BlockList.slopeEast, "slopeEast");
		GameRegistry.registerBlock(BlockList.slopeSouth, "slopeSouth");
		GameRegistry.registerBlock(BlockList.slopeWest, "slopeWest");
		GameRegistry.registerBlock(BlockList.cornerNorthEast, "cornerNorthEast");
		GameRegistry.registerBlock(BlockList.cornerNorthWest, "cornerNorthWest");
		GameRegistry.registerBlock(BlockList.cornerSouthEast, "cornerSouthEast");
		GameRegistry.registerBlock(BlockList.cornerSouthWest, "cornerSouthWest");
		GameRegistry.registerBlock(BlockList.innerCornerNorthEast, "innerCornerNorthEast");
		GameRegistry.registerBlock(BlockList.innerCornerNorthWest, "innerCornerNorthWest");
		GameRegistry.registerBlock(BlockList.innerCornerSouthEast, "innerCornerSouthEast");
		GameRegistry.registerBlock(BlockList.innerCornerSouthWest, "innerCornerSouthWest");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}