package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.CornerRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCorner extends Block {

	public static enum CornerType {
		NORTH_EAST(.5,0,0,  1,.5,.5),
		NORTH_WEST(0,0,0,   .5,.5,.5),
		SOUTH_EAST(.5,0,.5, 1,.5,1),
		SOUTH_WEST(0,0,.5,  .5,.5,1);
		
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
	
	public BlockCorner(Material material, CornerType type) {
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
		return CornerRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:corner_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
