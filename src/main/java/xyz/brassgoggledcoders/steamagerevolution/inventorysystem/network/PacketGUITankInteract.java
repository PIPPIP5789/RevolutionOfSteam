package xyz.brassgoggledcoders.steamagerevolution.inventorysystem.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketGUITankInteract implements IMessage {

    BlockPos machinePos;
    String tankName;
    Integer optionalTankNum;

    public PacketGUITankInteract() {
    }

    public PacketGUITankInteract(BlockPos pos, String name) {
        machinePos = pos;
        tankName = name;
        optionalTankNum = -1;
    }

    public PacketGUITankInteract(BlockPos pos, String name, Integer num) {
        machinePos = pos;
        tankName = name;
        optionalTankNum = num;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        machinePos = BlockPos.fromLong(buf.readLong());
        optionalTankNum = buf.readInt();
        tankName = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeLong(machinePos.toLong());
        buf.writeInt(optionalTankNum);
        ByteBufUtils.writeUTF8String(buf, tankName);
    }

}
