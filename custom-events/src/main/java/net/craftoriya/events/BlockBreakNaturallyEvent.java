package net.craftoriya.events;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.jetbrains.annotations.NotNull;

public class BlockBreakNaturallyEvent extends BlockEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean dropItems;
    private boolean isCancelled;

    public BlockBreakNaturallyEvent(final @NotNull Block theBlock) {
        super(theBlock);
        this.dropItems = true;
        this.isCancelled = false;
    }

    public boolean isDropItems() {
        return dropItems;
    }
    public void setDropItems(boolean dropItems) {
        this.dropItems = dropItems;
    }

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(final boolean cancel) {
        this.isCancelled = cancel;
    }
}
