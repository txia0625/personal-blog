package com.txia.personalBlog.service;

import com.txia.personalBlog.payload.LoginDto;
import com.txia.personalBlog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
