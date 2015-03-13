package pokechu22.mods.basicblocks.client;

import pokechu22.mods.basicblocks.block.BlockCorner;
import pokechu22.mods.basicblocks.block.BlockTriangle;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class TriangleRenderer implements ISimpleBlockRenderingHandler {
	/**
	 * Global render ID, treated as default. 
	 */
	public static int usedRenderId = 0;
	
	/**
	 * Render ID used to render.
	 */
	private final int renderId;
	
	public TriangleRenderer(int renderId) {
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
		if (!(block instanceof BlockTriangle)) {
			return false;
		}
		
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		BlockTriangle corner = (BlockTriangle) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		
		switch (corner.type) {
		case NORTH_EAST:
			renderNorthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case NORTH_WEST:
			renderNorthWest(t, world, x, y, z, corner, modelId, renderer);
			break;
		case SOUTH_EAST:
			renderSouthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case SOUTH_WEST:
			renderSouthWest(t, world, x, y, z, corner, modelId, renderer);
			break;
		default:
			break;
		}
		
		return false;
	}
	
	/*
	 * South: Z increasing
	 * East: X increasing.
	 * North: Z decreasing
	 * West: X decreasing 
	 */
	
	public void renderSouthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockTriangle corner, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(corner, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0.5, y + 0, z + 0.5, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		//Top
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 0.5, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
		//Full-side
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
		//Full-side
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, minV);
		//Front
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
	}
	
	public void renderSouthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockTriangle corner, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(corner, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0.5, y + 0, z + 0.5, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		//Top
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 0.5, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
		//Full-side
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		//Full-side
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, minV);
		//Front
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, maxV);
	}
	
	public void renderNorthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockTriangle corner, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(corner, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0.5, y + 0, z + 0.5, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		//Top
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 0.5, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, maxV);
		//Full-side
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		//Full-side
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		//Front
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
	}
	
	public void renderNorthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockTriangle corner, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(corner, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0.5, y + 0, z + 0.5, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		//Top
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 0.5, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, maxV);
		//Full-side
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		//Full-side
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		//Front
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, minV);
	}

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
