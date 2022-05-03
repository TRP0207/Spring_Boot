package com.loggingSystem.service;

import com.loggingSystem.model.Role;
import com.loggingSystem.model.User;
import com.loggingSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

public class UserDetailServiceImpl implements UserDetailService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly=true)
    public UserDetails LoadUserByUserName(String userName) throws UsernameNotFoundException{
        User user=userRepository.findByUsername(userName);

        Set<GrantedAuthority> grantedAuthoritySet=new HashSet<>();
        for(Role role:user.getRoles()){
            grantedAuthoritySet.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),grantedAuthoritySet);
    }
}
