package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.TriangleRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTriangle extends Block {

	public static enum TriangleType {
		NORTH_EAST,
		NORTH_WEST,
		SOUTH_EAST,
		SOUTH_WEST
	}
	
	public final TriangleType type;
	
	public BlockTriangle(Material material, TriangleType type) {
		super(material);
		this.type = type;
	}

	@Override
	public int getRenderType() {
		return TriangleRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:triangle_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
