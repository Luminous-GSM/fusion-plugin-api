package interfaces;

import interfaces.game.Backup;
import interfaces.game.Health;
import interfaces.game.ServerLifecycle;
import org.pf4j.ExtensionPoint;
import types.PluginType;

// TODO Break up these into separate extensions
public interface BasePlugin extends Health, Backup, ServerLifecycle, ExtensionPoint {
    PluginType getPluginType();

    String getPluginName();
}
