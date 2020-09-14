package main;

public class Mommifier {
    public String vowelslenOver30Per(String str) throws Exception {
        if (str == null) {
            throw new Exception();
        }

        if (str.isEmpty()) {
            return str;
        }

        if (judgeVowelslen(str) * 10 < str.length() * 3) {
            return str;
        }

        String result = insertMommy("mommy", str);
        return result;
    }

    public int judgeVowelslen(String string) {
        String[] strArr = string.trim().split("");
        int vowelsLen = 0;
        for (String value : strArr) {
            if (isVowel(value)) {
                vowelsLen++;
            }
        }
        return vowelsLen;
    }

    public boolean isVowel(String s) {
        String pattern = "aeiouAEIOU";
        return pattern.contains(s);
    }

    public String insertMommy(String insertStr, String str) {
        String[] reArr = str.trim().split("");
        String reStr = "";

        for (int index = 0; index < reArr.length - 1; index++) {
            if (isVowel(reArr[index]) && reArr[index].equals(reArr[index + 1])) {
                reArr[index] = reArr[index] + insertStr;
            }
            reStr += reArr[index];
        }
        reStr += reArr[reArr.length - 1];

        return reStr;
    }
}
