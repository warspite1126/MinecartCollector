package navy.warspite.spigot.MinecartCollector

import org.bukkit.Material
import org.bukkit.entity.Minecart
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.vehicle.VehicleExitEvent
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.Plugin


class OnVehicleExitEventListener(plugin: Plugin) : Listener {
    @EventHandler
    fun onVehicleExitEvent(e: VehicleExitEvent) {
        if (e.exited !is Player) return
        if (e.vehicle !is Minecart) return
        val player = e.exited as Player
        val inv: Inventory = player.inventory
        val vehicle = e.vehicle
        vehicle.remove()
        if (inv.firstEmpty() < 0) return
        inv.addItem(ItemStack(Material.MINECART, 1))
    }
    init { plugin.server.pluginManager.registerEvents(this, plugin) }
}
