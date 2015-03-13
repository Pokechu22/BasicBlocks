package pokechu22.mods.basicblocks.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import pokechu22.mods.basicblocks.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		// This is for rendering entities and so forth later on
		RenderingRegistry.registerBlockHandler(new BasicRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new SlopeRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new CornerRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new InnerCornerRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new SteepSlopeRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new SteepCornerRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new SteepInnerCornerRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new ShallowSlopeRenderer(RenderingRegistry.getNextAvailableRenderId()));
		RenderingRegistry.registerBlockHandler(new TriangleRenderer(RenderingRegistry.getNextAvailableRenderId()));
	}

}