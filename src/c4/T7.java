package c4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T7 {

    private static final String[] KEY_MAPS = {"0", "1", "2abc", "3def", "4ghi",
            "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz"};

    public static void main(String[] args) {
        // 初始化字典
        Map<Integer, LinkedList<String>> dic = readDicFile();
        if (dic == null) {
            System.out.println("字典初始化失败！");
            System.exit(-1);
        }
        // 读取输入
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        if (!s.matches("\\d+")) {
            System.out.println("输入非法！");
            System.exit(-1);
        }
        // 获取长度
        LinkedList<String> wordsList = dic.get(s.length());
        if (wordsList == null) {
            System.out.println("没有匹配的单词！");
            return;
        }
        List<String> result = wordsList.stream().filter(word -> {
            String lowerCase = word.toLowerCase(Locale.ENGLISH);
            for (int i = 0; i < s.length(); i++) {
                String chars = KEY_MAPS[s.charAt(i) - '0'];
                char c = lowerCase.charAt(i);
                if (chars.indexOf(c) == -1) {
                    return false;
                }
            }
            return true;
        }).toList();
        System.out.println(result);
    }

    public static Map<Integer, LinkedList<String>> readDicFile() {
        try (InputStream is = T7.class.getResourceAsStream("./words.txt")) {
            if (is == null) {
                return null;
            }
            Map<Integer, LinkedList<String>> dic = new HashMap<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String word = null;
            while ((word = br.readLine()) != null) {
                word = word.trim();
                if (word.isBlank()) {
                    continue;
                }
                LinkedList<String> linkedList = dic.computeIfAbsent(word.length(), k -> new LinkedList<>());
                linkedList.add(word);
            }
            return dic;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
