package trigyn.country.service.service;

import trigyn.country.service.Model.Country;

import java.util.List;

public interface CountryService {
    public List<Country> getAll();
    public Country getById(Integer id);
    public Country save(Country CustCountry);
    public void remove(Country CustCountry);
    public void remove(Integer id);



}
