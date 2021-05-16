package com.britishnickk.shulkersadventures;
import com.britishnickk.utils.ConfigHelper;
import com.britishnickk.utils.ConfigHelper.ConfigValueListener;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
    public static class ConfigValues {
        public ConfigValueListener<Boolean> diamondValidRetryCurrency;
        public ConfigValueListener<Boolean> netherStarValidRetryCurrency;

        ConfigValues(ForgeConfigSpec.Builder builder, ConfigHelper.Subscriber subscriber) {
            builder.push("Feature Options");

            builder.push("Retry");

            diamondValidRetryCurrency = subscriber.subscribe(builder
                    .comment("\r\n Whether or not diamonds can be spent to re-enter a failed portal"
                            + "\r\n Default value is false")
                    .translation("britishnickk.config.feature.retry.diamondValidRetryCurrency").define("diamondValidRetryCurrency", false));

            netherStarValidRetryCurrency = subscriber.subscribe(builder
                    .comment("\r\n Whether or not nether stars can be spent to re-enter a failed portal"
                            + "\r\n Default value is false")
                    .translation("britishnickk.config.feature.retry.netherStarValidRetryCurrency").define("netherStarValidRetryCurrency", false));
            
            builder.pop();

//            builder.push("Farmability");
//
//            builder.pop();

            builder.pop();
        }
    }
}