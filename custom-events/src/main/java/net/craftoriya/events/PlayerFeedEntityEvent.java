package net.craftoriya.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PlayerFeedEntityEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Entity entity;
    private final ItemStack usedItem;
    private final EquipmentSlot hand;
    private boolean isFood;

    public PlayerFeedEntityEvent(Entity entity, Player player, ItemStack usedItem, boolean isFood, EquipmentSlot hand) {
        super(player);
        this.entity = entity;
        this.usedItem = usedItem;
        this.isFood = isFood;
        this.hand = hand;
    }

    public EquipmentSlot getHand() {
        return this.hand;
    }
    public ItemStack getUsedItem() {
        return this.usedItem;
    }
    public boolean isFood() {
        return this.isFood;
    }
    public void setFood(boolean isFood) {
        this.isFood = isFood;
    }

    public Entity getEntity() {
        return this.entity;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
