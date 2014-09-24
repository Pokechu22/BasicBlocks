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

		GameRegistry.registerBlock(BlockList.genericDirt, "genericDirt");
		GameRegistry.registerBlock(BlockList.test, "test");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}