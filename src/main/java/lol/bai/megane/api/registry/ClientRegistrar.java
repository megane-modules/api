package lol.bai.megane.api.registry;

import lol.bai.megane.api.provider.EnergyInfoProvider;
import lol.bai.megane.api.provider.FluidInfoProvider;
import net.minecraft.fluid.Fluid;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public interface ClientRegistrar {

    void addEnergyInfo(String namespace, int color, String unit, Text name);

    default void addEnergyInfo(String namespace, int color, String unit) {
        addEnergyInfo(namespace, color, unit, new TranslatableText("megane.energy"));
    }

    <T> void addEnergyInfo(Class<T> clazz, EnergyInfoProvider<T> provider);

    void addFluidInfo(Fluid fluid, int color, Text name);

    <T> void addFluidInfo(Class<T> clazz, FluidInfoProvider<T> provider);

}
