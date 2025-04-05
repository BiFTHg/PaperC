package net.craftoriya.events;

import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.jetbrains.annotations.NotNull;

public class BlockRandomTickEvent extends BlockEvent {
    private static final HandlerList handlers = new HandlerList();

    public BlockRandomTickEvent(final @NotNull Block block) {
        super(block);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
