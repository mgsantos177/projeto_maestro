package br.usjt.apivolei.maestro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.apivolei.maestro.model.bean.Torcedor;

@Repository
public interface TorcedorRepository extends JpaRepository<Torcedor, Long> {

	public Torcedor findOneByEmailAndSenha(String email, String senha); 
	
}