package skamr.genesis.util.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import skamr.genesis.blocks.MachineBlocks.IronFurnace.IronFurnaceContainer;
import skamr.genesis.blocks.MachineBlocks.IronFurnace.IronFurnaceGui;
import skamr.genesis.blocks.TileEntities.TileEntityIronFurnace;
import skamr.genesis.util.Reference;

public class GUIHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_IRON_FURNACE)
		{
			return new IronFurnaceContainer(player.inventory, (TileEntityIronFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_IRON_FURNACE)
		{
			return new IronFurnaceGui(player.inventory, (TileEntityIronFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
	
	
	public static void registerGuis()
	{
		
	}
}