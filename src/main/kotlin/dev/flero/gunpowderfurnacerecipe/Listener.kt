package dev.flero.gunpowderfurnacerecipe

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.FurnaceSmeltEvent

class Listener(val plugin: GunpowderFurnaceRecipePlugin) : Listener {

    @EventHandler
    fun onFurnaceSmelt(event: FurnaceSmeltEvent) {
        if (/*event.recipe?.equals(GunpowderRecipe) == true*/ event.recipe?.result?.equals(GunpowderResult) == true) {
            // Create explosion
            val location = event.block.location
            location.world.createExplosion(location, plugin.config.getDouble("explosion.power").toFloat(), plugin.config.getBoolean("explosion.fire"))
        }
    }

}