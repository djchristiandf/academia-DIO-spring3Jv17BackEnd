package dio.me.csb.academia.service.impl;

import dio.me.csb.academia.entity.Aluno;
import dio.me.csb.academia.entity.AvaliacaoFisica;
import dio.me.csb.academia.entity.dto.AvaliacaoFisicaDTO;
import dio.me.csb.academia.entity.dto.AvaliacaoFisicaUpdateDTO;
import dio.me.csb.academia.repository.AlunoRepository;
import dio.me.csb.academia.repository.AvaliacaoFisicaRepository;
import dio.me.csb.academia.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    /**
     * Cria uma Avaliação Física e salva no banco de dados.
     *
     * @param form - formulário referente aos dados para criação da Avaliação Física no banco de dados.
     * @return - Avaliação Física recém-criada.
     */
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    /**
     * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
     *
     * @param id - id da Avaliação Física que será exibida.
     * @return - Avaliação Física de acordo com o Id fornecido.
     */
    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    /**
     * Retorna todas as Avaliações Física que estão no banco de dados.
     *
     * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
     */
    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    /**
     * Atualiza a avaliação física.
     *
     * @param id         - id da Avaliação Física que será atualizada.
     * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
     *                   Física no banco de dados.
     * @return - Avaliação Física recém-atualizada.
     */
    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO formUpdate) {
        return null;
    }

    /**
     * Deleta uma Avaliação Física específica.
     *
     * @param id - id da Avaliação Física que será removida.
     */
    @Override
    public void delete(Long id) {

    }
}
