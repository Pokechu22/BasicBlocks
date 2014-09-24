package pokechu22.mods.basicblocks.client;

import pokechu22.mods.basicblocks.block.BlockSlope;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class SlopeRenderer implements ISimpleBlockRenderingHandler {
	/**
	 * Global render ID, treated as default. 
	 */
	public static int usedRenderId = 0;
	
	/**
	 * Render ID used to render.
	 */
	private final int renderId;
	
	public SlopeRenderer(int renderId) {
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
		if (!(block instanceof BlockSlope)) {
			return false;
		}
		
		BlockSlope slope = (BlockSlope) block;
		
		switch (slope.type) {
		case NORTH:
			renderNorth(world, x, y, z, slope, modelId, renderer);
			break;
		case EAST:
			renderEast(world, x, y, z, slope, modelId, renderer);
			break;
		case SOUTH:
			renderSouth(world, x, y, z, slope, modelId, renderer);
			break;
		case WEST:
			renderWest(world, x, y, z, slope, modelId, renderer);
			break;
		default:
			break;
		}
		
		return true;
	}
	
	public void renderNorth(IBlockAccess world, int x, int y, int z,
			BlockSlope block, int modelId, RenderBlocks renderer) {
		IIcon ironIcon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = ironIcon.getMinU();
		float minV = ironIcon.getMinV();
		float maxU = ironIcon.getMaxU();
		float maxV = ironIcon.getMaxV();
		
		BlockSlope s = (BlockSlope) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		//Back.
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		//Side.
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + .5, y + .5, z + 0, minU, maxV);
		//Side.
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + .5, y + .5, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
		//Slant
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
	}
	
	public void renderEast(IBlockAccess world, int x, int y, int z,
			BlockSlope block, int modelId, RenderBlocks renderer) {
		IIcon ironIcon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = ironIcon.getMinU();
		float minV = ironIcon.getMinV();
		float maxU = ironIcon.getMaxU();
		float maxV = ironIcon.getMaxV();
		
		BlockSlope s = (BlockSlope) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		//Bottom
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Back.
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		//Side.
		t.addVertexWithUV(x + 0, y + .5, z + .5, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		//Side.
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + .5, minU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
		//Slant
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
	}
	
	public void renderSouth(IBlockAccess world, int x, int y, int z,
			BlockSlope block, int modelId, RenderBlocks renderer) {
		IIcon ironIcon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = ironIcon.getMinU();
		float minV = ironIcon.getMinV();
		float maxU = ironIcon.getMaxU();
		float maxV = ironIcon.getMaxV();
		
		BlockSlope s = (BlockSlope) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		//Back.
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		//Side.
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + .5, y + .5, z + 1, minU, maxV);
		//Side.
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + .5, y + .5, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		//Slant
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
	}
	
	public void renderWest(IBlockAccess world, int x, int y, int z,
			BlockSlope block, int modelId, RenderBlocks renderer) {
		IIcon ironIcon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = ironIcon.getMinU();
		float minV = ironIcon.getMinV();
		float maxU = ironIcon.getMaxU();
		float maxV = ironIcon.getMaxV();
		
		BlockSlope s = (BlockSlope) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		//Bottom
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Back.
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		//Side.
		t.addVertexWithUV(x + 1, y + .5, z + .5, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		//Side.
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + .5, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		//Slant
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
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
	}}
