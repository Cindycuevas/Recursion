//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(countDecimals("0001000abcdef586485975324654 6543654465465465654zxjuf;gmlvnsrutmg;oisauit'pmvsaiaism'gtfoisa'iretpkyi9[-w0595768681687 +ias;fmpoiujasldjfmasd;f574697612000006800000"));
    }

    public static int countDecimals(String str) {
        if (str.isEmpty()) {
            return 0;
        } else if (isDecimal(str.charAt(0))) {
            return 1 + countDecimals(str.substring(1));
        } else {
            return countDecimals(str.substring(1));
        }
    }

    private static boolean isDecimal(char ch) {
        return ch >= '0' && ch <= '9';
    }
}