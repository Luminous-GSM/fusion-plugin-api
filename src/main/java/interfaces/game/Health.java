package interfaces.game;

import models.health.HealthResult;
import org.pf4j.ExtensionPoint;

public interface Health extends ExtensionPoint {
    HealthResult health();
}
