package pokechu22.mods.basicblocks;

import pokechu22.mods.basicblocks.client.SimpleBlockRenderer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block {
	public BasicBlock(Material material) {
		super(material);
	}
	
	@Override
	public int getRenderType() {
		return SimpleBlockRenderer.usedRenderId;
	}
}