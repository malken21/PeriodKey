package minecraft.period_key;

import minecraft.period_key.keybind.ModKeyBind;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {
    private static final Minecraft mc = Minecraft.getInstance();

    @SubscribeEvent
    public void KeyInputEvent(InputEvent.Key event) {
        if (ModKeyBind.period_key.isDown()) {
            if (mc.player == null) return;
            mc.player.chatSigned(".", Component.empty());
        }
    }
}
