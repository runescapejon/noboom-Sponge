package noboom.runescapejon.main;

import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.explosive.PrimeExplosiveEvent;

public class blockexplosive {
	@Listener
	public void TNTnoBoom(PrimeExplosiveEvent.Pre event) {
		if (event.getTargetEntity().getType().equals(EntityTypes.PRIMED_TNT)) {
			event.setCancelled(true);
		}
	}

	@Listener
	public void CreepernoBoom(PrimeExplosiveEvent.Pre event) {
		if (event.getTargetEntity().getType().equals(EntityTypes.CREEPER)) {
			event.setCancelled(true);
		}
	}

	@Listener
	public void GhastnoBoom(PrimeExplosiveEvent.Pre event) {
		if (event.getTargetEntity().getType().equals(EntityTypes.FIREBALL)) {
			event.setCancelled(true);
		}
	}
}
