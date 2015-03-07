package pokechu22.mods.basicblocks.client;

import pokechu22.mods.basicblocks.block.BlockSteepCorner;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class SteepCornerRenderer implements ISimpleBlockRenderingHandler {
	/**
	 * Global render ID, treated as default. 
	 */
	public static int usedRenderId = 0;
	
	/**
	 * Render ID used to render.
	 */
	private final int renderId;
	
	public SteepCornerRenderer(int renderId) {
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
		if (!(block instanceof BlockSteepCorner)) {
			return false;
		}
		
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		BlockSteepCorner corner = (BlockSteepCorner) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		
		switch (corner.type) {
		case UPPER_NORTH_EAST:
			renderUpperNorthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case UPPER_NORTH_WEST:
			renderUpperNorthWest(t, world, x, y, z, corner, modelId, renderer);
			break;
		case UPPER_SOUTH_EAST:
			renderUpperSouthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case UPPER_SOUTH_WEST:
			renderUpperSouthWest(t, world, x, y, z, corner, modelId, renderer);
			break;
		case LOWER_NORTH_EAST:
			renderLowerNorthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case LOWER_NORTH_WEST:
			renderLowerNorthWest(t, world, x, y, z, corner, modelId, renderer);
			break;
		case LOWER_SOUTH_EAST:
			renderLowerSouthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case LOWER_SOUTH_WEST:
			renderLowerSouthWest(t, world, x, y, z, corner, modelId, renderer);
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
	
	public void renderUpperSouthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		//South
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + .5, maxU, maxV);
		//West
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + .5, y + .5, z + 1, maxU, maxV);
		//Top.
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, maxU, maxV);
		
	}
	
	public void renderUpperSouthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		//South
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + .5, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		//East
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, minV);
		t.addVertexWithUV(x + .5, y + .5, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		//Top.
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
	}
	
	public void renderUpperNorthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, maxU, maxV);
		//North
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + .5, minU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		//West
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + .5, y + .5, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		//Top
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
	}
	
	public void renderUpperNorthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, minU, maxV);
		//North
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + .5, maxU, maxV);
		//East
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + .5, y + .5, z + 0, maxU, maxV);
		//Top
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, maxU, maxV);
	}
	
	public void renderLowerSouthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		//South
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + .5, maxU, maxV);
		//West
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + .5, y + .5, z + 1, maxU, maxV);
		//Top.
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, maxU, maxV);
		
	}
	
	public void renderLowerSouthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0.5, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		//Top
		t.addVertexWithUV(x + 1, y + 1, z + 0.5, minU, maxV);
		t.addVertexWithUV(x + .75, y + 1, z + .75, maxU, maxV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, minV);
		//Side
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0.5, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, minV);
		//Side
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 1, minU, maxV);
		//Front
		t.addVertexWithUV(x + 0.5, y + 1, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0.5, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
	}
	
	public void renderLowerNorthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();

		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0.5, minU, maxV);
		//Top
		t.addVertexWithUV(x + 0, y + 1, z + 0.5, minU, maxV);
		t.addVertexWithUV(x + .25, y + 1, z + .25, maxU, maxV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		//Side
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		//Side
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0.5, minU, maxV);
		//Front
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0.5, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0.5, minU, minV);
	}
	
	public void renderLowerNorthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockSteepCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, minU, maxV);
		//North
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + .5, maxU, maxV);
		//East
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + .5, y + .5, z + 0, maxU, maxV);
		//Top
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + .5, y + 0, z + .5, maxU, maxV);
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
