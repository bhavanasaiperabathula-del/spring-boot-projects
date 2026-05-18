package com.example.authorization.entity;

import java.util.Set;

public enum Roles {

    ADMIN(Set.of(Permissions.READ, Permissions.WRITE, Permissions.DELETE)),
    USER(Set.of(Permissions.READ));

    private final Set<Permissions> permissions;

    Roles(Set<Permissions> permissions){
        this.permissions = permissions;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    

}
