package net.craftoriya.events;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class EntityTemptAttemptEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Entity entity;
    private final Entity tempter;
    private boolean shouldFollow;

    public EntityTemptAttemptEvent(Entity entity, Entity tempter, boolean shouldFollow) {
        this.entity = entity;
        this.tempter = tempter;
        this.shouldFollow = shouldFollow;
    }

    public boolean getShouldFollow() {
        return this.shouldFollow;
    }
    public void setShouldFollow(boolean shouldFollow) {
        this.shouldFollow = shouldFollow;
    }
    public Entity getEntity() {
        return this.entity;
    }
    public Entity getTempter() {
        return this.tempter;
    }
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
