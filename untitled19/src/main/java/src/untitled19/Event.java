package src.untitled19;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Event implements Listener {
    @EventHandler
    private  void Eventmune(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();

        if (!event.getView().getTitle().equals("Menu_craft")) return;

        if (event.getCurrentItem() == null) return;
        ItemStack clikerItem = event.getCurrentItem();

        if (clikerItem.isSimilar(new ItemStack(Material.PIG_SPAWN_EGG))){
            Inventory inventory = Bukkit.createInventory(null,27,"craft_pig_egg");
            player.openInventory(inventory);

            inventory.addItem(new ItemStack(Material.EGG));
            inventory.addItem(new ItemStack(Material.NETHER_STAR));
            inventory.addItem(new ItemStack(Material.PORKCHOP));

            event.setCancelled(true);
        } else if (clikerItem.isSimilar(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE))) {
            Inventory inventory = Bukkit.createInventory(null,27,"ENCHANTED_GOLDEN_APPLE");

            inventory.addItem(new ItemStack(Material.NETHER_STAR));
            inventory.addItem(new ItemStack(Material.GOLDEN_APPLE));

            player.openInventory(inventory);
        }
    }

    @EventHandler
    private  void ENCHANTED_GOLDEN_APPLE(InventoryClickEvent event){
        if (!event.getView().getTitle().equals("ENCHANTED_GOLDEN_APPLE")) return;
        event.setCancelled(true);
    }
    @EventHandler
    private  void Craft_pigg_egg(InventoryClickEvent event){
        if (!event.getView().getTitle().equals("craft_pig_egg")) return;
        event.setCancelled(true);
    }
}
