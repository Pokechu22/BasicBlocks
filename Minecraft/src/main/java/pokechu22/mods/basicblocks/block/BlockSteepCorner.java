package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.CornerRenderer;
import pokechu22.mods.basicblocks.client.SteepCornerRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteepCorner extends Block {

	public static enum CornerType {
		UPPER_NORTH_EAST(.5,0,0,  1,1,.5),
		UPPER_NORTH_WEST(0,0,0,   .5,1,.5),
		UPPER_SOUTH_EAST(.5,0,.5, 1,1,1),
		UPPER_SOUTH_WEST(0,0,.5,  .5,1,1),
		LOWER_NORTH_EAST(0,0,0,   1,1,1),
		LOWER_NORTH_WEST(0,0,0,   1,1,1),
		LOWER_SOUTH_EAST(0,0,0,   1,1,1),
		LOWER_SOUTH_WEST(0,0,0,   1,1,1);
		
		private CornerType(double minX, double minY, double minZ, double maxX,
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
	
	public final CornerType type;
	
	public BlockSteepCorner(Material material, CornerType type) {
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
		return SteepCornerRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:steep_corner_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
