package minecraft.period_key;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(minecraft.MODID)
public class minecraft {
    public static final String MODID = "period_key";

    public minecraft() {
        MinecraftForge.EVENT_BUS.register(new Events());
    }
}
