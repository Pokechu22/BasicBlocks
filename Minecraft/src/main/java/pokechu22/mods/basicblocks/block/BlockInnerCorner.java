package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.InnerCornerRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInnerCorner extends Block {

	public static enum CornerType {
		NORTH_EAST,
		NORTH_WEST,
		SOUTH_EAST,
		SOUTH_WEST
	}
	
	public final CornerType type;
	
	public BlockInnerCorner(Material material, CornerType type) {
		super(material);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRenderType() {
		return InnerCornerRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:inner_corner_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
