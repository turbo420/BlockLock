package me.LockBlock;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Button implements Listener{

	public Button(Main plugin) {
		  /// plugin.getServer()
		}


	@EventHandler//(priority = EventPriority.HIGH)
		public void onBlockBreak(BlockBreakEvent event){
		  
		  //event.getPlayer().sendMessage("working");
	  }
	
	
	
	
	
	
	
	
	
	
}
