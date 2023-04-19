package com.settlers.demotesty.Fundimentals;

import com.settlers.demotesty.Controllers.Board;

import java.util.HashMap;

public class ResourceDeck {
    private HashMap<String, Integer> resources;

    public ResourceDeck() {
        resources = new HashMap<String, Integer>();
        resources.put("brick", 19);
        resources.put("grain", 19);
        resources.put("wood", 19);
        resources.put("ore", 19);
        resources.put("wool", 19);
        resources.put("desert", 1);
    }

    public int getCount(String resource) {
        return resources.get(resource);
    }

    public void remove(String resource, int count) {
        int currentCount = resources.get(resource);
        resources.put(resource, currentCount - count);
    }

    public void add(String resource, int count) {
        int currentCount = resources.get(resource);
        resources.put(resource, currentCount + count);
    }

    // Other methods as needed
}
