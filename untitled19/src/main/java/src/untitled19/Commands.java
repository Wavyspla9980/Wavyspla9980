package src.untitled19;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Material.*;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) return  false;
        Player player = (Player) commandSender;

        Inventory inventory = Bukkit.createInventory(null,27,"Menu_craft");
        inventory.addItem(new ItemStack( PIG_SPAWN_EGG,1));

        inventory.addItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
        player.openInventory(inventory);

        return false;
    }
}
