package template_method.after;

public class Naver extends MemberService {
    @Override
    void query() {
        System.out.println("네이버 회원 테이블에서 조회 쿼리 실행");
    }
}
