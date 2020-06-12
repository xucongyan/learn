package strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyContent {

    private static Map<String, Strategy> strategyMap = new ConcurrentHashMap<>();

    public static void add(String key, Strategy strategy) {
        strategyMap.putIfAbsent(key, strategy);
    }

    public static Strategy getStrategy(String key) {
        return strategyMap.get(key);
    }
}
