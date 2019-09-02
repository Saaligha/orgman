package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;
    private Set<Gender> genderDB;

    private GenderRepositoryImpl() {
        this.genderDB = new HashSet<>();
    }

    public static GenderRepository genderRepository() {
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    @Override
    public Gender create(Gender gender) {
        genderDB.add(gender);
        return gender;
    }


    @Override
    public Gender read(String genderId) {
        return genderDB.stream().filter(gender -> (gender.getGenderId()== genderId)).findAny().orElse(null);
    }

    @Override
    public Gender update(Gender gender) {
        Gender toDel = read(gender.getGenderId());

        if (toDel == null) {
            genderDB.remove(gender);
            return create(gender);
        }
        return null;
    }

    @Override
    public void delete(String genderId) {
        Gender toDel = read(genderId);
        if(toDel!=null){
            genderDB.remove(toDel);
        }
    }


    @Override
    public Set<Gender> getAll() {
        return genderDB;
    }
}
