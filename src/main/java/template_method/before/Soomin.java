package template_method.before;

public class Soomin {

    public void school() {
        goToSchool();
        study();
        goToHome();
    }

    private void goToSchool() {
        System.out.println("등교버스를 탄다.");
    }

    private void study() {
        System.out.println("수민이는 자료구조 수업을 듣는다.");
    }

    private void goToHome() {
        System.out.println("하교버스를 탄다.");
    }
}
