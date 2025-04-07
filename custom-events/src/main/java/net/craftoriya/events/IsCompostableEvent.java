package net.craftoriya.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IsCompostableEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final ItemStack item;
    private boolean isCompostable;
    @Nullable
    private final EquipmentSlot hand;
    @Nullable
    private final Entity entity;

    public IsCompostableEvent(final ItemStack item, boolean isCompostable, @Nullable final Entity entity, @Nullable final EquipmentSlot hand) {
        this.entity = entity;
        this.hand = hand;
        this.item = item;
        this.isCompostable = isCompostable;
    }

    public @Nullable EquipmentSlot getHand() {
        return hand;
    }
    public @Nullable Entity getEntity() {
        return entity;
    }
    public ItemStack getItem() {
        return item;
    }
    public boolean isCompostable() {
        return isCompostable;
    }
    public void setCompostable(boolean isCompostable) {
        this.isCompostable = isCompostable;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
