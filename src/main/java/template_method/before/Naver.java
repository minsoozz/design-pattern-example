package template_method.before;

public class Naver {

    public void selectMember() {
        connection();
        query();
        close();
    }

    private void connection() {
        System.out.println("데이터베이스 커넥션 성공");
    }

    private void query() {
        System.out.println("네이버 회원 조회 쿼리 실행");
    }

    private void close() {
        System.out.println("데이터베이스 커넥션 종료");
    }
}
