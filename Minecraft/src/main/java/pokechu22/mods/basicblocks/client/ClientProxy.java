package pokechu22.mods.basicblocks.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import pokechu22.mods.basicblocks.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		// This is for rendering entities and so forth later on
		RenderingRegistry.registerBlockHandler(new SimpleBlockRenderer(RenderingRegistry.getNextAvailableRenderId()));
	}

}