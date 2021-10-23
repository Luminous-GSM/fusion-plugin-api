package interfaces.game;

import models.statistics.StatisticsResult;
import org.pf4j.ExtensionPoint;

public interface Statistics extends ExtensionPoint {
    StatisticsResult statistics();
}
