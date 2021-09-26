package com.codecool.spingboot_tasks.rest_api_client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class Client {




    private String pre = "https://api.github.com/users/";
    private String post = "/repos?per_page=100";

    public List<Repo> getRepos(String nick) {
        String URL = pre + nick + post;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Repo[]> responseEntity = restTemplate.getForEntity(URL, Repo[].class);
        List<Repo> repos = Arrays.asList(responseEntity.getBody());

       // log.info(repos.get(0).toString());
        log.info(String.valueOf(repos.size()));

        return repos;


    }
}
