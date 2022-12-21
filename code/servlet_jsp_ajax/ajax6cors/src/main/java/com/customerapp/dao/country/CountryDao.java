package com.customerapp.dao.country;

import java.util.List;

public interface CountryDao {
    public List<Country> getAllCounties();
    public List<State> getStateByCountryId(int cid);
}
