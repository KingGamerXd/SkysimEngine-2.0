package vn.giakhanhvn.skysim.command;

import org.apache.commons.lang.StringUtils;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import vn.giakhanhvn.skysim.command.CommandFailException;
import vn.giakhanhvn.skysim.command.CommandParameters;
import vn.giakhanhvn.skysim.command.CommandSource;
import vn.giakhanhvn.skysim.command.SCommand;
import vn.giakhanhvn.skysim.gui.AdminItemGUI;


@CommandParameters(description="Browse from a catalog of items.", aliases="aib", permission="spt.item")
public class AdminItemBrowserCommand
        extends SCommand {
    @Override
    public void run(CommandSource sender, String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            throw new CommandFailException("Console senders cannot use this command!");
        }
        Player player = sender.getPlayer();
        String query = "";
        if (args.length >= 1) {
            query = StringUtils.join((Object[])args);
        }
        new AdminItemGUI(query).open(player);
    }
}
