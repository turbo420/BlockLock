package me.LockBlock;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Button2 implements Listener{
    Main plugin;
	public Button2(Main passplugin) {
		 this.plugin = passplugin;
		}

	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent event) {
		 Action action = event.getAction();
	 		Player player = event.getPlayer();
	 		 //player.sendMessage("button");
	 		Block block= event.getClickedBlock();
		  if(block == null)
			   return;
	 		//player.sendMessage("button" + block.getType().name());
		  //BlockState state = block.getState();
	  
		  if( action.equals(Action.RIGHT_CLICK_BLOCK)&& event.getClickedBlock().getType().equals(Material.BIRCH_BUTTON)){	
			   
			   //event.setUseInteractedBlock(Result.DENY);
		   event.setCancelled(true);
		   player.sendMessage("button");
		   
		   //Button door = (Button) state;
		  //door.
		  // door.
	   }
	//@EventHandler//(priority = EventPriority.HIGH)
	///	public void onBlockBreak(BlockBreakEvent event){
		  
		  //event.getPlayer().sendMessage("working");
	 // }
	
	   //event.setCancelled(true);
	
	
	//@EventHandler
	//public void shit(PlayerMoveEvent event){
	
	
	///	}
	}
	
	
	}

	
