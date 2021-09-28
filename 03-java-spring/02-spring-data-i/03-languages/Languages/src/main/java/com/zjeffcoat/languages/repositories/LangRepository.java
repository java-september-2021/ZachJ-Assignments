package com.zjeffcoat.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zjeffcoat.languages.models.Language;

@Repository
public interface LangRepository extends CrudRepository<Language, Long> {
	List<Language>findAll();
}
