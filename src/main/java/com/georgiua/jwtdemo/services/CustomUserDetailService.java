package com.georgiua.jwtdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.georgiua.jwtdemo.model.User;
import com.georgiua.jwtdemo.repositories.UserRepository;
import com.georgiua.jwtdemo.utils.CustomUserPrincipal;

@Service
public class CustomUserDetailService implements UserDetailsService {
	@Autowired
    private UserRepository userRepository;
 
    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserPrincipal(user);
    }
    
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	public User save(User user) {
	    return userRepository.save(user);
    }
}
