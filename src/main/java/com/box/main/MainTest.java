package com.box.main;

import com.alibaba.fastjson2.JSON;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException, ParseException {
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime localDateTime = LocalDateTime.parse("2022-01-24 20:46:35",dateTimeFormatter1);
//        LocalDateTime localDateTime1 = LocalDateTime.parse("2022-02-24 20:46:35",dateTimeFormatter1);
//        LocalDateTime localDateTime11 = LocalDateTime.parse("2022-02-25 20:46:35",dateTimeFormatter1);
//        LocalDateTime localDateTime12 = LocalDateTime.parse("2022-02-26 20:46:35",dateTimeFormatter1);
//        LocalDateTime localDateTime13 = LocalDateTime.parse("2022-02-27 20:46:35",dateTimeFormatter1);
//        LocalDateTime localDateTime14 = LocalDateTime.parse("2022-02-27 20:46:35",dateTimeFormatter1);
//        LocalDateTime localDateTime2 = LocalDateTime.parse("2021-01-24 20:46:35",dateTimeFormatter1);
//        System.out.println(localDateTime.atZone(ZoneId.systemDefault()).toEpochSecond());
//        System.out.println(localDateTime1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println(localDateTime11.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println(localDateTime12.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println(localDateTime13.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println(localDateTime14.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println(localDateTime2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        LocalDate now = LocalDate.now();
//        LocalDate localDate = now.minusMonths(6);
//        System.out.println(localDate);
//        System.out.println(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println(ZoneId.systemDefault());
//        System.out.println(LocalDateTime.parse("2022-03-31T16:00:00.000Z",dateTimeFormatter1).toLocalDate());

//
//        String str = "[{\"value\":\"0\",\"label\":\"张三\"},{\"label\":\"李四\",\"value\":\"1\"},{\"label\":\"王五\",\"value\":\"2\"}]";
//        List<Map> maps = JSON.parseArray(str, Map.class);
//        StringBuffer stringBuffer = new StringBuffer();
//        System.out.println("abcde".substring(0,1));

//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name","zhangsan");
//        jsonObject.put("order","DESC");
//        ArrayList<JSONObject> jsonObjects = new ArrayList<>();
//        jsonObjects.add(jsonObject);
//        String str = jsonObjects.toString();
//        List<JSONObject> jsonObjects1 = JSON.parseArray(str, JSONObject.class);
//        System.out.println(jsonObjects1);

//        JSONObject object = new JSONObject();
//        object.put("id","12345");
//        System.out.println(object.getLong("id"));
//
//        String sb = "12345";
//        System.out.println(sb.substring(0,sb.length()-1));
        String str = "[\"0\",\"1\"]";
        List<Byte> bytes = JSON.parseArray(str, Byte.class);
        System.out.println(bytes);
    }
    interface GreetingService {
        void sayMessage(String message);
    }
}
