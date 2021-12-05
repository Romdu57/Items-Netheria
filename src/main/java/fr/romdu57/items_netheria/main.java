package fr.romdu57.items_netheria;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[Itemps Netheria] Le plugins vient de se lancer !");
        this.getServer().getPluginManager().registerEvents(new items(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("[Items Netheria] Le plugins vient de se fermer !");
    }
}
