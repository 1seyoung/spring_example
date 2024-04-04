package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join() {
        //given : 이러이러한게 주어졋을때
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when : 이렇게 했을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //Member findMember = memberService.findMember(2L);


        //then : 이렇게 된다
        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(findMember);
    }
}
