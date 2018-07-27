package me.LockBlock;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Openable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Lever;
import org.bukkit.plugin.Plugin;

public class Levers implements Listener{
	Plugin plugin;
	public Levers(Main instance) {
		 plugin = instance;
		}
	
	 	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent event) {
	 		 Player player = event.getPlayer();
			   Block block= event.getClickedBlock();
			   
			   if(block == null)
				   return;
	 		
	 		
	   if (event.getClickedBlock().getType() == Material.LEVER) {
		   //if(event.getClickedBlock().getType().equals(Material.LEVER)){
		   
			  
		   
		   
		   BlockData fg = block.getBlockData();
			
		 
		   
		   player.sendMessage(fg.getAsString());
		  if(fg.getAsString().contains("powered=true")){
		  		player.sendMessage("door open");
		  		
		  		event.setCancelled(true);
		  	}else if (fg.getAsString().contains("powered=false")) {
		  
		  		
		  		event.setCancelled(true);
		  		player.sendMessage("door close");
		  	}
		   //event.setCancelled(true);
	   }
	   
	 }
	
	 }

