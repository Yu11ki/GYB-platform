//package cm.xlong.meplatform.cgb2203.configuration;
//
//import cn.tedu.homework.filter.JwtAuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    //BCyptPasswordEncoder实现了PasswordEncoder
//    @Bean
//    public PasswordEncoder EncodePassword(){
//        return new BCryptPasswordEncoder();
//    }
//    @Autowired
//    private JwtAuthenticationFilter jwtAuthenticationFilter;
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        String[] urls = {
//                "/admins/login",
//                "/doc.html",
//                "/**/*.css",
//                "/**/*.js",
//                "/favicon.ico",
//                "/v2/api-docs",
//                "/swagger-resources"
//        };
//        http.csrf().disable();//禁用防止跨域访问,即允许跨域,若无即为403
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS, "/**")
//                .permitAll().antMatchers(urls).permitAll().anyRequest().authenticated();
//        //    请求授权                 匹配                           允许所有
//        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//    @Bean
//    @Override
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//
//
//}
