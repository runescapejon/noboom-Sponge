package noboom.runescapejon.main;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

import noboom.runescapejon.main.blockexplosive;

@Plugin(id = "noboom", name = "noboom", description = "no boom blocks minecraft Explosive", version = "1.0")
public class main {
	@Listener
	public void onServerStart(GameStartedServerEvent event) {
	}
	@Listener
	public void onGameInitlization(GameInitializationEvent event) {
		blockexplosive  listener = new blockexplosive();
		Sponge.getEventManager().registerListeners(this, listener);
	}
}
