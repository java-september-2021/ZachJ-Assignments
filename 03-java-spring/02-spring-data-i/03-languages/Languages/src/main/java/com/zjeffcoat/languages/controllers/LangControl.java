package com.zjeffcoat.languages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjeffcoat.languages.models.Language;
import com.zjeffcoat.languages.services.LangService;
@RestController
public class LangControl {
	@Autowired
	private LangService LangService;
	
	@GetMapping("/languages")
	public String dashboard() {
		return "dashboard.jsp";
	}
	
	@GetMapping("/languages/{id}")
	public String language(@PathVariable("id") Long id) {
		return "lang.jsp";
	}
	
	@GetMapping("languages/{id}/edit")
	public String editLanguage(@PathVariable("id") Long id) {
		return "edit.jsp";
	}
	
	@PostMapping("/languages")
	public Language process(Language lang) {
		return this.LangService.createLang(lang);
	}
	
	@PutMapping("/languages/{id}")
	public Language update(@PathVariable("id") Long id, Language lang) {
		return this.LangService.editLang(lang);
	}
	
	@DeleteMapping("/languages/{id}")
	public String delete(@PathVariable("id") Long id) {
		return this.LangService.deleteLang(id);
	}	
}