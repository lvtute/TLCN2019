package com.thuan.repository;

import org.springframework.data.repository.CrudRepository;

import com.thuan.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

	Role findByName(String name);
}
