/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.command.ConsoleCommandSender
 *  org.bukkit.entity.Player
 */
package vn.giakhanhvn.skysim.command;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import vn.giakhanhvn.skysim.features.skill.CombatSkill;
import vn.giakhanhvn.skysim.features.skill.FarmingSkill;
import vn.giakhanhvn.skysim.features.skill.ForagingSkill;
import vn.giakhanhvn.skysim.features.skill.MiningSkill;
import vn.giakhanhvn.skysim.features.skill.Skill;
import vn.giakhanhvn.skysim.user.User;
import vn.giakhanhvn.skysim.util.SUtil;

@CommandParameters(description="Modify your coin amount.", permission="spt.goods", aliases="ssx")
public class SetSkillCommand
extends SCommand {
    @Override
    public void run(CommandSource sender, String[] args) {
        if (args.length != 0 && args.length != 2) {
            throw new CommandArgumentException();
        }
        if (sender instanceof ConsoleCommandSender) {
            throw new CommandFailException("Console senders cannot use this command!");
        }
        User user = sender.getUser();
        Player player = sender.getPlayer();
        if (args.length == 0) {
            this.send(ChatColor.RED + "Incorrect Syntax! Usage /ssx <skillname> <xp>");
            return;
        }
        double xp = Double.parseDouble(args[1]);
        switch (args[0].toLowerCase()) {
            case "combat": 
            case "COMBAT": 
            case "cb": {
                if (xp > 0.0) {
                    Skill.reward(CombatSkill.INSTANCE, xp, player);
                    player.sendMessage(ChatColor.GREEN + "You (or someone) have added " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.GREEN + " Combat XP to your profile.");
                    return;
                }
                if (xp < 0.0 && xp != 0.0) {
                    player.sendMessage(ChatColor.RED + "You (or someone) have " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.RED + " Combat XP from your profile.");
                    return;
                }
                if (xp == 0.0) {
                    player.sendMessage(ChatColor.RED + "Are you kidding me? You add 0 XP?");
                }
            }
            case "farming": 
            case "FARMING": 
            case "fm": {
                if (xp > 0.0) {
                    Skill.reward(FarmingSkill.INSTANCE, xp, player);
                    player.sendMessage(ChatColor.GREEN + "You (or someone) have added " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.GREEN + " Farming XP to your profile.");
                    return;
                }
                if (xp < 0.0 && xp != 0.0) {
                    player.sendMessage(ChatColor.RED + "You (or someone) have " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.RED + " Farming XP from your profile.");
                    return;
                }
                if (xp == 0.0) {
                    player.sendMessage(ChatColor.RED + "Are you kidding me? You add 0 XP?");
                }
            }
            case "foraging": 
            case "FORAGING": 
            case "fg": {
                if (xp > 0.0) {
                    Skill.reward(ForagingSkill.INSTANCE, xp, player);
                    player.sendMessage(ChatColor.GREEN + "You (or someone) have added " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.GREEN + " Foraging XP to your profile.");
                    return;
                }
                if (xp < 0.0 && xp != 0.0) {
                    player.sendMessage(ChatColor.RED + "You (or someone) have " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.RED + " Foraging XP from your profile.");
                    return;
                }
                if (xp == 0.0) {
                    player.sendMessage(ChatColor.RED + "Are you kidding me? You add 0 XP?");
                }
            }
            case "mining": 
            case "MINING": 
            case "mn": {
                if (xp > 0.0) {
                    Skill.reward(MiningSkill.INSTANCE, xp, player);
                    player.sendMessage(ChatColor.GREEN + "You (or someone) have added " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.GREEN + " Mining XP to your profile.");
                    return;
                }
                if (xp < 0.0 && xp != 0.0) {
                    player.sendMessage(ChatColor.RED + "You (or someone) have " + ChatColor.GOLD + SUtil.commaify(xp) + ChatColor.RED + " Mining XP from your profile.");
                    return;
                }
                if (xp != 0.0) break;
                player.sendMessage(ChatColor.RED + "Are you kidding me? You add 0 XP?");
            }
        }
        throw new CommandArgumentException();
    }
}

