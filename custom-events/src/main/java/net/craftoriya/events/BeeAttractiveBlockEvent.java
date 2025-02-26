package net.craftoriya.events;

import org.bukkit.block.data.BlockData;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class BeeAttractiveBlockEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final BlockData blockData;
    private boolean isCancelled;
    private boolean isBeeAttractive;

    public BeeAttractiveBlockEvent(BlockData blockData, boolean isBeeAttractive) {
        this.blockData = blockData;
        this.isBeeAttractive = isBeeAttractive;
        this.isCancelled = false;
    }

    public boolean isBeeAttractive() {
        return isBeeAttractive;
    }
    public void setBeeAttractive(boolean isBeeAttractive) {
        this.isBeeAttractive = isBeeAttractive;
    }
    public BlockData getBlockData() {
        return blockData;
    }
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(final boolean cancel) {
        this.isCancelled = cancel;
    }
}
