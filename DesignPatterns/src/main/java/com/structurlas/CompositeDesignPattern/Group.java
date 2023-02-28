package com.structurlas.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        for (var component : components) {
            component.render();
        }

    }

}
