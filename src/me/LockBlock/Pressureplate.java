package me.LockBlock;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Pressureplate implements Listener{
	public Pressureplate (Main plugin) {
		  /// plugin.getServer()
		}
	 @EventHandler
	  public void onPlayerInteract(PlayerInteractEvent event) {
		 
		

		 
		 
	if(event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.DARK_OAK_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.JUNGLE_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.BIRCH_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.JUNGLE_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.SPRUCE_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.JUNGLE_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.OAK_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.JUNGLE_PRESSURE_PLATE)||event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.STONE_PRESSURE_PLATE)){
	  	 boolean notyourdoor = true;
		 Player player = event.getPlayer();
		   Block block1= event.getClickedBlock();
		   //BlockState state = block.getState();
	  	 //Doors.spawn(player,block, null);
	  	 player.sendMessage(event.getEventName());
//MAYBE CANCEL DOOR TO FIX 		   
		   
		   Location y = block1.getLocation().getBlock().getLocation().subtract(1,2,0);//player.getLocation().getBlock().;
	  	 if(y.getBlock().getType().equals(Material.CHEST)){
	  		 //if(!y.getBlock().getType().equals(Material.CHEST)){
	  		//	 event.setCancelled(false);
	  			
	  		// }
	  	      Chest block33 = (Chest) y.getBlock().getState(); 
	  	      player.sendMessage(block33.getCustomName());
	  	      if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	  event.setCancelled(false);
	  	    	  player.sendMessage("yes it's my Door");
	  	    	 
	  	    	 	
	  	      }else {
	  	    	  event.setCancelled(notyourdoor);
	  	  		player.sendMessage(""
	  	  				+ "Not Your Door");
	  	  			
	  		}
	  			
	  		}
	  	 

	  	 Location yBelow = block1.getLocation().getBlock().getLocation().subtract(0,2,1);//player.getLocation().getBlock().; left side of door
	  	 if(yBelow.getBlock().getType().equals(Material.CHEST)){
	  		 //if(!y.getBlock().getType().equals(Material.CHEST)){
	  		//	 event.setCancelled(false);
	  			
	  		 //}
	  		 
	  		 Chest block33 = (Chest) yBelow.getBlock().getState(); 
	  	     player.sendMessage(block33.getCustomName());
	  	     if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	  event.setCancelled(false);
	  	    	  player.sendMessage("yes it's my Door");
	  	    	 
	  	    	  	
	  	     }else {
	  	    	  event.setCancelled(notyourdoor);
	  	      	player.sendMessage("Not Your Door");
	  	  			
	  		}
	  			
	  		}
	  	
	  	 Location yBelow2 = block1.getLocation().getBlock().getLocation().subtract(-1,2,0);//player.getLocation().getBlock().;
	  	 if(yBelow2.getBlock().getType().equals(Material.CHEST)){
	  		// if(!y.getBlock().getType().equals(Material.CHEST)){
	  		//	 event.setCancelled(false);
	  			
	  		// }
	  		 
	  		 Chest block33 = (Chest) yBelow2.getBlock().getState(); 
	  	     player.sendMessage(block33.getCustomName());
	  	     if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	  event.setCancelled(false);
	  	    	  player.sendMessage("yes it's my Door");
	  	    	 
	  	    	  	
	  	     }else {
	  	    	  event.setCancelled(notyourdoor);
	  	      	player.sendMessage("Not Your Door");
	  	  			
	  		}
	  			
	  		}
	  	 
	  	 
	  	 
	  	Location yBelow3 = block1.getLocation().getBlock().getLocation().subtract(0,2,-1);//player.getLocation().getBlock().;
	  	 if(yBelow3.getBlock().getType().equals(Material.CHEST)){
	  		 //if(!y.getBlock().getType().equals(Material.CHEST)){
	  		//	 event.setCancelled(false);
	  			
	  		// }
	  		 
	  		 Chest block33 = (Chest) yBelow3.getBlock().getState(); 
	  	     player.sendMessage(block33.getCustomName());
	  	     if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	  event.setCancelled(false);
	  	    	  player.sendMessage("yes it's my Door");
		  	    	  	
		  	     }else {
	  	    	  event.setCancelled(notyourdoor);
	  	      	player.sendMessage("Not Your Door");
	  	  			
	  		}
	  			
	  		}
	  	  // Chest block33 = (Chest) yBelow.getBlock().getState(); 
	  	 //player.sendMessage(block33.getCustomName());
	  	//BlockData fg = block.getBlockData();
	              
	  	//if(!fg.getAsString().contains("open=false")){
	  	//	player.sendMessage("door close");
	  	//	event.setCancelled(true);
	  	//}else if (!fg.getAsString().contains("open=true")) {
	  	//	event.setCancelled(true);
	  	//	player.sendMessage("door open");
	  	//}
	  	
	  	
	  	
	   }
	   // ALL PRESSURE_PLATE EVENT
	   
	  }
		
		
		
		  // Player player = event.getPlayer();
		  //event.setCancelled(true);
	  	  // player.sendMessage(ChatColor.BLUE + "PRESSURE PLATE");
	  	
	  	 
	   
}
