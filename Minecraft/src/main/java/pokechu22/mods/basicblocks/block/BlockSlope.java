package pokechu22.mods.basicblocks.block;

import java.util.Locale;

import pokechu22.mods.basicblocks.client.SlopeRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockSlope extends Block {

	public static enum SlopeType {
		NORTH,
		EAST,
		SOUTH,
		WEST
	}

	public final SlopeType type;

	public BlockSlope(Material material, SlopeType type) {
		super(material);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRenderType() {
		return SlopeRenderer.usedRenderId;
	}

	@Override
	public String getItemIconName() {
		return "basicblocks:slope_" + this.type.name().toLowerCase(Locale.ENGLISH);
	}

	private IIcon normal, down, up;
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.normal = reg.registerIcon("basicblocks:BaseTexture");
		this.up = reg.registerIcon("basicblocks:SlantPositive");
		this.down = reg.registerIcon("basicblocks:SlantNegative");
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		switch (meta) {
		case 0: return normal;
		case 1: return up;
		case 2: return down;
		default: return null;
		}
	}
}
