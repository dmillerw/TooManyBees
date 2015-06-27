package me.dmillerw.toomanybees

import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.Mod as mod
import cpw.mods.fml.common.Mod.EventHandler as handler
import cpw.mods.fml.common.SidedProxy as proxy

/**
 * @author dmillerw
 */

mod(modid = TooManyBees.ID, name = TooManyBees.NAME, version = TooManyBees.VERSION, modLanguageAdapter = "me.dmillerw.toomanybees.repack.KotlinAdapter")
public object TooManyBees {

    val ID = "TooManyBees"
    val NAME = "TooManyBees"
    val VERSION = "@VERSION@"

    proxy(serverSide = "me.dmillerw.toomanybees.CommonProxy", clientSide = "me.dmillerw.toomanybees.ClientProxy")
    var proxy: CommonProxy? = null

    public handler fun preInit(event: FMLPreInitializationEvent) {
        println("TooManyBees.preInit()")
    }
}