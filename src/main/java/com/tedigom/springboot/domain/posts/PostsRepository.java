package com.tedigom.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity 클래스, PK 타입> 선언
public interface PostsRepository extends JpaRepository<Posts,Long> {
}
