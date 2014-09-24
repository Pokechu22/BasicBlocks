package pokechu22.mods.basicblocks.block;

import pokechu22.mods.basicblocks.block.BlockCorner.CornerType;
import pokechu22.mods.basicblocks.block.BlockSlope.SlopeType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockList {

	/**
	 * Basic tab for all mod contents
	 */
	public static CreativeTabs tabBasicBlocks = new CreativeTabs("basicBlocksModTab") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.experience_bottle;
		}
	};
	
	public final static Block baseBlock = new BasicBlock(Material.iron).setHardness(1)
			.setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("baseBlock").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeNorth = new BlockSlope(Material.iron, SlopeType.NORTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeNorth").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeEast = new BlockSlope(Material.iron, SlopeType.EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeSouth = new BlockSlope(Material.iron, SlopeType.SOUTH)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeSouth").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block slopeWest = new BlockSlope(Material.iron, SlopeType.WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("slopeWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerNorthEast = new BlockCorner(Material.iron, CornerType.NORTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerNorthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerNorthWest = new BlockCorner(Material.iron, CornerType.NORTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerNorthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerSouthEast = new BlockCorner(Material.iron, CornerType.SOUTH_EAST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerSouthEast").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
	public final static Block cornerSouthWest = new BlockCorner(Material.iron, CornerType.SOUTH_WEST)
			.setHardness(1).setStepSound(Block.soundTypeMetal).setCreativeTab(tabBasicBlocks)
			.setBlockName("cornerSouthWest").setBlockTextureName("basicblocks:BaseTexture")
			.setLightLevel(1);
}
