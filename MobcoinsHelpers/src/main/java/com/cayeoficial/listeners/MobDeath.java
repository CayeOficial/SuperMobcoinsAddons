package com.cayeoficial.listeners;

import com.cayeoficial.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.cayeoficial.helpers.CheckEntity.checkEntity;
import static com.cayeoficial.helpers.CheckItemMeta.checkItemMeta;
import static org.bukkit.Bukkit.getServer;

public class MobDeath implements Listener {
    private final Main plugin;
    public MobDeath(Main plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onMobDeath(EntityDeathEvent event) {
    Player killer = event.getEntity().getKiller();
    if(killer != null) {
        ItemStack itemInOffHand = killer.getInventory().getItemInOffHand();
        if(itemInOffHand.getType() == Material.ENCHANTED_BOOK) {
            ItemMeta itemMeta = itemInOffHand.getItemMeta();
            //Multiplicador x1.5
            //Lore x1.5
            List<String> listx15 = new ArrayList<String>();
            listx15.add("§7§o(( Este multiplicador hace que tengas 5% más");
            listx15.add("§7§ode posibilidad de conseguir un Mobcoin ))");
            listx15.add("§r ");
            listx15.add("§dPara usarlo debes equipartelo en tu");
            listx15.add("§dmano secundaria y matar mobs.");
            //Check x1.5
            if(checkItemMeta(itemMeta, "§5§lMULTIPLICADOR§f | §dMobCoins 5%", listx15) && checkEntity(event.getEntity())) {
                Random random = new Random();
                int posibilidad = random.nextInt(100);
                if(posibilidad < 7) {
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "mobcoins give " + killer.getName() + " 1");
                }
            }

            //Multiplicador x2
            //Lore x2
            List<String> listx2 = new ArrayList<String>();
            listx2.add("§7§o(( Este multiplicador hace que tengas 10% más");
            listx2.add("§7§ode posibilidad de conseguir un Mobcoin ))");
            listx2.add("§r ");
            listx2.add("§dPara usarlo debes equipartelo en tu");
            listx2.add("§dmano secundaria y matar mobs.");
            //Check x1.5
            if(checkItemMeta(itemMeta, "§5§lMULTIPLICADOR§f | §dMobCoins 10%", listx2) && checkEntity(event.getEntity())) {
                Random random = new Random();
                int posibilidad = random.nextInt(100);
                if(posibilidad < 10) {
                    Bukkit.getServer().dispatchCommand(getServer().getConsoleSender(), "mobcoins give " + killer.getName() + " 1");
                }
            }
      }
    }
  }
}
