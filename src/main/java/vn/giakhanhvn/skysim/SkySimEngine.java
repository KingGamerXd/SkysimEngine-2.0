/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.comphenix.protocol.ProtocolLibrary
 *  com.comphenix.protocol.ProtocolManager
 *  com.google.common.io.Files
 *  com.onarandombox.MultiverseCore.MultiverseCore
 *  de.slikey.effectlib.EffectManager
 *  net.milkbowl.vault.economy.Economy
 *  org.bukkit.Bukkit
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.command.CommandMap
 *  org.bukkit.configuration.serialization.ConfigurationSerialization
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.HumanEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Event
 *  org.bukkit.event.Listener
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.Recipe
 *  org.bukkit.inventory.ShapedRecipe
 *  org.bukkit.inventory.ShapelessRecipe
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.RegisteredServiceProvider
 *  org.bukkit.plugin.java.JavaPlugin
 *  org.bukkit.plugin.messaging.PluginMessageListener
 *  org.bukkit.potion.PotionEffect
 *  org.bukkit.potion.PotionEffectType
 *  org.bukkit.scheduler.BukkitRunnable
 *  org.bukkit.scheduler.BukkitTask
 */
package vn.giakhanhvn.skysim;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import de.slikey.effectlib.EffectManager;

import java.lang.reflect.Field;
import java.util.*;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandMap;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import vn.giakhanhvn.skysim.api.placeholder.SkyBlockPlaceHolder;
import vn.giakhanhvn.skysim.api.world.BlankWorldCreator;
import vn.giakhanhvn.skysim.features.auction.AuctionBid;
import vn.giakhanhvn.skysim.features.auction.AuctionEscrow;
import vn.giakhanhvn.skysim.features.auction.AuctionItem;
import vn.giakhanhvn.skysim.command.APICommand;
import vn.giakhanhvn.skysim.command.AbsorptionCommand;
import vn.giakhanhvn.skysim.command.AccessTimedCommand;
import vn.giakhanhvn.skysim.command.AuctionHouseCommand;
import vn.giakhanhvn.skysim.command.BatphoneCommand;
import vn.giakhanhvn.skysim.command.BuyBookCommand;
import vn.giakhanhvn.skysim.command.BuyCommand;
import vn.giakhanhvn.skysim.command.BuyCookieCommand;
import vn.giakhanhvn.skysim.command.BuyEPetCommand;
import vn.giakhanhvn.skysim.command.BuyItemCommand;
import vn.giakhanhvn.skysim.command.CoinsCommand;
import vn.giakhanhvn.skysim.command.CollectionsCommand;
import vn.giakhanhvn.skysim.command.CommandLoader;
import vn.giakhanhvn.skysim.command.CookieAHCommand;
import vn.giakhanhvn.skysim.command.CookieAnvilCommand;
import vn.giakhanhvn.skysim.command.CookieMerchantCommand;
import vn.giakhanhvn.skysim.command.CookieOpenBinCommand;
import vn.giakhanhvn.skysim.command.DataCommand;
import vn.giakhanhvn.skysim.command.EndCommand;
import vn.giakhanhvn.skysim.command.EndDragonFightCommand;
import vn.giakhanhvn.skysim.command.EntitySpawnersCommand;
import vn.giakhanhvn.skysim.command.GUICommand;
import vn.giakhanhvn.skysim.command.GiveSpaceHelmetCommand;
import vn.giakhanhvn.skysim.command.HotPotatoBookCommand;
import vn.giakhanhvn.skysim.command.HubCommand;
import vn.giakhanhvn.skysim.command.InvRecovery;
import vn.giakhanhvn.skysim.command.IslandCommand;
import vn.giakhanhvn.skysim.command.ItemBrowseCommand;
import vn.giakhanhvn.skysim.command.ItemCommand;
import vn.giakhanhvn.skysim.command.KillAllHostileMobs;
import vn.giakhanhvn.skysim.command.KillAllMobs;
import vn.giakhanhvn.skysim.command.ManaCommand;
import vn.giakhanhvn.skysim.command.MaterialDataCommand;
import vn.giakhanhvn.skysim.command.MembersEnchantCommand;
import vn.giakhanhvn.skysim.command.NBTCommand;
import vn.giakhanhvn.skysim.command.PickupStashCommand;
import vn.giakhanhvn.skysim.command.PlayEnumEffectCommand;
import vn.giakhanhvn.skysim.command.PlayEnumSoundCommand;
import vn.giakhanhvn.skysim.command.RebootServerCommand;
import vn.giakhanhvn.skysim.command.RecombobulateCommand;
import vn.giakhanhvn.skysim.command.RegionCommand;
import vn.giakhanhvn.skysim.command.RemoveEnchantCommand;
import vn.giakhanhvn.skysim.command.ResetCookieCommand;
import vn.giakhanhvn.skysim.command.SSTest;
import vn.giakhanhvn.skysim.command.SaveDataCommand;
import vn.giakhanhvn.skysim.command.ServerInfoCommand;
import vn.giakhanhvn.skysim.command.SkillsCommand;
import vn.giakhanhvn.skysim.command.SkySimEngineCommand;
import vn.giakhanhvn.skysim.command.SkySimMenuCommand;
import vn.giakhanhvn.skysim.command.SoundSequenceCommand;
import vn.giakhanhvn.skysim.command.SpawnSpecCommand;
import vn.giakhanhvn.skysim.command.SpecEffectsCommand;
import vn.giakhanhvn.skysim.command.SpecEnchantmentCommand;
import vn.giakhanhvn.skysim.command.SpecPotionCommand;
import vn.giakhanhvn.skysim.command.SpecRarityCommand;
import vn.giakhanhvn.skysim.command.SpecReforgeCommand;
import vn.giakhanhvn.skysim.command.SpecTestCommand;
import vn.giakhanhvn.skysim.command.StackMyDimoon;
import vn.giakhanhvn.skysim.command.ToggleRepeatingCommand;
import vn.giakhanhvn.skysim.command.ToggleSBACommand;
import vn.giakhanhvn.skysim.command.TradeCommand;
import vn.giakhanhvn.skysim.config.Config;
import vn.giakhanhvn.skysim.features.entity.EntityPopulator;
import vn.giakhanhvn.skysim.features.entity.EntitySpawner;
import vn.giakhanhvn.skysim.features.entity.SEntityType;
import vn.giakhanhvn.skysim.features.entity.StaticDragonManager;
import vn.giakhanhvn.skysim.features.entity.nms.VoidgloomSeraph;
import vn.giakhanhvn.skysim.gui.GUIListener;
import vn.giakhanhvn.skysim.features.item.*;
import vn.giakhanhvn.skysim.features.item.armor.VoidlingsWardenHelmet;
import vn.giakhanhvn.skysim.features.item.pet.Pet;
import vn.giakhanhvn.skysim.listener.BlockListener;
import vn.giakhanhvn.skysim.listener.PacketListener;
import vn.giakhanhvn.skysim.listener.ServerPingListener;
import vn.giakhanhvn.skysim.listener.WorldListener;
import vn.giakhanhvn.skysim.nms.nmsutil.apihelper.APIManager;
import vn.giakhanhvn.skysim.nms.nmsutil.apihelper.SkySimBungee;
import vn.giakhanhvn.skysim.nms.nmsutil.packetlistener.PacketHelper;
import vn.giakhanhvn.skysim.nms.nmsutil.packetlistener.handler.PacketHandler;
import vn.giakhanhvn.skysim.nms.nmsutil.packetlistener.handler.ReceivedPacket;
import vn.giakhanhvn.skysim.nms.nmsutil.packetlistener.handler.SentPacket;
import vn.giakhanhvn.skysim.nms.nmsutil.packetlistener.metrics.Metrics;
import vn.giakhanhvn.skysim.nms.packetevents.PacketReceiveServerSideEvent;
import vn.giakhanhvn.skysim.nms.packetevents.PacketSentServerSideEvent;
import vn.giakhanhvn.skysim.nms.packetevents.PluginMessageReceived;
import vn.giakhanhvn.skysim.nms.packetevents.SkySimServerPingEvent;
import vn.giakhanhvn.skysim.nms.packetevents.WrappedPluginMessage;
import vn.giakhanhvn.skysim.nms.pingrep.PingAPI;
import vn.giakhanhvn.skysim.features.region.Region;
import vn.giakhanhvn.skysim.features.region.RegionType;
import vn.giakhanhvn.skysim.features.slayer.SlayerQuest;
import vn.giakhanhvn.skysim.database.sql.SQLDatabase;
import vn.giakhanhvn.skysim.database.sql.SQLRegionData;
import vn.giakhanhvn.skysim.database.sql.SQLWorldData;
import vn.giakhanhvn.skysim.server.ServerVersion;
import vn.giakhanhvn.skysim.user.AuctionSettings;
import vn.giakhanhvn.skysim.user.User;
import vn.giakhanhvn.skysim.util.*;

public class SkySimEngine
        extends JavaPlugin
        implements PluginMessageListener,
        BungeeChannel.ForwardConsumer {
    @Getter
    private static ProtocolManager protocolManager;
    @Getter
    private static SkySimEngine plugin;
    private final PacketHelper packetInj = new PacketHelper();

    public boolean altarCooldown = false;
    @Getter
    private final ServerVersion serverVersion = new ServerVersion("beta", 0, 7, 2, 0);
    public static EffectManager effectManager;
    @Getter
    private static SkySimEngine instance;
    public Config config;
    public Config heads;
    public Config blocks;
    public Config spawners;
    @Setter
    @Getter
    private int onlinePlayerAcrossServers;
    public CommandMap commandMap;
    public SQLDatabase sql;
    public SQLRegionData regionData;
    public SQLWorldData worldData;
    public CommandLoader cl;
    public Repeater repeater;
    @Getter
    private BungeeChannel bc;
    @Setter
    @Getter
    private String serverName = "Loading...";
    public List<String> bannedUUID = Collections.singletonList("");

    public void onLoad() {
        SLog.info("Loading Bukkit-serializable classes...");
        this.loadSerializableClasses();
    }

    public void onEnable() {
            this.bc = new BungeeChannel(this);
            SLog.info("===================================");
            SLog.info("SKYSIM ENGINE - MADE BY GIAKHANHVN");
            SLog.info("===================================");
            plugin = this;
            SLog.info("Hooked successfully into SputnikSkySim!");
            SLog.info("Performing world regeneration...");
            this.fixTheEnd();
            SLog.info("Loading YAML data from disk...");
            this.config = new Config("config.yml");
            this.heads = new Config("heads.yml");
            this.blocks = new Config("blocks.yml");
            this.spawners = new Config("spawners.yml");
            SLog.info("Loading Command map...");
            try {
                Field f = Bukkit.getServer().getClass().getDeclaredField("commandMap");
                f.setAccessible(true);
                this.commandMap = (CommandMap) f.get(Bukkit.getServer());
            } catch (IllegalAccessException | NoSuchFieldException e) {
                SLog.severe("Couldn't load command map: ");
                e.printStackTrace();
            }
            SLog.info("Loading SQL database...");
            this.sql = new SQLDatabase();
            this.regionData = new SQLRegionData();
            this.worldData = new SQLWorldData();
            this.cl = new CommandLoader();
            SLog.info("Begin Protocol injection... (SkySimProtocol v0.6.2)");
            APIManager.registerAPI(this.packetInj, this);
            if (!this.packetInj.injected) {
                this.getLogger().warning("[FATAL ERROR] Protocol Injection failed. Disabling the plugin for safety...");
                Bukkit.getPluginManager().disablePlugin(this);
                return;
            }
            SLog.info("Injecting...");
            PingAPI.register();
            new Metrics(this);
            APIManager.initAPI(PacketHelper.class);
            SLog.info("Starting server loop...");
            this.repeater = new Repeater();
            VoidlingsWardenHelmet.startCounting();
            SLog.info("Loading commands...");
            this.loadCommands();
            SLog.info("Loading listeners...");
            this.loadListeners();
            SLog.info("Injecting Packet/Ping Listener into the core...");
            this.registerPacketListener();
            this.registerPingListener();
            SLog.info("Starting entity spawners...");
            EntitySpawner.startSpawnerTask();
            SLog.info("Establishing player regions...");
            Region.cacheRegions();
            SLog.info("Loading auction items from disk...");
            effectManager = new EffectManager(this);
            AuctionItem.loadAuctionsFromDisk();
            SkyBlockCalendar.ELAPSED = SkySimEngine.plugin.config.getLong("timeElapsed");
            SLog.info("Synchronizing world time with calendar time and removing world entities...");
            for (World world : Bukkit.getWorlds()) {
                for (Entity entity : world.getEntities()) {
                    if (entity instanceof HumanEntity) continue;
                    entity.remove();
                }
                int time = (int) (SkyBlockCalendar.ELAPSED % 24000L - 6000L);
                if (time < 0) {
                    time += 24000;
                }
                world.setTime(time);
            }
            SLog.info("Loading items...");
            try {
                Class.forName("vn.giakhanhvn.skysim.features.item.SMaterial");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            for (SMaterial material : SMaterial.values()) {
                if (!material.hasClass()) continue;
                material.getStatistics().load();
            }
            SLog.info("Converting CraftRecipes into custom recipes...");
            Recipe.initializeRecipes();
            SLog.info("Hooking SkySimEngine to PlaceholderAPI and registering...");
            if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
                new SkyBlockPlaceHolder().register();
                SLog.info("Hooked to PAPI successfully!");
            } else {
                SLog.info("ERROR! PlaceholderAPI plugin does not exist, disabing placeholder request!");
            }
            protocolManager = ProtocolLibrary.getProtocolManager();
            WorldListener.initialize();
            SLog.info("Successfully enabled " + this.getDescription().getFullName());
            SLog.info("===================================");
            SLog.info("SKYSIM ENGINE - MADE BY GIAKHANHVN");
            SLog.info("PLUGIN ENABLED! HOOKED INTO SSS!");
            SLog.info("===================================");

    }

    public void onDisable() {
        SLog.info("Killing all non-human entities...");
        for (World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (entity instanceof HumanEntity) continue;
                entity.remove();
            }
        }
        if (this.repeater != null && EntitySpawner.class != null && EntitySpawner.class != null && StaticDragonManager.class != null && SkyBlockCalendar.class != null) {
            SLog.info("Stopping server loop...");
            this.repeater.stop();
            SLog.info("Unloading ores from Dwarven Mines...");
            this.unloadBlocks();
            SLog.info("Ejecting protocol channel...");
            APIManager.disableAPI(PacketHelper.class);
            SLog.info("Cleaning HashSets...");
            for (Map.Entry entry : VoidgloomSeraph.CACHED_BLOCK.entrySet()) {
                Entity stand = (Entity)entry.getKey();
                if (stand == null || !VoidgloomSeraph.CACHED_BLOCK.containsKey(stand) || !VoidgloomSeraph.CACHED_BLOCK_ID.containsKey(stand) || !VoidgloomSeraph.CACHED_BLOCK_DATA.containsKey(stand)) continue;
                VoidgloomSeraph.CACHED_BLOCK.get(stand).getLocation().getBlock().setTypeIdAndData(VoidgloomSeraph.CACHED_BLOCK_ID.get(stand).intValue(), VoidgloomSeraph.CACHED_BLOCK_DATA.get(stand).byteValue(), true);
            }
            this.getServer().getMessenger().unregisterOutgoingPluginChannel(this);
            this.getServer().getMessenger().unregisterIncomingPluginChannel(this);
            SLog.info("Stopping entity spawners...");
            EntitySpawner.stopSpawnerTask();
            SLog.info("Ending Dragons fight... (If one is currently active)");
            StaticDragonManager.endFight();
            SLog.info("Saving calendar time...");
            SkyBlockCalendar.saveElapsed();
            SLog.info("Saving auction data...");
            for (AuctionItem auctionItem : AuctionItem.getAuctions()) {
                auctionItem.save();
            }
            plugin = null;
        }
        SLog.info("Disabled " + this.getDescription().getFullName());
        SLog.info("===================================");
        SLog.info("SKYSIM ENGINE - MADE BY GIAKHANHVN");
        SLog.info("PLUGIN DISABLED!");
        SLog.info("===================================");
    }



    public void unloadBlocks() {
        if (WorldListener.changed_blocks.isEmpty()) {
            return;
        }
        for (Block block : WorldListener.changed_blocks) {
            if (!WorldListener.CACHED_BLOCK_ID.containsKey(block) || !WorldListener.CACHED_BLOCK_BYTE.containsKey(block)) continue;
            int id = WorldListener.CACHED_BLOCK_ID.get(block);
            byte data = WorldListener.CACHED_BLOCK_BYTE.get(block);
            block.setTypeIdAndData(id, data, true);
            if (!WorldListener.changed_blocks.contains(block)) continue;
            WorldListener.changed_blocks.remove(block);
        }
    }

    private void loadCommands() {
        this.cl.register(new SkySimEngineCommand());
        this.cl.register(new RegionCommand());
        this.cl.register(new PlayEnumSoundCommand());
        this.cl.register(new PlayEnumEffectCommand());
        this.cl.register(new SpawnSpecCommand());
        this.cl.register(new ItemCommand());
        this.cl.register(new SpecEnchantmentCommand());
        this.cl.register(new SpecPotionCommand());
        this.cl.register(new SpecEffectsCommand());
        this.cl.register(new SpecReforgeCommand());
        this.cl.register(new ManaCommand());
        this.cl.register(new CoinsCommand());
        this.cl.register(new GUICommand());
        this.cl.register(new ItemBrowseCommand());
        this.cl.register(new SpecRarityCommand());
        this.cl.register(new RecombobulateCommand());
        this.cl.register(new NBTCommand());
        this.cl.register(new IslandCommand());
        this.cl.register(new DataCommand());
        this.cl.register(new SpecTestCommand());
        this.cl.register(new SoundSequenceCommand());
        this.cl.register(new BatphoneCommand());
        this.cl.register(new AbsorptionCommand());
        this.cl.register(new SkillsCommand());
        this.cl.register(new CollectionsCommand());
        this.cl.register(new MaterialDataCommand());
        this.cl.register(new EntitySpawnersCommand());
        this.cl.register(new AuctionHouseCommand());
        this.cl.register(new RebootServerCommand());
        this.cl.register(new HotPotatoBookCommand());
        this.cl.register(new RemoveEnchantCommand());
        this.cl.register(new EndCommand());
        this.cl.register(new EndDragonFightCommand());
        this.cl.register(new ToggleSBACommand());
        this.cl.register(new MembersEnchantCommand());
        this.cl.register(new ToggleRepeatingCommand());
        this.cl.register(new HubCommand());
        this.cl.register(new KillAllMobs());
        this.cl.register(new KillAllHostileMobs());
        this.cl.register(new CookieAHCommand());
        this.cl.register(new CookieAnvilCommand());
        this.cl.register(new CookieOpenBinCommand());
        this.cl.register(new CookieMerchantCommand());
        this.cl.register(new ResetCookieCommand());
        this.cl.register(new SkySimMenuCommand());
        this.cl.register(new BuyCookieCommand());
        this.cl.register(new SaveDataCommand());
        this.cl.register(new GiveSpaceHelmetCommand());
        this.cl.register(new SSTest());
        this.cl.register(new BuyBookCommand());
        this.cl.register(new BuyEPetCommand());
        this.cl.register(new InvRecovery());
        this.cl.register(new BuyItemCommand());
        this.cl.register(new BuyCommand());
        this.cl.register(new TradeCommand());
        this.cl.register(new AccessTimedCommand());
        this.cl.register(new ServerInfoCommand());
        this.cl.register(new APICommand());
        this.cl.register(new PickupStashCommand());
        this.cl.register(new StackMyDimoon());
    }

    private void initDummyWorld(){
        new BlankWorldCreator("arena").createWorld();
    }

    private void loadListeners() {
        new BlockListener();
        new vn.giakhanhvn.skysim.listener.PlayerListener();
        new ServerPingListener();
        new ItemListener();
        new GUIListener();
        new PacketListener();
        new WorldListener();
    }

    private void startPopulators() {
        new EntityPopulator(5, 10, 200L, SEntityType.ENCHANTED_DIAMOND_SKELETON, RegionType.OBSIDIAN_SANCTUARY).start();
        new EntityPopulator(5, 10, 200L, SEntityType.ENCHANTED_DIAMOND_ZOMBIE, RegionType.OBSIDIAN_SANCTUARY).start();
        new EntityPopulator(5, 10, 200L, SEntityType.DIAMOND_ZOMBIE, RegionType.DIAMOND_RESERVE).start();
        new EntityPopulator(5, 10, 200L, SEntityType.DIAMOND_SKELETON, RegionType.DIAMOND_RESERVE).start();
        new EntityPopulator(5, 15, 200L, SEntityType.SMALL_SLIME, RegionType.SLIMEHILL).start();
        new EntityPopulator(5, 10, 200L, SEntityType.MEDIUM_SLIME, RegionType.SLIMEHILL).start();
        new EntityPopulator(5, 5, 400L, SEntityType.LARGE_SLIME, RegionType.SLIMEHILL).start();
        new EntityPopulator(5, 30, 400L, SEntityType.PIGMAN, RegionType.PIGMENS_DEN).start();
        new EntityPopulator(5, 30, 400L, SEntityType.LAPIS_ZOMBIE, RegionType.LAPIS_QUARRY).start();
        new EntityPopulator(5, 10, 400L, SEntityType.SNEAKY_CREEPER, RegionType.GUNPOWDER_MINES).start();
        new EntityPopulator(6, 20, 300L, SEntityType.WEAK_ENDERMAN, RegionType.THE_END_NEST).start();
        new EntityPopulator(6, 20, 300L, SEntityType.ENDERMAN, RegionType.THE_END_NEST).start();
        new EntityPopulator(6, 20, 300L, SEntityType.STRONG_ENDERMAN, RegionType.THE_END_NEST).start();
        new EntityPopulator(10, 30, 200L, SEntityType.ZEALOT, RegionType.DRAGONS_NEST).start();
        new EntityPopulator(1, 5, 1200L, SEntityType.ENDER_CHEST_ZEALOT, RegionType.DRAGONS_NEST).start();
        new EntityPopulator(5, 20, 200L, SEntityType.WATCHER, RegionType.DRAGONS_NEST).start();
        new EntityPopulator(5, 10, 200L, SEntityType.OBSIDIAN_DEFENDER, RegionType.DRAGONS_NEST).start();
        new EntityPopulator(5, 20, 300L, SEntityType.SPLITTER_SPIDER, RegionType.SPIDERS_DEN_HIVE).start();
        new EntityPopulator(5, 20, 300L, SEntityType.WEAVER_SPIDER, RegionType.SPIDERS_DEN_HIVE).start();
        new EntityPopulator(5, 20, 300L, SEntityType.VORACIOUS_SPIDER, RegionType.SPIDERS_DEN_HIVE).start();
        new EntityPopulator(5, 20, 300L, SEntityType.SPIDER_JOCKEY, RegionType.SPIDERS_DEN_HIVE).start();
        new EntityPopulator(5, 20, 300L, SEntityType.DASHER_SPIDER, RegionType.SPIDERS_DEN_HIVE).start();
        new EntityPopulator(5, 10, 300L, SEntityType.HIGH_LEVEL_SKELETON, RegionType.HIGH_LEVEL, world -> world.getTime() >= 13188L && world.getTime() <= 22812L).start();
        new EntityPopulator(5, 15, 200L, SEntityType.ZOMBIE, RegionType.GRAVEYARD).start();
        new EntityPopulator(5, 15, 200L, SEntityType.ZOMBIE_VILLAGER, RegionType.GRAVEYARD).start();
        new EntityPopulator(5, 20, 200L, SEntityType.WOLF, RegionType.RUINS).start();
        new EntityPopulator(2, 4, 200L, SEntityType.OLD_WOLF, RegionType.RUINS).start();
        new EntityPopulator(5, 30, 200L, SEntityType.CRYPT_GHOUL, RegionType.COAL_MINE_CAVES).start();
        new EntityPopulator(1, 1, 200L, SEntityType.GOLDEN_GHOUL, RegionType.COAL_MINE_CAVES).start();
        new EntityPopulator(4, 4, 200L, SEntityType.SOUL_OF_THE_ALPHA, RegionType.HOWLING_CAVE).start();
        new EntityPopulator(5, 15, 200L, SEntityType.HOWLING_SPIRIT, RegionType.HOWLING_CAVE).start();
        new EntityPopulator(5, 15, 200L, SEntityType.PACK_SPIRIT, RegionType.HOWLING_CAVE).start();
    }

    private void loadSerializableClasses() {
        ConfigurationSerialization.registerClass(SlayerQuest.class, "SlayerQuest");
        ConfigurationSerialization.registerClass(Pet.PetItem.class, "PetItem");
        ConfigurationSerialization.registerClass(SItem.class, "SItem");
        ConfigurationSerialization.registerClass(AuctionSettings.class, "AuctionSettings");
        ConfigurationSerialization.registerClass(AuctionEscrow.class, "AuctionEscrow");
        ConfigurationSerialization.registerClass(SerialNBTTagCompound.class, "SerialNBTTagCompound");
        ConfigurationSerialization.registerClass(AuctionBid.class, "AuctionBid");
    }

    public void fixTheEnd() {
        SLog.info("No Tasks");
    }




    private void registerPacketListener() {
        PacketHelper.addPacketHandler(new PacketHandler(){

            @Override
            public void onReceive(ReceivedPacket packet) {
                PacketReceiveServerSideEvent ev = new PacketReceiveServerSideEvent(packet);
                Bukkit.getPluginManager().callEvent(ev);
            }

            @Override
            public void onSend(SentPacket packet) {
                PacketSentServerSideEvent ev = new PacketSentServerSideEvent(packet);
                Bukkit.getPluginManager().callEvent(ev);
            }
        });
    }

    private void registerPingListener() {
        PingAPI.registerListener(event -> {
            SkySimServerPingEvent e = new SkySimServerPingEvent(event);
            Bukkit.getPluginManager().callEvent(e);
        });
    }

    public static Player findPlayerByIPAddress(String ip) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (!p.getAddress().toString().contains(ip)) continue;
            return p;
        }
        return null;
    }


    public void async(final Runnable runnable) {
        new BukkitRunnable(){

            public void run() {
                runnable.run();
            }
        }.runTaskAsynchronously(plugin);
    }

    public BukkitTask syncLoop(final Runnable runnable, int i0, int i1) {
        return new BukkitRunnable(){

            public void run() {
                runnable.run();
            }
        }.runTaskTimer(plugin, i0, i1);
    }

    public BukkitTask asyncLoop(final Runnable runnable, int i0, int i1) {
        return new BukkitRunnable(){

            public void run() {
                runnable.run();
            }
        }.runTaskTimerAsynchronously(plugin, i0, i1);
    }

    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        PluginMessageReceived e = new PluginMessageReceived(new WrappedPluginMessage(channel, player, message));
        Bukkit.getPluginManager().callEvent(e);
    }

    public void updateServerName(Player player) {
        SkySimBungee.getNewBungee().sendData(player, "GetServer", null);
    }

    public void updateServerPlayerCount() {
        if (!Bukkit.getOnlinePlayers().isEmpty()) {
            SkySimBungee.getNewBungee().sendData(null, "PlayerCount", "ALL");
        }
    }

    @Override
    public void accept(String channel, Player player, byte[] data) {
        if (Objects.equals(channel, "savePlayerData")) {
            SLog.info("YES IT WORK");
            for (Player p : Bukkit.getOnlinePlayers()) {
                User u = User.getUser(p.getUniqueId());
                u.syncSavingData();
            }
        }
    }
}
