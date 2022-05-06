package com.cayeoficial.helpers;


import org.bukkit.inventory.meta.ItemMeta;
import java.util.List;
import java.util.Objects;

public class CheckItemMeta {
    public static boolean checkItemMeta(ItemMeta itemMeta, String displayname, List<String> lore) {
        if(Objects.equals(itemMeta.getDisplayName(), displayname) && Objects.equals(itemMeta.getLore(), lore)) {
        return true;
        }
        return false;
    }
}
