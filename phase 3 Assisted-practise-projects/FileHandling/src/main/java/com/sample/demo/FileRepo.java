package com.sample.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FileRepo extends JpaRepository<FileData, Integer> {
	public Optional<FileData> findByName(String filename);
}

