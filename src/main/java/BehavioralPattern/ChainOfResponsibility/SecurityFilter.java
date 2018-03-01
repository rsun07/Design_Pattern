package BehavioralPattern.ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SecurityFilter implements Filter {
    private static final int RADIX = 10;
    private static Map<Character, Character> encode;

    public SecurityFilter() {
        encode = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            encode.put(
                    Character.forDigit(i, RADIX),
                    Character.forDigit((i+2)%10, RADIX)
            );
        }
    }

    @Override
    public void doFilter(Request request) {
        System.out.println("Executing Security Filter\n The request is " + request.getRequest());

        request.setRequest(decode(request.getRequest()));

        System.out.println("After Security filtering, the request is " + request.getRequest());
    }

    private static String decode(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            char decodeChar = ch;
            if (ch >= '0' && ch <= '9') {
                decodeChar = encode.get(ch);
            }
            sb.append(decodeChar);
        }
        return sb.toString();
    }
}
