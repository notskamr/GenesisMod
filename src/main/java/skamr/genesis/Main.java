package skamr.genesis;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import skamr.genesis.proxy.CommonProxy;
import skamr.genesis.tabs.GenesisTab;
import skamr.genesis.util.Reference;
import skamr.genesis.util.handlers.GUIHandler;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{

	@Instance
	public static Main instance;
	
	
	public static final CreativeTabs genesistab = new GenesisTab("genesistab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
	    NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GUIHandler());

	}

		
	
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
		
	}
}
