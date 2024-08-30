package com.box;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gengbin
 * @date 2024/5/28
 */
public class CronExpressionExample {

    public static String extractPlaceholdersWithPositions(String template) {
        Map<String, String> placeholders = new HashMap<>();
        Pattern pattern = Pattern.compile("\\{\\{(.*?)\\}\\}");
        Matcher matcher = pattern.matcher(template);

        HashMap<String, String> map = new HashMap<>();
        map.put("level","1级");
        map.put("alertCount","2个");
        map.put("name","告警1");

        StringBuilder sb = new StringBuilder(template);
        while (matcher.find()) {
            String placeholder = matcher.group(1);
            int start = matcher.start(); // 跳过前两个大括号
            int end = matcher.end(); // 减去最后两个大括号

            sb.replace(start,end,map.get(placeholder));

            matcher = pattern.matcher(sb);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        LocalTime localTime = parseShortLocalTime("12:12");
        localTime = localTime.plusSeconds(59);
        System.out.println(localTime);


//        String template = "发生{{level}}故障。告警数量{{alertCount}},测试{{name}}";
//        System.out.println(extractPlaceholdersWithPositions(template));
    }
    public static LocalTime parseShortLocalTime(String timeStr) {
        if(StringUtils.isBlank(timeStr)){
            return null;
        }
        return LocalTime
                .from(DateTimeFormatter.ofPattern(SHORT_TIME_PATTERN).parse(timeStr));
    }
    public final static String SHORT_TIME_PATTERN = "HH:mm";
}
