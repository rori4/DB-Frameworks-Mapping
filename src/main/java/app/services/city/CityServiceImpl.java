package app.services.city;

import app.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityServiceImpl implements CityService {

	private final CityRepository cityRepository;

	@Autowired
	public CityServiceImpl(CityRepository cityRepository) { 
		this.cityRepository = cityRepository;
	}

}