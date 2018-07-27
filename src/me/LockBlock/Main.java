package me.LockBlock;
import java.util.Arrays;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	ConsoleCommandSender console;
	private static Plugin plugin;
	public void onEnable(){
		
		PluginManager pluginManager  = getServer().getPluginManager();
		Levers levers = new Levers(this);
		Door2 door2 = new Door2(this);
		Button button = new Button(this);
		Chestit chest = new Chestit(this);
		Pressureplate pressureplate = new Pressureplate(this);
		pluginManager.registerEvents(levers, this);
		pluginManager.registerEvents(door2, this);
		pluginManager.registerEvents(button, this);
		pluginManager.registerEvents(pressureplate, this);
		pluginManager.registerEvents(chest, this);
		pluginManager.registerEvents(this, this);
		
		
		 
		console.sendMessage(ChatColor.RED + "-------------------------------");
    	console.sendMessage(ChatColor.GREEN + "----------ChestLock----------");
    	console.sendMessage(ChatColor.GREEN + "---------Version 1.0---------");
    	console.sendMessage(ChatColor.RED + "-------------------------------");
		
		
		
	}
	
	@Override
    public void onLoad() {
		console = Bukkit.getServer().getConsoleSender();
		console.sendMessage(ChatColor.RED + "-------------------------------");
    	console.sendMessage(ChatColor.GREEN + "----------Loading------------");
    	console.sendMessage(ChatColor.GREEN + "---------ChestLock-----------");
    	console.sendMessage(ChatColor.RED + "-------------------------------");
	
	}
	
	@Override
	public void onDisable(){
		
		console.sendMessage(ChatColor.RED + "-------------------------------");
    	console.sendMessage(ChatColor.GREEN + "-----------Disabling-----------");
    	console.sendMessage(ChatColor.GREEN + "-----------ChestLock-----------");
    	console.sendMessage(ChatColor.RED + "-------------------------------");
	}
	
	
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[]args){
	
		if(cmd.getName().equalsIgnoreCase("Lock") & sender instanceof Player){
			 
			if(sender instanceof Player){
				Player player = (Player) sender;
				//Location loc = player.getLocation();
				//World world = player.getWorld();
				 // String name = "GOLD";
		           
				    ItemStack i = new ItemStack(Material.CHEST);
		            
				    ItemMeta im = i.getItemMeta();
		            
		            if (args.length == 0){
		            	im.setDisplayName(ChatColor.RED + "ChestLock:"+player.getName());
		            }else if (args.length == 1){
		            	im.setDisplayName(ChatColor.RED + "ChestLock:"+player.getName() +" " + args[0].toString());	 
		            }else if (args.length == 2){
		            	im.setDisplayName(ChatColor.RED + "ChestLock:"+player.getName() +" " + args[0].toString()+" " + args[1].toString());
					}else if (args.length == 3) {
						im.setDisplayName(ChatColor.RED + "ChestLock:"+player.getName() +" " + args[0].toString()+" " + args[1].toString()+" " + args[2].toString());
					}else if (args.length == 4 ) {
						im.setDisplayName(ChatColor.RED + "ChestLock:"+player.getName() +" " + args[0].toString()+" " + args[1].toString()+" " + args[2].toString()+" " + args[3].toString());

					}else if (args.length == 5) {
						
						player.sendMessage("Too many arguments!");
						return true;
						//im.setDisplayName(ChatColor.RED + "ChestLock:"+player.getName() +" " + args[0].toString()+" " + args[1].toString()+" " + args[2].toString()+" " + args[3].toString());
						
				       
					}    
			  
		            im.setLore(Arrays.asList(ChatColor.GREEN + "ChestLock", ""));
		            i.setItemMeta(im);
		            
		            player.getInventory().setItemInMainHand(i);//getWorld().dropItem(player.getLocation(), i);
				
		        	return true;
			}
			
			
			
		return false;
		}
		
		
		
		
		if(cmd.getName().equalsIgnoreCase("speed") & sender instanceof Player ){
			Player player = (Player) sender;
			 if (args.length == 0){
				 player.sendMessage(ChatColor.AQUA +"Need a Players Name");
				 return true;
			 }else if (args.length == 1){
				 player.sendMessage(ChatColor.AQUA + "Need Speed from 0.1 to 1");
				 return true;	 
			 }
			
			Player target = Bukkit.getServer().getPlayer(args[0]);
			float speed = Float.valueOf(args[1]);
			
			target.setFlySpeed(speed);
			target.sendMessage(ChatColor.YELLOW + "Fly speed set to " + speed);
			return true;
		}
		return false;
	
	}

	
	//To access the plugin variable from other classes
	public static Plugin getPlugin() {
	return plugin;
	}
	
	
	
	
	
	
	@EventHandler
	public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
		//Player player = event.getPlayer();
		//Entity entity = event.getRightClicked();
		//if (!(entity instanceof Player)) return; // not a player
		//Player other = (Player) entity;
		//player.sendMessage(other.getName());
		
		
	}
	
	
	  @EventHandler(priority = EventPriority.HIGH)
		public void onBlockBreak(BlockBreakEvent event){
		  
		  
		  Player player = (Player) event.getPlayer();
			 UUID uuid = player.getUniqueId();
			  Player Name =  getServer().getPlayer(uuid);
			

		  if(event.getBlock().getType().equals(Material.CHEST)){
			
			  Chest block = (Chest) event.getBlock().getState();
			  
			  //player.sendMessage(block.getInventory().getName());
			  
			  if(block.getInventory().getName().equalsIgnoreCase("chest")|| block.getInventory().getName().equalsIgnoreCase("Large chest")){
					 //player.sendMessage("Normal CHEST");
					 event.setCancelled(false);
					 return;
				 }

			  if(block.getInventory().getName().contains(Name.getName())){
				  event.setCancelled(false);
				  player.sendMessage(ChatColor.DARK_RED +"[ChestLock:]" + ChatColor.BLUE + "YOUR CHEST");
				  
			  }else {
				  event.setCancelled(true);
				  player.sendMessage(ChatColor.DARK_RED +"[ChestLock:]" + ChatColor.RED + "NOT YOUR CHEST");
			}
			  
			

	    }
	  }
	
}

	
	
	
	

