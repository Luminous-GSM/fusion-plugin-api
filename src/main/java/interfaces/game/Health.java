package interfaces.game;

import models.HealthResult;
import org.pf4j.ExtensionPoint;

public interface Health extends ExtensionPoint {
    HealthResult health();
}
