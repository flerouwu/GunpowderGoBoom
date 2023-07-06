package dev.flero.gunpowderfurnacerecipe

import org.bukkit.plugin.java.JavaPlugin

class GunpowderFurnaceRecipePlugin : JavaPlugin() {

    override fun onEnable() {
        logger.info("Copying config...")
        saveDefaultConfig()

        logger.info("Adding recipe...")
        server.addRecipe(GunpowderRecipe)

        logger.info("Registering listener...")
        server.pluginManager.registerEvents(Listener(this), this)
    }

}