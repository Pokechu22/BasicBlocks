package pokechu22.mods.basicblocks.block;

import pokechu22.mods.basicblocks.client.SteepSlopeRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteepSlope extends Block {

	public static enum SlopeType {
		UPPER_NORTH,
		UPPER_EAST,
		UPPER_SOUTH,
		UPPER_WEST,
		LOWER_NORTH,
		LOWER_EAST,
		LOWER_SOUTH,
		LOWER_WEST
	}
	
	public final SlopeType type;
	
	public BlockSteepSlope(Material material, SlopeType type) {
		super(material);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRenderType() {
		return SteepSlopeRenderer.usedRenderId;
	}
}
