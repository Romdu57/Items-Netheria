package fr.romdu57.items_netheria;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class items implements Listener {

    @EventHandler
    public void PlayerDropItemEvent(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
            System.out.println("Block: "+event.getItemDrop().getName());
            System.out.println("Player: "+event.getPlayer().getName());
    }
}
