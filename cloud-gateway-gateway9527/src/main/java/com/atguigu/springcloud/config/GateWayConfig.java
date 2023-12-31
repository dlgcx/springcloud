package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
// https://news.baidu.com/guonei
        routes.route("path_routr_atguigu",
                r -> r.path("/guonei") // #匹配后提供服务的路由地址
                        .uri("https://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
// https://news.baidu.com/guonei
        routes.route("path_routr_atguigu2",
                r -> r.path("/guoji") // #匹配后提供服务的路由地址
                        .uri("https://news.baidu.com/guoji")).build();
        return routes.build();
    }
}
