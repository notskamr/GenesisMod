package skamr.genesis.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import skamr.genesis.Main;
import skamr.genesis.init.ModBlocks;
import skamr.genesis.init.ModItems;
import skamr.genesis.util.IHasModel;

public class BlockBase extends Block implements IHasModel
{

	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.genesistab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
}
