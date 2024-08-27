package xyz.brassgoggledcoders.steamagerevolution._temp.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xyz.brassgoggledcoders.steamagerevolution._temp.tiles.TileEntitySteamFurnace;
import xyz.brassgoggledcoders.steamagerevolution.machinesystem.multiblock.BlockMultiblockBase;

import javax.annotation.Nonnull;

public class BlockSteamFurnace extends BlockMultiblockBase {

    public BlockSteamFurnace() {
        super(Material.IRON, "multi_steam_furnace");
    }

    @Nonnull
    @Override
    public TileEntity createTileEntity(@Nonnull World world, @Nonnull IBlockState iBlockState) {
        return new TileEntitySteamFurnace();
    }

    @Override
    public Class<? extends TileEntity> getTileEntityClass() {
        return TileEntity.class;
    }

}
