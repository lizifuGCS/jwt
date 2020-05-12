package com.hand.oauth2.authorization.dto;


import com.hand.oauth2.authorization.entity.Role;
import com.hand.oauth2.authorization.entity.User;

import java.util.List;

public interface UserMapper {
    User loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);
}
