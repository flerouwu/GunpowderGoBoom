package dev.flero.gunpowderfurnacerecipe

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.FurnaceRecipe
import org.bukkit.inventory.ItemStack

val GunpowderResult: ItemStack = run {
    val stack = ItemStack(Material.GUNPOWDER)
    val meta = stack.itemMeta
    meta.displayName(Component.text("Boom!", NamedTextColor.RED))
    meta.isUnbreakable = true
    stack.itemMeta = meta
    stack
}


val GunpowderRecipe = FurnaceRecipe(
    NamespacedKey.fromString("flero-gunpowderfurnacerecipe:gunpowder_furnace_recipe")!!,
    GunpowderResult,
    Material.GUNPOWDER,
    0.0f,
    60
)