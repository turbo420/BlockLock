package me.LockBlock;

import java.util.Iterator;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;



public class Chestit implements Listener{
	public Chestit(Main plugin) {
		  /// plugin.getServer()
		}


	 @EventHandler
	 public void onExplode(EntityExplodeEvent e){
	 if (e.getEntityType().equals(EntityType.PRIMED_TNT)){
	 Iterator<Block> bi = e.blockList().iterator();
	 while (bi.hasNext())
	 if (bi.next().getType() == Material.CHEST){
		 bi.remove();
	 }
		
	 }
	 }
	 
	 
	 
	 
	 
	 
	@EventHandler
    public void onInventoryOpenEvent(InventoryOpenEvent event){
	 //need to make changes       
	 
	 Player player = (Player) event.getPlayer();
	 //UUID uuid = player.getUniqueId();
	  //Player Name =  player.getName().toString();
	//player.sendMessage(event.getInventory().getType().toString());
          
	  if(event.getInventory().getType().toString().contains("CHEST"))
    {
		//player.sendMessage(event.getInventory().getName());
		  if(event.getInventory().getName().equals("Chest")|| event.getInventory().getName().equals("Large Chest") ){
            	
				//player.sendMessage("Normal CHEST");
				 event.setCancelled(false);
				 return;
			 }

	  if(event.getInventory().getName().contains(event.getPlayer().getName())){
            	
            	player.sendMessage(ChatColor.DARK_RED +"[ChestLock:]" + ChatColor.BLUE + "YOUR CHEST");
            	event.setCancelled(false);
            }else {
            	
            	player.sendMessage(ChatColor.DARK_RED +"[ChestLock:]" + ChatColor.RED + "NOT YOUR CHEST");
            	event.setCancelled(true);
			}
            
         
    }

            
 }

	
}
	
