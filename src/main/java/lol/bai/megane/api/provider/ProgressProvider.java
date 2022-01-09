package lol.bai.megane.api.provider;

import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public abstract class ProgressProvider<T> extends AbstractProvider<T> {

    public boolean hasProgress() {
        return true;
    }

    public abstract int getInputSlotCount();

    public abstract int getOutputSlotCount();

    @NotNull
    public abstract ItemStack getInputStack(int slot);

    @NotNull
    public abstract ItemStack getOutputStack(int slot);

    public abstract int getPercentage();

}
