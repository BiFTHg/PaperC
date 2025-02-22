package net.craftoriya.events;

import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class NoteBlockRandomTickEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Block block;

    public NoteBlockRandomTickEvent(Block block) {
        this.block = block;
    }
    public Block getBlock() {
        return this.block;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
