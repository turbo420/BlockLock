package me.LockBlock;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Button implements Listener{
    Main plugin;
	public Button(Main passplugin) {
		 this.plugin = passplugin;
		}


	@EventHandler//(priority = EventPriority.HIGH)
		public void onBlockBreak(BlockBreakEvent event){
		  
		  //event.getPlayer().sendMessage("working");
	  }
	
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
	    Player p = event.getPlayer();
	    if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        Block clicked = event.getClickedBlock();
	        if (clicked.getType() == Material.STONE_BUTTON) {
	            
	        	//event.setCancelled(true);
	        	p.sendMessage("button set!");
	            ///buttonred = false;
	        }
	    }
	}
	 

	
	
	
	
	
	
}
