package fr.romdu57.items_netheria;

import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.graalvm.compiler.nodes.cfg.Block;

import java.util.Collection;

public class items implements Listener {

    public static void dropItems(final Block block, final Collection<ItemStack> items) {
        for (final ItemStack item : items) {
            System.out.println(item);
        }
    }
}
