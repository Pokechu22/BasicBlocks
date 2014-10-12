package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.SteepSlopeRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockSteepSlope extends Block {

	public static enum SlopeType {
		UPPER_NORTH(0,0,0,1,1,.5),
		UPPER_EAST(.5,0,0,1,1,1),
		UPPER_SOUTH(0,0,.5,1,1,1),
		UPPER_WEST(0,0,0,.5,1,1),
		LOWER_NORTH(0,0,0,1,1,1),
		LOWER_EAST(0,0,0,1,1,1),
		LOWER_SOUTH(0,0,0,1,1,1),
		LOWER_WEST(0,0,0,1,1,1);
		
		private SlopeType(double minX, double minY, double minZ, double maxX,
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
	
	public final SlopeType type;
	
	public BlockSteepSlope(Material material, SlopeType type) {
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
		return SteepSlopeRenderer.usedRenderId;
	}
	
	@Override
	public String getItemIconName() {
		return "basicblocks:steep_slope_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}
}
