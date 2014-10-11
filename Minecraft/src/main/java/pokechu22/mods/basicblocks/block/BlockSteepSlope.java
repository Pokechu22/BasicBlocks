package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.SteepSlopeRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

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
	}

	@Override
	public int getRenderType() {
		return SteepSlopeRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:steep_slope_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
