package ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.RoleRepository;

import java.util.HashSet;
import java.util.Set;

public class RoleRepositoryImpl implements RoleRepository {

    private Set<Role> roleDB;
    private static RoleRepository roleRepository = null;

    private RoleRepositoryImpl() {
        this.roleDB = new HashSet<>();
    }

    public static RoleRepository getRoleRepository() {
        if (roleRepository == null) roleRepository = new RoleRepositoryImpl();
        return roleRepository;
    }

    @Override
    public Role create(Role role) {
        roleDB.add(role);
        return role;
    }


    @Override
    public Role read(String roleId) {
        return roleDB.stream().filter(role -> Boolean.parseBoolean(role.getRoleId().trim())).findAny().orElse(null);
    }


    @Override
    public Role update(Role role) {
        Role toDelete = read(role.getRoleId());

        if(toDelete != null) {
            roleDB.remove(toDelete);
            return create(role);
        }
        return null;
    }


    @Override
    public void delete(String roleId) {
        Role toDelete = read(roleId);
        if (toDelete != null){
            roleDB.remove(toDelete);
        }
    }


    @Override
    public Set<Role> getAll() {
        return roleDB;
    }
}
