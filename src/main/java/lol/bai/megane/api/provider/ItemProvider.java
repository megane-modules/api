package lol.bai.megane.api.provider;

import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public abstract class ItemProvider<T> extends AbstractProvider<T> {

    public boolean hasItems() {
        return true;
    }

    public abstract int getSlotCount();

    @NotNull
    public abstract ItemStack getStack(int slot);

}
