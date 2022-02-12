package template_method.after;

public class Kakao extends MemberService {
    @Override
    void query() {
        System.out.println("카카오 회원 테이블에서 조회 쿼리 실행");
    }
}
