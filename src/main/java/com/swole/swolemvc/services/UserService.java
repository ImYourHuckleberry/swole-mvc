package com.swole.swolemvc.services;

public interface UserService {
    boolean authenticate(String username, String password);
}
