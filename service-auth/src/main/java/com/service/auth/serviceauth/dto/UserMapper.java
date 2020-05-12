package com.service.auth.serviceauth.dto;

import com.service.auth.serviceauth.entity.Role;
import com.service.auth.serviceauth.entity.User;

import java.util.List;

public interface UserMapper {
    User loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);
}
