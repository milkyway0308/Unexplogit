package skywolf46.explogit.core

import org.spongepowered.asm.launch.MixinBootstrap
import org.spongepowered.asm.mixin.MixinEnvironment
import org.spongepowered.asm.mixin.Mixins

object ExplogitCore {
    fun mixin(isLegacy: Boolean) {
        println("Explogit-Core | Starting explogit core")
        println("Explogit-Core | Initializing bootstrap")
        MixinBootstrap.init()
        Mixins.addConfiguration("mixins.unexplogit.json");
        MixinEnvironment.getDefaultEnvironment().obfuscationContext = if (isLegacy) "notch" else "searge"
        println("Explogit-Core | Hello world")
    }

}