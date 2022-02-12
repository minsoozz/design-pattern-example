package template_method.before;

import org.junit.jupiter.api.Test;

public class TemplateMethodBeforeTest {

    @Test
    void test() {
        Naver naver = new Naver();
        Kakao kakao = new Kakao();

        naver.selectMember();
        System.out.println("============");
        kakao.selectMember();
    }
}
