package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.InnerCornerRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockShallowCorner extends Block {

	public static enum ShallowCornerType {
		NORTH_EAST_LOWER(0,0,0,1,.5,1),
		NORTH_WEST_LOWER(0,0,0,1,.5,1),
		SOUTH_EAST_LOWER(0,0,0,1,.5,1),
		SOUTH_WEST_LOWER(0,0,0,1,.5,1),
		NORTH_EAST_MIDDLE(0,0,0,1,1,1),
		NORTH_WEST_MIDDLE(0,0,0,1,1,1),
		SOUTH_EAST_MIDDLE(0,0,0,1,1,1),
		SOUTH_WEST_MIDDLE(0,0,0,1,1,1),
		NORTH_EAST_UPPER(0,0,0,1,1,1),
		NORTH_WEST_UPPER(0,0,0,1,1,1),
		SOUTH_EAST_UPPER(0,0,0,1,1,1),
		SOUTH_WEST_UPPER(0,0,0,1,1,1);
		
		private ShallowCornerType(double minX, double minY, double minZ, double maxX,
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
	
	public final ShallowCornerType type;
	
	public BlockShallowCorner(Material material, ShallowCornerType type) {
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
		return InnerCornerRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:inner_corner_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
