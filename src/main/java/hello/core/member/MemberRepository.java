package hello.core.member;


//인터페이스 만들기 > 다음 구현체 만들기
public interface MemberRepository {
    void save(Member member); //멤버 저장

    Member findById(Long memberId); //멤버 아이디로 찾기
}
