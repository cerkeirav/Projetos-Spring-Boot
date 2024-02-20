package med.voll.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.consultas.DadosAgendamentoConsulta;
import med.voll.api.domain.consultas.DadosDetalhamentoConsulta;

@RestController
@RequestMapping("consultas")
public class ConsultaController {
	@PostMapping
	@Transactional
	public ResponseEntity agendar (@RequestBody @Valid DadosAgendamentoConsulta dados){
		System.out.println(dados);
		return ResponseEntity.ok(new DadosDetalhamentoConsulta(null, null, null, null));
	}
}