package pl.coderslab.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(getMapTime());
    }

    public static Map<String, LocalTime> getMapTime() {

        Map<String, LocalTime> map = new HashMap<>();

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String zone : zoneIds) {
            map.put(zone, LocalTime.now(ZoneId.of(zone)));
        }

        return map;
    }

}
