package net.craftoriya.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class IsFuelEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final ItemStack item;
    private boolean isFuel;

    public IsFuelEvent(final ItemStack item, boolean isFuel) {
        this.item = item;
        this.isFuel = isFuel;
    }

    public ItemStack getItem() {
        return item;
    }
    public boolean isFuel() {
        return isFuel;
    }
    public void setFuel(boolean isFuel) {
        this.isFuel = isFuel;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
