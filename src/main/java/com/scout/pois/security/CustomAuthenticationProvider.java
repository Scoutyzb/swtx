//package com.scout.pois.security;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//
//import java.util.ArrayList;
//
///**
// * @author:Scout
// * @data:2021/1/14
// * @description:
// */
//public class CustomAuthenticationProvider implements AuthenticationProvider{
//
//    Authentication authentication;
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        this.authentication = authentication;
//        String name = authentication.getName();
//        String password = authentication.getCredentials().toString();
//
//        if (shouldAuthenticateAgainstThirdPartySystem()) {
//
//            // use the credentials
//            // and authenticate against the third-party system
//            return new UsernamePasswordAuthenticationToken(
//                    name, password, new ArrayList<>());
//        } else {
//            return null;
//        }
//    }
//
//
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return authentication.equals(
//                UsernamePasswordAuthenticationToken.class);
//    }
//}
