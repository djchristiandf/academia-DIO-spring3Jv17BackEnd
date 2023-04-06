package dio.me.csb.academia.service.impl;

import dio.me.csb.academia.entity.Aluno;
import dio.me.csb.academia.entity.AvaliacaoFisica;
import dio.me.csb.academia.entity.dto.AlunoDTO;
import dio.me.csb.academia.entity.dto.AlunoUpdateDTO;
import dio.me.csb.academia.repository.AlunoRepository;
import dio.me.csb.academia.service.IAlunoService;
import dio.me.csb.academia.util.TimeDIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    /**
     * Cria um Aluno e salva no banco de dados.
     *
     * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
     * @return Aluno recém-criado.
     */
    @Override
    public Aluno create(AlunoDTO form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }

    /**
     * Retorna um Aluno que está no banco de dados de acordo com seu Id.
     *
     * @param id id do Aluno que será exibido.
     * @return Aluno de acordo com o Id fornecido.
     */
    @Override
    public Aluno get(Long id) {
        return null;
    }

    /**
     * Retorna os Alunos que estão no banco de dados.
     *
     * @param dataDeNascimento
     * @return Uma lista os Alunos que estão salvas no DB.
     */
    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        if(dataDeNascimento == null) {
            return alunoRepository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, TimeDIO.LOCAL_DATE_FORMATTER_PTBR);
            return alunoRepository.findByDataDeNascimento(localDate);
        }
    }

    /**
     * Atualiza o Aluno.
     *
     * @param id         id do Aluno que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
     *                   no banco de dados.
     * @return Aluno recém-atualizado.
     */
    @Override
    public Aluno update(Long id, AlunoUpdateDTO formUpdate) {
        return null;
    }

    /**
     * Deleta um Aluno específico.
     *
     * @param id id do Aluno que será removido.
     */
    @Override
    public void delete(Long id) {

    }

    /**
     * @param id id do aluno que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do aluno de acordo com o Id
     */
    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();

        return aluno.getAvaliacoes();
    }
}
