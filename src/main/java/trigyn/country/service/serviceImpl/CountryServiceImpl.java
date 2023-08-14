package trigyn.country.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trigyn.country.service.Model.Country;
import trigyn.country.service.repo.CountryRepo;
import trigyn.country.service.service.CountryService;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepo repo;
    @Override
    public List<Country> getAll() {
        return repo.findAll();
    }



    @Override
    public Country getById(Integer id) {

        Optional<Country> opt = repo.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }else
        {
            return null;
        }
    }



    @Override
    public Country save(Country todo) {

        return repo.save(todo);
    }



    @Override
    public void remove(Country todo) {
        repo.delete(todo);
    }
    @Override
    public void remove(Integer id) {
        repo.deleteById(id);
    }


}
