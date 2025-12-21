package net.owc.quatschsquad.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterGuiLayersEvent;

//@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class TimeHudOverlay {
    /*@SubscribeEvent
    public static void registerOverlays(RegisterGuiLayersEvent event) {
        event.registerAboveAll("time", renderTime());
    }

    public static void renderTime(GuiGraphics graphics) {
        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft.player == null || minecraft.level == null) return;

        long timeOfDay = minecraft.level.getDayTime() % 24000L;

        int hours = (int) ((timeOfDay / 1000 + 6) % 24);
        int minutes = (int) ((timeOfDay % 1000) * 60 / 1000);

        String timeStr = String.format("%02d:%02d", hours, minutes);

        PoseStack poseStack = graphics.pose();
        poseStack.pushPose();

        int screenWidth = minecraft.getWindow().getGuiScaledWidth();
        int textWidth = minecraft.font.width(timeStr);

        graphics.drawString(minecraft.font, Component.literal(timeStr),
                (screenWidth - textWidth) / 2, 5, 0xFFFFFF, true);

        poseStack.popPose();
    }*/
}
