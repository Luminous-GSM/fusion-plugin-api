package models.statistics;

import java.util.List;

public class StatisticsResult {
    List<StatisticItem<?>> statistics;

    public StatisticsResult() {
    }

    public StatisticsResult(List<StatisticItem<?>> statistics) {
        this.statistics = statistics;
    }

    public List<StatisticItem<?>> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<StatisticItem<?>> statistics) {
        this.statistics = statistics;
    }
}
