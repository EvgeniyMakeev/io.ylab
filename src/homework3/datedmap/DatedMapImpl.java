package homework3.datedmap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DatedMapImpl implements DatedMap{
    private Map<String, String> map = new HashMap<>();
    private Map<String, Date> timeMap = new HashMap<>();
    private Date currentDate = new Date();

    @Override
    public void put(String key, String value) {
        map.put(key, value);
        timeMap.put(key, currentDate);
    }

    @Override
    public String get(String key) {
        return map.get(key);
    }

    @Override
    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    @Override
    public void remove(String key) {
        map.remove(key);
        timeMap.remove(key);
    }

    @Override
    public Set<String> keySet() {
        return map.keySet();
    }

    @Override
    public Date getKeyLastInsertionDate(String key) {
        if (timeMap.get(key) != null) {
            return timeMap.get(key);
        } else {
            return null;
        }
    }
}
