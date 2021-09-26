package com.codecool.spingboot_tasks.rest_api_client;

import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {

    private final Client client;

    public List<Repo> getRepos(String nick) {
        return client.getRepos(nick);
    }

    public int getCount(List<Repo> list){
        int result = 0;
        for (Repo repo : list) {
            result=result+repo.getStars();
        }
        return result;
    }


}

