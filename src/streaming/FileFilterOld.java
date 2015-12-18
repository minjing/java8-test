package streaming;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FileFilterOld {

    public static final void main(String[] args) {
        File dir = new File("");
        Map<String, String> kv = new HashMap<String, String>();
        kv.put("a", "a");
        kv.put("b", "b");
        StringBuilder sb = new StringBuilder();
        Stream<String> kpiNames = Stream.of("a", "b");
        kpiNames.forEach(kpiName -> {
            sb.append(kpiName).append(" = ").append(kv.get(kpiName));
        });
        String.valueOf(Math.random());
    }
}
