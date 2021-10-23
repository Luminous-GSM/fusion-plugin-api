package interfaces.game;

import models.backup.BackupResult;
import org.pf4j.ExtensionPoint;

public interface Backup extends ExtensionPoint {
    BackupResult backup();
}
