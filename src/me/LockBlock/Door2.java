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

public class Door2 implements Listener{
	 Main plugin;
	public Door2(Main plugin) {
		this.plugin = plugin;
	}

	
	
	 
	
	  @EventHandler
	  public void onPlayerInteract2(PlayerInteractEvent event) {
		  Action action = event.getAction();
	   if(action.equals(Action.RIGHT_CLICK_AIR)| action.equals(Action.LEFT_CLICK_AIR)){
		   return;
	   }
		  
		  
		  if (action.equals(Action.RIGHT_CLICK_BLOCK)&& event.getClickedBlock().getType()==  Material.ACACIA_DOOR  || event.getClickedBlock().getType() ==  Material.SPRUCE_DOOR || event.getClickedBlock().getType()== Material.OAK_DOOR || event.getClickedBlock().getType()== Material.DARK_OAK_DOOR ||event.getClickedBlock().getType()== Material.JUNGLE_DOOR||event.getClickedBlock().getType()== Material.BIRCH_DOOR) {
	  	
		   Player player = event.getPlayer();
		   Block block= event.getClickedBlock();
		   
		   if(block == null)
			   return;
		  // BlockState state = block.getState();
		  // if(state instanceof Door){
			//   Door door = (Door) state;
			  // door.
		  // }
		   
		  // player.sendMessage("running in doors");
		   
		   
		   //BlockState state = block.getState();
	  	 //Doors.spawn(player,block, null);
	  	 Location y = block.getLocation().getBlock().getLocation().subtract(0,3,0);//player.getLocation().getBlock().;
	  	 if(y.getBlock().getType().equals(Material.CHEST)){
	  		 player.sendMessage("running in doors1");
	  	      Chest block33 = (Chest) y.getBlock().getState(); 
	  	      player.sendMessage(block33.getCustomName());
	  	      if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	  event.setCancelled(false);
	  	    	  player.sendMessage("yes it's me");
	  	    	  
	  	    	 // return;
	  	      }else {
	  	    	 event.setCancelled(true);
	  	  		player.sendMessage(""
	  	  				+ "No it's not your Door");
	  	  		//return;
	  		}
	  			
	  		}
	  	 

	  	 Location yBelow = block.getLocation().getBlock().getLocation().subtract(0,2,0);//player.getLocation().getBlock().;
	  	 if(yBelow.getBlock().getType().equals(Material.CHEST)){
	  		 player.sendMessage("running in doors1");
	  		 Chest block33 = (Chest) yBelow.getBlock().getState(); 
	  	      player.sendMessage(block33.getCustomName());
	  	      if(block33.getCustomName().contains(player.getDisplayName())){
	  	    	 event.setCancelled(false);
	  	    	  player.sendMessage("yes it's me");
	  	    	 
	  	    	  //return;
	  	      }else {
	  	    	  event.setCancelled(true);
	  	  		player.sendMessage("No it's not me Bottom");
	  	  		//return;
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
	  	 
	  	 		//lever.(blockData);
	  	 	//block.setBlockData((BlockData) lever);;
	  	 	//if (blockData instanceof Openable) {
	        //    Openable op = (Openable) blockData;
	       //    op.setOpen(op.isOpen());
	       //    player.sendMessage("shit");
	       //    block.setBlockData(blockData);
	      //  }
		   
	  	 
	   }
	   // ALL PRESSURE_PLATE EVENT
	   
	  }

}	
	  	
	  	// @EventHandler
	  	 //public void onBlockPlace(BlockPlaceEvent event)
	  	 //   {
	  		 
	  	   // }
	  	
 
	
	

