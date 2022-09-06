package com.dongholab.jpabook.jpashop.repository

import com.dongholab.jpabook.jpashop.entity.Member
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    lateinit var memberRepository: MemberRepository

    @Test
    @Transactional
    @Throws(Exception::class)
    fun testMember() {
        //given
        val member = Member(null, "memberA")

        //when
        val saveId = memberRepository.save(member)
        val findMember = memberRepository.find(saveId)

        //then
        Assertions.assertThat(findMember.id).isEqualTo(member.id)
        Assertions.assertThat(findMember.username).isEqualTo(member.username)
        Assertions.assertThat(findMember).isEqualTo(member)
    }
}