package skamr.genesis.blocks.CustomBlocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import skamr.genesis.Main;
import skamr.genesis.blocks.BlockBase;

public class CompressedIronBlock extends BlockBase
{

	public CompressedIronBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(10F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
		setCreativeTab(Main.genesistab);
		
	}

}
