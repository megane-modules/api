package lol.bai.megane.api.provider;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class AbstractProvider<T> {

    private World world;
    private BlockPos pos;
    private PlayerEntity player;
    private T object;

    public void setContext(World world, BlockPos pos, PlayerEntity player, T t) {
        this.world = world;
        this.pos = pos;
        this.player = player;
        this.object = t;
    }

    public boolean blockOtherProvider() {
        return false;
    }

    protected final World getWorld() {
        return world;
    }

    protected final BlockPos getPos() {
        return pos;
    }

    protected final PlayerEntity getPlayer() {
        return player;
    }

    protected final T getObject() {
        return object;
    }

    @SuppressWarnings("unchecked")
    protected final <C> C getObjectCasted() {
        return (C) object;
    }

}
