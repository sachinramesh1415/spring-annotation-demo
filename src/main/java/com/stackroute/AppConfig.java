package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Actor actor() {
        return new Actor("Leonardo DiCaprio","Male",44);
    }
    @Bean
    public Actor actor1() {
        return new Actor("Brad Pitt","Male",46);
    }
    @Bean
    public Actor actor2() {
        return new Actor("Christoph Waltz","Male",62);
    }
    @Bean(name = "movie")
    public Movie movie() {
        return new Movie(actor2());
    }
}
