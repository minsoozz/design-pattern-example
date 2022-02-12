package template_method.after;

import org.junit.jupiter.api.Test;

public class TemplateMethodAfterTest {

    @Test
    void test(){
        Minsoo minsoo = new Minsoo();
        SooMin sooMin = new SooMin();

        minsoo.dailyLesson();
        System.out.println("============");
        sooMin.dailyLesson();
    }
}
