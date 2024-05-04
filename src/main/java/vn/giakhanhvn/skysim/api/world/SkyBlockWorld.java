package vn.giakhanhvn.skysim.api.world;

import org.bukkit.Bukkit;
import org.bukkit.World;
import vn.giakhanhvn.skysim.util.SLog;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class SkyBlockWorld {

    private final World bukkitWorld;

    private SkyBlockWorld(World world) {
        this.bukkitWorld = world;
    }

    public static SkyBlockWorld of(World world) {
        if (world == null) return null;
        return new SkyBlockWorld(world);
    }

    public static SkyBlockWorld of(String name) {
        if (name.isEmpty()) return null;
        return of(Bukkit.getWorld(name));
    }

    public static void loadWorlds() {
        new BlankWorldCreator("f6").createWorld();
    }

    public boolean unload(boolean save) {
        try {
            Bukkit.unloadWorld(bukkitWorld, save);
            return true;
        } catch (final Exception ignored) {
            SLog.warn("An error occurred while unloading " + bukkitWorld.getName());
            return false;
        }
    }

    public void delete() {
        final World hub = Bukkit.getWorld("world");
        bukkitWorld.getPlayers().forEach(player -> player.teleport(hub.getSpawnLocation()));
        deleteWorldFolder(bukkitWorld.getWorldFolder());
    }

    private void deleteWorldFolder(File folder) {
        if (!unload(false)) return;
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (final File file : files) {
                    deleteWorldFolder(file);
                }
            }
        }
        if (!folder.delete()) {
            System.out.println("Failed to delete file or directory: " + folder);
        }
    }

    public void cloneWorld(String newWorldName) {
        final File copiedFile = new File(Bukkit.getWorldContainer(), newWorldName);
        copyFileStructure(bukkitWorld.getWorldFolder(), copiedFile);
        new BlankWorldCreator(newWorldName).createWorld();
    }

    private void copyFileStructure(File source, File target) {
        try {
            final ArrayList<String> ignore = new ArrayList<>(Arrays.asList("uid.dat", "session.lock"));
            if (!ignore.contains(source.getName())) {
                if (source.isDirectory()) {
                    if (!target.exists())
                        if (!target.mkdirs())
                            throw new IOException("Couldn't create world directory!");
                    final String[] files = source.list();
                    for (final String file : files) {
                        final File srcFile = new File(source, file);
                        final File destFile = new File(target, file);
                        copyFileStructure(srcFile, destFile);
                    }
                } else {
                    final InputStream in = Files.newInputStream(source.toPath());
                    final OutputStream out = Files.newOutputStream(target.toPath());
                    final byte[] buffer = new byte[1024];
                    int length;
                    while (0 < (length = in.read(buffer)))
                        out.write(buffer, 0, length);
                    in.close();
                    out.close();
                }
            }
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

}