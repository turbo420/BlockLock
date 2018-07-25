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

public class Door implements Listener{

	public Door(Main plugin) {
	  /// plugin.getServer()
	}

	
	
	 
	
	  @EventHandler
	  public void onPlayerInteract(PlayerInteractEvent event) {
	  	
	   if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.LEFT_CLICK_BLOCK)&& event.getClickedBlock().getType().equals(Material.DARK_OAK_DOOR) && event.getClickedBlock().getType().equals(Material.JUNGLE_DOOR)) {
	  	
		   Player player = event.getPlayer();
		   Block block= event.getClickedBlock();
		   //BlockState state = block.getState();
	  	 //Doors.spawn(player,block, null);
	  	 Location y = block.getLocation().getBlock().getLocation().subtract(0,3,0);//player.getLocation().getBlock().;
	  	 if(y.getBlock().getType().equals(Material.CHEST)){
	  		
	  	      Chest block33 = (Chest) y.getBlock().getState(); 
	  	      player.sendMessage(block33.getCustomName());
	  	      if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	  event.setCancelled(false);
	  	    	  player.sendMessage("yes it's me");

	  	    	  return;
	  	      }else {
	  	    	  event.setCancelled(true);
	  	  		player.sendMessage(""
	  	  				+ "no it's not your Top");
	  	  		return;
	  		}
	  			
	  		}
	  	 

	  	 Location yBelow = block.getLocation().getBlock().getLocation().subtract(0,2,0);//player.getLocation().getBlock().;
	  	 if(yBelow.getBlock().getType().equals(Material.CHEST)){

	  		 Chest block33 = (Chest) yBelow.getBlock().getState(); 
	  	      player.sendMessage(block33.getCustomName());
	  	      if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	  event.setCancelled(false);
	  	    	  player.sendMessage("yes it's me");
	  	    	 
	  	    	  return;
	  	      }else {
	  	    	  event.setCancelled(true);
	  	  		player.sendMessage("No it's not me Bottom");
	  	  		return;
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

	  	
	  	
	  	// @EventHandler
	  	 //public void onBlockPlace(BlockPlaceEvent event)
	  	 //   {
	  		 
	  	   // }
	  	

} 
	
	

