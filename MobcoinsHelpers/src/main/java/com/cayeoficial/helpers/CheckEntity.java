package com.cayeoficial.helpers;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;


public class CheckEntity {
    public static EntityType[] entityTypes = {
            EntityType.ZOMBIE,
            EntityType.SKELETON
    };
    public static boolean checkEntity(Entity entity) {
        for (EntityType en : entityTypes) {
            if(en == entity.getType()) {
                return true;
            }
        }
        return false;
   }
 }

