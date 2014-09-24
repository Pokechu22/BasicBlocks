package pokechu22.mods.basicblocks.client;

import pokechu22.mods.basicblocks.block.BlockSlope;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

/**
 * Somewhat useless, but renders a regular cube.
 * It doesn't do ANY occlusion or any other stuff.
 * 
 * @author Pokechu22
 *
 */
public class BasicRenderer implements ISimpleBlockRenderingHandler {
	/**
	 * Global render ID, treated as default. 
	 */
	public static int usedRenderId = 0;
	
	/**
	 * Render ID used to render.
	 */
	private final int renderId;
	
	public BasicRenderer(int renderId) {
		this.renderId = renderId;
		usedRenderId = renderId;
	}
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId,
			RenderBlocks renderer) {
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		//Top
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		//Side
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Side
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		//Side
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		//Side
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		
		
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		
		return false;
	}

	@Override
	public int getRenderId() {
		
		return renderId;
	}	
}
