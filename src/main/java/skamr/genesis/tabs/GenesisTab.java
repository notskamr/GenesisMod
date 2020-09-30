package skamr.genesis.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import skamr.genesis.init.ModItems;

public class GenesisTab extends CreativeTabs
{

	public GenesisTab(String label) { 
		
		super("genesistab");
		setBackgroundImageName("item_search.png");
		
		
	}

	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.COMPRESSED_IRON);
	
	}
	

	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
}
