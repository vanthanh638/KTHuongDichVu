package tv.thanh.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.LienHe;
import tv.thanh.service.LienHeService;

@RestController
@RequestMapping("lienhe")
public class LienHeController {
	@Autowired
	private LienHeService lienHeService;
	
	// get All
	@RequestMapping(value="/getall")
	public List<LienHe> getAll(){
		return (List<LienHe>) lienHeService.findAll();
	}
	
	// get by ID
	@RequestMapping("/{id}")
	public LienHe getById(@PathVariable("id") int id) {
		LienHe lienHe = lienHeService.findById(id);
		if (lienHe == null) {
			System.out.println("ID " + id + " not found");
		}
		return lienHe;
	}
	
	// add Item
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public LienHe add(@RequestBody LienHe lienHe) {
		System.out.println("Add: " + lienHe);
		lienHeService.save(lienHe);
		return lienHe;
	}
	
	// delete Item
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {
		LienHe obj = lienHeService.findById(id);
		if (obj == null){
			return;
		}
		lienHeService.delete(id);
		System.out.println("Delete id: " + id);
	}
	
	// update
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public LienHe update(@RequestBody LienHe lienHe) {
		LienHe obj = lienHeService.findById(lienHe.getId());
		if (obj != null) {
			System.out.println("Update id: " + lienHe.getId());
			lienHeService.save(lienHe);
			return lienHe;
		}
		System.out.println("Not exit id!");
		return lienHe;
	}
	
	

}
