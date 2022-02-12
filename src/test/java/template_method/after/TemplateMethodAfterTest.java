package template_method.after;

import org.junit.jupiter.api.Test;

public class TemplateMethodAfterTest {

    @Test
    void test(){
        Kakao kakao = new Kakao();
        Naver naver = new Naver();

        kakao.selectMember();
        System.out.println("============");
        naver.selectMember();
    }
}
