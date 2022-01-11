package lol.bai.megane.api.provider.base;

import lol.bai.megane.api.provider.ItemProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class InventoryItemProvider<T> extends ItemProvider<T> {

    private Inventory inventory;

    @Nullable
    protected abstract Inventory getInventory();

    @Override
    public void setContext(World world, BlockPos pos, PlayerEntity player, T t) {
        super.setContext(world, pos, player, t);

        this.inventory = getInventory();
    }

    @Override
    public boolean hasItems() {
        return inventory != null;
    }

    @Override
    public int getSlotCount() {
        return inventory.size();
    }

    @NotNull
    @Override
    public ItemStack getStack(int slot) {
        return inventory.getStack(slot);
    }

}
