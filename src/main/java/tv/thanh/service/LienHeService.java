package tv.thanh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.LienHe;
import tv.thanh.repository.LienHeRepository;

@Service
public class LienHeService{

	@Autowired
	LienHeRepository lienHeRepository;
	
	public Iterable<LienHe> findAll(){
		return lienHeRepository.findAll();
	}
	
	public LienHe findById(int id) {
		return lienHeRepository.findOne(id);
	}
	
	public void save(LienHe obj) {
		lienHeRepository.save(obj);
	}
	
	public void delete(int id) {
		lienHeRepository.delete(id);
	}
}
