package skamr.genesis.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skamr.genesis.blocks.BlockBase;

public class ModBlocks 
{

		public static final List<Block> BLOCKS = new ArrayList<Block>();
		
		public static final Block COMPRESSED_IRON_BLOCK = new BlockBase("compressed_iron_block", Material.IRON);
	
}
