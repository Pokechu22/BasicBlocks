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
		
		BlockShallowCorner corner = (BlockShallowCorner) block;
		
		Tessellator t = Tessellator.instance;
		
		int lightValue = block.getMixedBrightnessForBlock(world, x, y, z);
		t.setBrightness(lightValue);
		t.setColorOpaque_F(1.0F, 1.0F, 1.0F);
		
		switch(corner.type) {
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
		case MIDDLE_NORTH_EAST:
			renderMiddleNorthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case MIDDLE_NORTH_WEST:
			renderMiddleNorthWest(t, world, x, y, z, corner, modelId, renderer);
			break;
		case MIDDLE_SOUTH_EAST:
			renderMiddleSouthEast(t, world, x, y, z, corner, modelId, renderer);
			break;
		case MIDDLE_SOUTH_WEST:
			renderMiddleSouthWest(t, world, x, y, z, corner, modelId, renderer);
			break;
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
		}
		
		return false;
	}
	
	public void renderUpperNorthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderUpperNorthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderUpperSouthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderUpperSouthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderMiddleNorthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderMiddleNorthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderMiddleSouthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderMiddleSouthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderLowerNorthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderLowerNorthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderLowerSouthEast(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
	}
	
	public void renderLowerSouthWest(Tessellator t, IBlockAccess world, int x, int y, int z,
			BlockShallowCorner block, int modelId, RenderBlocks renderer) {
		IIcon icon = RenderBlocks.getInstance()
				.getBlockIconFromSideAndMetadata(block, 0, 0);
	
		float minU = icon.getMinU();
		float minV = icon.getMinV();
		float maxU = icon.getMaxU();
		float maxV = icon.getMaxV();
		
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
