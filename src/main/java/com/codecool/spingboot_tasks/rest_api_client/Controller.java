package com.codecool.spingboot_tasks.rest_api_client;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Controller {

        private final Service service;

        @GetMapping("/{nick}")
        public String getRepos(@PathVariable String nick){
            service.getCount(service.getRepos(nick));
            return "Number of stars: " + service.getCount(service.getRepos(nick)) ;
        }




}
