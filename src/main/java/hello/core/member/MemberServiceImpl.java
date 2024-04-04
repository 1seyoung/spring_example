package hello.core.member;

public class MemberServiceImpl implements MemberService {
    //구현체가 하나일 때는 인터페이스명 + Impl로 클래스명을 짓는 것이 일반적이다.

    //가입하고 회원찾을려면 멤머 리포 인터페이스 필요

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //문제 : 인터페이스도 의존하는데 구현체도 의존한다 >> 추상화에도 의존 구현체에도 의존 >> DIP 위반
    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {

        return memberRepository.findById(memberId);
    }



}
