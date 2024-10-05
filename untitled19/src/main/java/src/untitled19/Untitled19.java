package src.untitled19;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Untitled19 extends JavaPlugin {

    @Override
    public void onEnable() {
        ShapedRecipe Pigg_egg = new ShapedRecipe(new NamespacedKey(this,"PIGG_EGG"),new ItemStack(Material.PIG_SPAWN_EGG));
        ShapedRecipe Apple_gold_plus = new ShapedRecipe(new NamespacedKey(this,"Apple_gold_plus"),new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));


        getCommand("craft").setExecutor(new Commands());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new  Event(), this);

        Pigg_egg.shape("ABS");

        Pigg_egg.setIngredient('A',new ItemStack(Material.EGG));
        Pigg_egg.setIngredient('B',new ItemStack(Material.NETHER_STAR));
        Pigg_egg.setIngredient('S',new ItemStack(Material.PORKCHOP));

        Apple_gold_plus.shape("BS");

        Apple_gold_plus.setIngredient('B',new ItemStack(Material.NETHER_STAR));
        Apple_gold_plus.setIngredient('S',new ItemStack(Material.GOLDEN_APPLE));

        Bukkit.addRecipe(Pigg_egg);
        Bukkit.addRecipe(Apple_gold_plus);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
