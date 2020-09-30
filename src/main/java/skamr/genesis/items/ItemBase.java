package skamr.genesis.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import skamr.genesis.Main;
import skamr.genesis.init.ModItems;
import skamr.genesis.tabs.GenesisTab;
import skamr.genesis.util.IHasModel;

public class ItemBase extends Item  implements IHasModel{
	
	public ItemBase(String name) {
		
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.genesistab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRender(this,0, "inventory");
	}

}
