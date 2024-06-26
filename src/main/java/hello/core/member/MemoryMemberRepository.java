package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    //저장소니깐 Map 사용
    private static Map<Long, Member> store = new HashMap<>(); //실무에서는 동시성 이슈가 있을 수 있어서 ConcurrentHashMap을 써야함
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
