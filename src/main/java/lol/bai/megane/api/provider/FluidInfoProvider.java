package lol.bai.megane.api.provider;

import net.minecraft.text.Text;

public abstract class FluidInfoProvider<T> extends AbstractProvider<T> {

    public abstract int getColor();

    public abstract Text getName();

}
