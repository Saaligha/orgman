package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationRepository;

import java.util.HashSet;
import java.util.Set;

public class OrganisationRepositoryImpl implements OrganisationRepository {

    private Set<Organisation> organisationDB;
    private static OrganisationRepository organisationRepository = null;

    private OrganisationRepositoryImpl() {
        this.organisationDB = new HashSet<>();
    }

    public static OrganisationRepository getOrganisationRepository() {
        if (organisationRepository == null) organisationRepository = new OrganisationRepositoryImpl();
        return organisationRepository;
    }


    @Override
    public Organisation create(Organisation organisation) {
        organisationDB.add(organisation);
        return organisation;
    }


    @Override
    public Organisation read(String orgCode) {
        String integer;
        return organisationDB.stream().filter(organisation -> Boolean.parseBoolean((organisation.getOrgCode().trim()))).findAny().orElse(null);

    }


    @Override
    public Organisation update(Organisation organisation) {
        Organisation toDelete = read(organisation.getOrgCode());

        if(toDelete != null) {
            organisationDB.remove(toDelete);
            return create(organisation);
        }
        return null;
    }


    @Override
    public void delete(String orgCode) {
        Organisation toDelete = read(orgCode);
        if (toDelete != null){
            organisationDB.remove(toDelete);
        }

    }



    @Override
    public Set<Organisation> getAll() {
        return organisationDB;
    }
}
