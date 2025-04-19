package net.craftoriya.events;

import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class CanFluidPassThroughBlockEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final @NotNull Block block;
    private final @NotNull Block spreadBlock;
    private boolean isSpreadable;

    public CanFluidPassThroughBlockEvent(final @NotNull Block block, final @NotNull Block spreadBlock, boolean isSpreadable) {
        this.block = block;
        this.spreadBlock = spreadBlock;
        this.isSpreadable = isSpreadable;
    }

    public void setSpreadable(boolean isSpreadable) {
        this.isSpreadable = isSpreadable;
    }
    public boolean isSpreadable() {
        return this.isSpreadable;
    }
    @NotNull
    public final Block getBlock() {
        return this.block;
    }
    @NotNull
    public final Block getSpreadBlock() {
        return this.spreadBlock;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}

