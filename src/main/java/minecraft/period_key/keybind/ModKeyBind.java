package minecraft.period_key.keybind;

import minecraft.period_key.minecraft;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import java.awt.event.KeyEvent;

@Mod.EventBusSubscriber(modid = minecraft.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ModKeyBind {
    public static final KeyMapping period_key = crate("key.period_key.send_period", KeyEvent.VK_PERIOD);

    public static KeyMapping crate(String lang, int key) {
        return new KeyMapping(lang, key, "key.category.period_key");
    }

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(period_key);
    }
}