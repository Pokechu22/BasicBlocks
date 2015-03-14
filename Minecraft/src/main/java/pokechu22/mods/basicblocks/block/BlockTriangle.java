package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.TriangleRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTriangle extends Block {

	public static enum TriangleType {
		NORTH_EAST(.5,0,0,  1,1,.5),
		NORTH_WEST(0,0,0,   .5,1,.5),
		SOUTH_EAST(.5,0,.5, 1,1,1),
		SOUTH_WEST(0,0,.5,  .5,1,1);
		
		private TriangleType(double minX, double minY, double minZ, double maxX,
				double maxY, double maxZ) {
			this.minX = minX;
			this.minY = minY;
			this.minZ = minZ;
			this.maxX = maxX;
			this.maxY = maxY;
			this.maxZ = maxZ;
		}

		public final double minX, minY, minZ, maxX, maxY, maxZ;
	}
	
	public final TriangleType type;
	
	public BlockTriangle(Material material, TriangleType type) {
		super(material);
		this.type = type;
		
		this.minX = type.minX;
		this.minY = type.minY;
		this.minZ = type.minZ;
		this.maxX = type.maxX;
		this.maxY = type.maxY;
		this.maxZ = type.maxZ;
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
