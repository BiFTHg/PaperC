package net.craftoriya.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BurnDurationEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final ItemStack item;
    private int burnDuration;

    public BurnDurationEvent(final ItemStack item, int burnDuration) {
        this.item = item;
        this.burnDuration = burnDuration;
    }

    public ItemStack getItem() {
        return item;
    }
    public int getBurnDuration() {
        return burnDuration;
    }
    public void setBurnDuration(int burnDuration) {
        this.burnDuration = burnDuration;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
