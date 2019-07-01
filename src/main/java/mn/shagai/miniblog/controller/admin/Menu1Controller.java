package mn.shagai.miniblog.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import mn.shagai.miniblog.domain.Menu1;
import mn.shagai.miniblog.model.Menu1Form;
import mn.shagai.miniblog.repository.MenuRepository;


@RestController
public class Menu1Controller {
	
	@Autowired
	private MenuRepository repo;	
		
	//Жагсаах	
	@GetMapping("/api/category/list")
	public Iterable<Menu1> list() {
		return repo.findAll();		
	}
		
	//Шинэ ангилал хадгалах
	@PostMapping("/api/category/save")	
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void save(Menu1Form form) {			
		Menu1 category = new Menu1();		
		category.setName1(form.getName1());
		category.setLink1(form.getLink1());
		category.setTarget1(form.getTarget1());
		category.setOrdering(form.getOrdering());
		
		repo.save(category);			
	}
	
	//Хуучин  засах
	@PostMapping("/api/category/update/{id}")	
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void update(Menu1Form form, @PathVariable Integer id) {			
		Menu1 category = repo.findById(id).get();		
		category.setName1(form.getName1());
		category.setLink1(form.getLink1());
		category.setTarget1(form.getTarget1());
		category.setOrdering(form.getOrdering());
				
		repo.save(category);			
	}
	
	//Нэг ангилал унших
	@GetMapping("/api/category/read/{id}")
	public Menu1 read(@PathVariable Integer id) {		
		return repo.findById(id).get();		
	}
	
	//Нэг ангилал устгах
	@PostMapping("/api/category/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {		
		repo.deleteById(id);		
	}
	
	
}











