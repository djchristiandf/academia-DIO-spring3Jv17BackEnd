package dio.me.csb.academia.service.impl;

import dio.me.csb.academia.entity.Aluno;
import dio.me.csb.academia.entity.Matricula;
import dio.me.csb.academia.entity.dto.MatriculaDTO;
import dio.me.csb.academia.repository.AlunoRepository;
import dio.me.csb.academia.repository.MatriculaRepository;
import dio.me.csb.academia.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    /**
     * Cria uma Matrícula e salva no banco de dados.
     *
     * @param form - formulário referente aos dados para criação da Matrícula no banco de dados.
     * @return - Matrícula recém-criada.
     */
    @Override
    public Matricula create(MatriculaDTO form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    /**
     * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
     *
     * @param id - id da Matrícula que será exibida.
     * @return - Matrícula de acordo com o Id fornecido.
     */
    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    /**
     * Retorna todas as Matrículas que estão no banco de dados.
     *
     * @param bairro
     * @return - uma lista com todas as Matrículas que estão salvas no DB.
     */
    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }
    }

    /**
     * Deleta uma Matrícula específica.
     *
     * @param id - id da Matrícula que será removida.
     */
    @Override
    public void delete(Long id) {}
}
