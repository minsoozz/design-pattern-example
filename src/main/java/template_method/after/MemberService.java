package template_method.after;

public abstract class MemberService {

    final void selectMember() {
        connection();
        query();
        close();
    }

    private void connection() {
        System.out.println("데이터베이스 커넥션 성공");
    }

    private void close() {
        System.out.println("데이터베이스 커넥션 종료");
    }

    abstract void query();
}
