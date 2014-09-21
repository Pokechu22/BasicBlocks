package pokechu22.mods.basicblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockList {

	public final static Block genericDirt = new BasicBlock(Material.rock)
			.setHardness(0.5F).setStepSound(Block.soundTypeGravel)
			.setBlockName("genericDirt").setCreativeTab(CreativeTabs.tabBlock);
}
