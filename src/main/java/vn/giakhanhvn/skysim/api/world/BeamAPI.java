package vn.giakhanhvn.skysim.api.world;

import net.jaxonbrown.guardianBeam.beam.Beam;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import vn.giakhanhvn.skysim.SkySimEngine;

public class BeamAPI {

    public static void entityBeam(final ArmorStand stand, Location location1, final Player p, final Entity e) {
        final Beam beam = new Beam(location1.clone().add(location1.getDirection().normalize().multiply(20)), location1.clone().add(location1.getDirection().normalize().multiply(-20)));
        beam.start();

        new BukkitRunnable() {
            public void run() {
                if (stand.isDead()) {
                    if (beam.isActive()) {
                        beam.stop();
                    }
                    this.cancel();
                    return;
                }

                Location location = stand.getLocation();
                location.setYaw(stand.getLocation().getYaw() + 2.25f);
                stand.teleport(location);

                Location start = stand.getLocation().add(stand.getLocation().getDirection().normalize().multiply(20));
                Location end = stand.getLocation().add(stand.getLocation().getDirection().normalize().multiply(-20));

                Sputnik.getEntity(start, end, p, e);

                double argo = Sputnik.findArgo(p.getLocation(), stand.getLocation());
                Location nsPos = stand.getLocation().add(stand.getLocation().getDirection().normalize().multiply(argo));
                Location nePos = stand.getLocation().add(stand.getLocation().getDirection().multiply(-argo));

                beam.setStartingPosition(nsPos);
                beam.setEndingPosition(nePos);

                if (!beam.isActive() && !stand.isDead()) {
                    beam.update();
                }
            }
        }.runTaskTimer((Plugin) SkySimEngine.getPlugin(), 0L, 1L);
    }
}
