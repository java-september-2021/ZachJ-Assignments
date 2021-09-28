package com.zjeffcoat.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjeffcoat.languages.models.Language;
import com.zjeffcoat.languages.repositories.LangRepository;

@Service
public class LangService {
	@Autowired
	private LangRepository lRepo;
	
	public LangService(LangRepository repository) {
		this.lRepo = repository;
	}
	
	public List<Language> getAllLang() {
		return this.lRepo.findAll();
	}
	
	public Language getOneLang(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}

	public Language createLang(Language lang) {
		return this.lRepo.save(lang);
	}
	
	public Language editLang(Language lang) {
		return this.lRepo.save(lang);
	}
	
	public String deleteLang(Long id) {
		this.lRepo.deleteById(id);
		return "And another method was lost.";
	}
}
