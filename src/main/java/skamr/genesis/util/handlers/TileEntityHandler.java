package skamr.genesis.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skamr.genesis.blocks.TileEntities.TileEntityIronFurnace;
import skamr.genesis.util.Reference;

public class TileEntityHandler 
{
public static void registerTileEntities()
{
	GameRegistry.registerTileEntity(TileEntityIronFurnace.class, new ResourceLocation(Reference.MOD_ID + ":iron_furnace"));
	
}
}
