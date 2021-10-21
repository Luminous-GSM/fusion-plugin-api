package interfaces.game;

import models.BackupResult;
import org.pf4j.ExtensionPoint;

public interface Backup extends ExtensionPoint {
    BackupResult backup();
}
