package com.iiht.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigBaed {

    @Bean
    public RouteLocator gatewayRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("helloservice",r->r.path("/test/**").filters(f->f.addRequestHeader("Hello","World")).uri("lb://LBSERVICE"))
                .build();
    }
}
