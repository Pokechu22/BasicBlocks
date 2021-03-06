package pokechu22.mods.basicblocks.client;

import pokechu22.mods.basicblocks.block.BlockInnerCorner;
import pokechu22.mods.basicblocks.block.BlockShallowSlope;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

/**
 * Shallow slope renderer.
 * <br>
 * Note: Comments in this class's methods are possibly incorrect - top 
 * will probably be side.  This class was partially extrapolated from
 * {@link SteepSlopeRenderer}, and thus the comments are from that.
 * 
 * @author Pokechu22
 *
 */
public class ShallowSlopeRenderer implements ISimpleBlockRenderingHandler {
	/**
	 * Global render ID, treated as default. 
	 */
	public static int usedRenderId = 0;
	
	/**
	 * Render ID used to render.
	 */
	private final int renderId;
	
	public ShallowSlopeRenderer(int renderId) {
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
		if (!(block instanceof BlockShallowSlope)) {
			return false;
		}
		
		BlockShallowSlope slope = (BlockShallowSlope) block;
		
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
		
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setBrightness(lightValue);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		
		switch (slope.type) {
		case UPPER_NORTH:
			renderUpperNorth(t, world, x, y, z, slope, modelId, renderer);
			break;
		case UPPER_EAST:
			renderUpperEast(t, world, x, y, z, slope, modelId, renderer);
			break;
		case UPPER_SOUTH:
			renderUpperSouth(t, world, x, y, z, slope, modelId, renderer);
			break;
		case UPPER_WEST:
			renderUpperWest(t, world, x, y, z, slope, modelId, renderer);
			break;
		case LOWER_NORTH:
			renderLowerNorth(t, world, x, y, z, slope, modelId, renderer);
			break;
		case LOWER_EAST:
			renderLowerEast(t, world, x, y, z, slope, modelId, renderer);
			break;
		case LOWER_SOUTH:
			renderLowerSouth(t, world, x, y, z, slope, modelId, renderer);
			break;
		case LOWER_WEST:
			renderLowerWest(t, world, x, y, z, slope, modelId, renderer);
			break;
		default:
			break;
		
		}
		return true;
	}
	
	public void renderUpperNorth(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		//Top
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		//Back. (South)
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Side. (West)
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, minV);
		//Side. (East)
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		//Slope
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
	}

	public void renderUpperEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		//Top
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, maxU, minV);
		//Back. (East)
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Side. (North)
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, minV);
		//Side. (South)
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 0, maxU, minV);
		//Slope
		t.addVertexWithUV(x + 1, y + 1, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, minU, maxV);
	}
	
	public void renderUpperSouth(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		//Top
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		//Back. (South)
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		//Side. (West)
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		//Side. (East)
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Slope
		t.addVertexWithUV(x + 1, y + 1, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, minV);
	}
	
	public void renderUpperWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, maxV);
		//Top
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		//Back. (East)
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		//Side. (North)
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 1, z + 1, maxU, minV);
		//Side. (South)
		t.addVertexWithUV(x + 0, y + 1, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Slope
		t.addVertexWithUV(x + 0, y + 1, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 1, z + 0, minU, minV);
	}

	public void renderLowerNorth(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		//Back. (South)
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Side. (West)
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		//Side. (East)
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		//Slope
		t.addVertexWithUV(x + 0, y + .5, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, minV);
	}

	public void renderLowerEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		//Back. (East)
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Side. (North)
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, minV);
		//Side. (South)
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 0, maxU, minV);
		//Slope
		t.addVertexWithUV(x + 1, y + .5, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, minU, maxV);
	}
	
	public void renderLowerSouth(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		//Back. (South)
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		//Side. (West)
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		//Side. (East)
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Slope
		t.addVertexWithUV(x + 1, y + .5, z + 1, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, minU, minV);
	}
	
	public void renderLowerWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowSlope block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
	
		//Bottom
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, maxU, minV);
		//Back. (East)
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, maxU, minV);
		//Side. (North)
		t.addVertexWithUV(x + 0, y + 0, z + 1, minU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 0, y + .5, z + 1, maxU, minV);
		//Side. (South)
		t.addVertexWithUV(x + 0, y + .5, z + 0, maxU, minV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, minU, maxV);
		t.addVertexWithUV(x + 0, y + 0, z + 0, minU, minV);
		//Slope
		t.addVertexWithUV(x + 0, y + .5, z + 1, minU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 1, maxU, maxV);
		t.addVertexWithUV(x + 1, y + 0, z + 0, maxU, minV);
		t.addVertexWithUV(x + 0, y + .5, z + 0, minU, minV);
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
