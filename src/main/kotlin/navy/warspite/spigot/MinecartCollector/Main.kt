package navy.warspite.spigot.MinecartCollector

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        OnVehicleExitEventListener(this)
    }
}
