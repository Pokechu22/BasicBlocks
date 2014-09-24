package pokechu22.mods.basicblocks.block;

import pokechu22.mods.basicblocks.client.SlopeRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSlope extends Block {

	public static enum SlopeType {
		NORTH,
		EAST,
		SOUTH,
		WEST
	}
	
	public final SlopeType type;
	
	public BlockSlope(Material material, SlopeType type) {
		super(material);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRenderType() {
		return SlopeRenderer.usedRenderId;
	}
}
