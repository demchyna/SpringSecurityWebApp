package com.softserve.academy.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class UserService implements UserDetailsService {


    private List<User> users = Arrays.asList(
            new User(1, "mike",
                    "$2a$10$6U/5JW/Mj9AB20f8zAm3vOpTxCP/ShrEYYcl7v7OrWA4ZwCLR2H7u", Collections.singletonList(new Role("ROLE_WRITER"))),
            new User(2, "nick",
                    "$2a$10$vqkG1Lonp75WyLwQi3RAA.MJ8ElQXEHCFa5FmPUPwnXrc1JOEJB7m", Collections.singletonList(new Role("ROLE_READER")))
    );

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst().orElse(null);

        if (user == null) {
            throw new UsernameNotFoundException("User not found!");
        }

        return user;
    }

}
