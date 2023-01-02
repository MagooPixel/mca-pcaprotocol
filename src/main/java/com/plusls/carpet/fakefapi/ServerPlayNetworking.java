package com.plusls.carpet.fakefapi;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.s2c.play.CustomPayloadS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ServerPlayNetworking
{
    public static void send(@NotNull ServerPlayerEntity player, Identifier identifier, PacketByteBuf buf)
    {
        player.networkHandler.sendPacket(new CustomPayloadS2CPacket(identifier, buf));
    }
}
