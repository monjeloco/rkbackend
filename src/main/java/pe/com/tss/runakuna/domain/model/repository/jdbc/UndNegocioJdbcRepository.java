package pe.com.tss.runakuna.domain.model.repository.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.tss.runakuna.view.model.CargoViewModel;
import pe.com.tss.runakuna.view.model.UndNegocioViewModel;

@Repository
public class UndNegocioJdbcRepository implements UndNegocioRepository{

	private static final Logger LOGGER = LoggerFactory.getLogger(UndNegocioJdbcRepository.class);
	
	private final NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	UndNegocioJdbcRepository(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	private static final String SEARCH_ALL_UNDNEGOCIO = "select * from UnidadDeNegocio";
	private static final String SEARCH_ALL_CARGO = "select * from Cargo";
	
	@Override
	public List<UndNegocioViewModel> findUndNegocio() {
		List<UndNegocioViewModel> searchResults = jdbcTemplate.query(SEARCH_ALL_UNDNEGOCIO,
                new BeanPropertyRowMapper<>(UndNegocioViewModel.class)
        );
        LOGGER.info("Found {} undNegocio", searchResults.size());

        return searchResults;
	}

	@Override
	public List<CargoViewModel> findListCargos() {
		List<CargoViewModel> searchResults = jdbcTemplate.query(SEARCH_ALL_CARGO,
                new BeanPropertyRowMapper<>(CargoViewModel.class)
        );
        LOGGER.info("Found {} list Cargos", searchResults.size());

        return searchResults;
	}

}
