package app.services.address;

import app.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

	private final AddressRepository addressRepository;

	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) { 
		this.addressRepository = addressRepository;
	}

}