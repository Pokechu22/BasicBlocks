package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.CornerRenderer;
import pokechu22.mods.basicblocks.client.SteepInnerCornerRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteepInnerCorner extends Block {

	public static enum InnerCornerType {
		UPPER_NORTH_EAST,
		UPPER_NORTH_WEST,
		UPPER_SOUTH_EAST,
		UPPER_SOUTH_WEST,
		LOWER_NORTH_EAST,
		LOWER_NORTH_WEST,
		LOWER_SOUTH_EAST,
		LOWER_SOUTH_WEST
	}
	
	public final InnerCornerType type;
	
	public BlockSteepInnerCorner(Material material, InnerCornerType type) {
		super(material);
		this.type = type;
	}

	@Override
	public int getRenderType() {
		return SteepInnerCornerRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:steep_inner_corner_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
