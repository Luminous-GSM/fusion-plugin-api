package interfaces;

import models.HealthData;
import org.pf4j.ExtensionPoint;

public interface HealthCheck extends ExtensionPoint {
    HealthData healthCheck();
}
