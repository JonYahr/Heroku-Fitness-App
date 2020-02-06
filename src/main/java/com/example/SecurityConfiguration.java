//package com.example;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//        	.withUser("Jon").password("jon123").roles("USER")
//        	.and().withUser("Bryana").password("bryana123").roles("USER")
//        	.and().withUser("Collin").password("collin123").roles("USER")
//        	.and().withUser("Matt").password("matt123").roles("USER")
//        	.and().withUser("Ben").password("ben123").roles("USER");
//        
//    }
//    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//    	http  
//	        .authorizeRequests()  
//	        .anyRequest().authenticated()  
//	        .and()  
//	        .formLogin().successHandler(successHandler())
//	        .and()  
//	        .httpBasic();  
//    	
//    }
//    
//    @Bean
//    public AuthenticationSuccessHandler successHandler() {
//        SimpleUrlAuthenticationSuccessHandler handler = new SimpleUrlAuthenticationSuccessHandler();
//        handler.setUseReferer(true);
//        return handler;
//    }
//    
//}
//	
