package net.craftoriya.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CompostChanceEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final ItemStack item;
    private float compostChance;

    public CompostChanceEvent(final ItemStack item, float compostChance) {
        this.item = item;
        this.compostChance = compostChance;
    }

    public ItemStack getItem() {
        return item;
    }
    public float getCompostChance() {
        return compostChance;
    }
    public void setCompostChance(float compostChance) {
        this.compostChance = compostChance;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
