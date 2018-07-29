package me.LockBlock;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Openable;
import org.bukkit.block.data.Powerable;
import org.bukkit.block.data.type.Switch;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Door;
import org.bukkit.material.Lever;
import org.bukkit.plugin.Plugin;

public class Levers implements Listener{
	Plugin plugin;
	public Levers(Main instance) {
		 plugin = instance;
		}
	
	 	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent event) {
	 		 Action action = event.getAction();
	 		Player player = event.getPlayer();
		 Block block= event.getClickedBlock();
	 		if( action.equals(Action.LEFT_CLICK_BLOCK)&& event.getClickedBlock().getType().equals(Material.LEVER)){
	 		
	 		return;
	 	}
	 		
	 		if( action.equals(Action.RIGHT_CLICK_BLOCK)&& event.getClickedBlock().getType().equals(Material.LEVER)){	
			   
			   if(block == null)
				   return;
	 	
			  // BlockState state = block.getState();
			 //  if(state instanceof Lever){
				//  Lever  door = (Lever) state;
				//  door.
				  // door.
			  // }
	   //if (event.getClickedBlock().getType() == Material.LEVER) {
		   //if(event.getClickedBlock().getType().equals(Material.LEVER)){
		//   BlockData blockData = Material.LEVER.createBlockData();
		   //If you need to set BlockData data values, cast blockData to the appropriate class and then use the associated methods:
		///   Switch stairs = (Switch) blockData;
		  // stairs.setPowered(false);
		   //block.setBlockData(stairs);
			   Location y = block.getLocation().getBlock().getLocation().subtract(1,3,0);//player.getLocation().getBlock().;
			   Location y2 = y.getBlock().getLocation().add(0,0,1);
			   if(y2.getBlock().getType() == Material.CHEST){
				   Chest block33 = (Chest) y2.getBlock().getState(); 
			  	      //player.sendMessage(block33.getCustomName());
			    
				   if(block33.getCustomName().contains(player.getDisplayName())){
					   
					   player.sendMessage("got chest");
					   event.setCancelled(true);
			  		   }else if(!block33.getCustomName().contains(player.getDisplayName())){
		  		   event.setCancelled(true);
		  		   player.sendMessage("NO chest");
			}
			  	 
			   
		   
		   BlockData fg = block.getBlockData();
			
		 
		   
		  /// player.sendMessage(fg.getAsString());
		  if(fg.getAsString().contains("powered=true")){
		  		player.sendMessage("door open");
		  		
		  		//event.setCancelled(true);
		  	}else if (fg.getAsString().contains("powered=false")) {
		  
		  		
		  		//event.setCancelled(true);
		  		player.sendMessage("door close");
		  }
		   //event.setCancelled(true);
			   }
	   
		  } 
	 	}
}

