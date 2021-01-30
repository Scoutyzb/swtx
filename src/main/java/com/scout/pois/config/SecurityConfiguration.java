//package com.scout.pois.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author:Scout
// * @data:2021/1/13
// * @description:
// */
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
////
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
//
//        super.configure(auth);
////        auth.authenticationProvider(authProvider);
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/login","freemaker","/login-error").permitAll()  // 静态资源允许访问，
//                .anyRequest().authenticated()
//                .and().csrf().disable()
//                .formLogin()   //基于 Form 表单登录验证
//                .loginPage("/login").failureUrl("/login-error")
//                ;  // 自定义登录界面
//    }
//    //
//    @Override
//    public void configure(WebSecurity web){
//        web.ignoring().antMatchers("/static/**");
//    }
//}
//
//
