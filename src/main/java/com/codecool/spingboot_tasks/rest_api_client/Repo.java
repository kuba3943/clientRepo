package com.codecool.spingboot_tasks.rest_api_client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Repo {

    @JsonProperty("name")
    private String name;

    @JsonProperty("stargazers_count")
    private int stars;

    @JsonProperty("watchers_count")
    private int watchers;

}
