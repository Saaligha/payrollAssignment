package za.ac.cput.payroll.Service.Demography.impl;

import za.ac.cput.payroll.Domain.Demography.Gender;
import za.ac.cput.payroll.Repository.Demography.GenderRepository;
import za.ac.cput.payroll.Repository.Demography.impl.GenderRepositoryImpl;
import za.ac.cput.payroll.Service.Demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    public GenderServiceImpl() {
        repository = GenderRepositoryImpl.getGenderRepository();
    }

    public static GenderServiceImpl getService(){

        if(service == null){
            return new GenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Gender update(Gender gender) {
        return repository.update(gender);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}

