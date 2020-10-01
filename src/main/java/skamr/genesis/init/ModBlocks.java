package skamr.genesis.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import skamr.genesis.Main;
import skamr.genesis.blocks.BlockBase;
import skamr.genesis.blocks.CustomBlocks.CompressedIronBlock;
import skamr.genesis.blocks.MachineBlocks.IronFurnace.IronFurnace;

public class ModBlocks 
{

		public static final List<Block> BLOCKS = new ArrayList<Block>();
		
		public static final Block COMPRESSED_IRON_BLOCK = new CompressedIronBlock("compressed_iron_block", Material.IRON);
		
		public static final Block IRON_FURNACE_OFF = new IronFurnace("iron_furnace_off",false).setCreativeTab(Main.genesistab);
		public static final Block IRON_FURNACE_ON = new IronFurnace("iron_furnace_on", true).setCreativeTab(Main.genesistab);
	
}
