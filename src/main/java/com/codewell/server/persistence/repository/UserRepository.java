package com.codewell.server.persistence.repository;

import com.codewell.server.persistence.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseJpaRepository<UserEntity, Long>
{
    UserEntity selectByUserId(final String userId);
    UserEntity selectByEmail(final String email);
    List<UserEntity> selectByUserIds(final List<String> userIds);
}