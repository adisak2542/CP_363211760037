package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("3แชมป์ละนะกับสนามนี้ กับของมือสอง ขอบคุณต่อที่ให้โอกาสคนที่เตะบอลไม่เก่งเหมือนคัยเค้ามาเล่นด้วยในวันนั่น" +
                " ขอบคุนทีมงานของมือสองทุกคนที่ร่วมด้วยช่วยกันมาตลอด อยากให้รักษาทีมนี้กันไปนานๆนะ");
        StringTokenizer strToken = new StringTokenizer(str.toString());
        int countWord = strToken.countTokens();
        System.out.println("Word count: "+countWord);
    }
}
