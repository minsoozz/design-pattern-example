package template_method.before;

import org.junit.jupiter.api.Test;

public class TemplateMethodBeforeTest {

    @Test
    void test() {
        Minsoo minsoo = new Minsoo();
        Soomin soomin = new Soomin();

        minsoo.school();
        System.out.println("============");
        soomin.school();
    }
}
