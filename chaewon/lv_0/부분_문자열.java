package lv_0;

public class 부분_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("abc", "aabcc"));
        System.out.println(solution("tbt", "tbbttb"));
    }

    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
