package pokechu22.mods.basicblocks.client;

import pokechu22.mods.basicblocks.block.BlockShallowCorner;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class ShallowCornerRenderer implements ISimpleBlockRenderingHandler {
	/**
	 * Global render ID, treated as default. 
	 */
	public static int usedRenderId = 0;
	
	/**
	 * Render ID used to render.
	 */
	private final int renderId;
	
	public ShallowCornerRenderer(int renderId) {
		this.renderId = renderId;
		usedRenderId = renderId;
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId,
			RenderBlocks renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		if (!(block instanceof BlockShallowCorner)) {
			return false;
		}
		
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		BlockShallowCorner corner = (BlockShallowCorner) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setBrightness(lightValue);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		
		return false;
	}
	
	/*
	 * South: Z increasing
	 * East: X increasing.
	 * North: Z decreasing
	 * West: X decreasing 
	 */

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return renderId;
	}

}
