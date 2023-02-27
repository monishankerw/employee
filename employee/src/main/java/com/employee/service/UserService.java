package com.employee.service;

import com.employee.entities.User;
import org.springframework.data.domain.Page;

public interface UserService {
    public Page<User> getUsers(int pageNo, int pageSize, String sortBy, String sortDir);
}

