package com.lucasraimundo.planets.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasraimundo.planets.dto.PlanetsDTO;
import com.lucasraimundo.planets.dto.PlanetsNewDTO;
import com.lucasraimundo.planets.model.Planets;
import com.lucasraimundo.planets.repository.PlanetsRepository;

@Service
public class PlanetsService {
	
	@Autowired
	private PlanetsRepository repo;
	
	public List<Planets> findAll(){
		return repo.findAll();
	}
	
	@Transactional
	public Planets insert(Planets obj) {
		obj.setId(null);
		obj = repo.save(obj);
		return obj;
	}
	
	public Planets fromDto(PlanetsNewDTO objDto) {
		Planets p = new Planets(null, objDto.getNome(), objDto.getEixo(), objDto.getDistanciaSol(), objDto.getPeriodoSideral(), objDto.getVelOrbital(), objDto.getExcentricidade(), objDto.getInclinacaoOrbita());
		return p;
	}
	
	public Planets find(Integer id) {
		Optional<Planets> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Planets.class.getName(), obj));
	}
	
	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
	
	public Planets update(Planets obj) {
		Planets newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Planets newObj, Planets obj) {
		newObj.setNome(obj.getNome());
		newObj.setEixo(obj.getEixo());	
		
	}
	

	public Planets fromDto(PlanetsDTO objDto) {
		return new Planets(objDto.getId(), objDto.getNome(), objDto.getEixo(),objDto.getDistanciaSol(), objDto.getPeriodoSideral(), objDto.getVelOrbital(), objDto.getExcentricidade(), objDto.getInclinacaoOrbita());
	}
	

}
