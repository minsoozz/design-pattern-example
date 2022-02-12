package template_method.after;

public abstract class School {

    final void dailyLesson() {
        goToSchool();
        study();
        goToHome();
    }

    private void goToSchool() {
        System.out.println("등교버스를 탄다.");
    }

    private void goToHome() {
        System.out.println("하교버스를 탄다.");
    }

    abstract void study();
}
