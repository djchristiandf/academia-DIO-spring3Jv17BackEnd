package dio.me.csb.academia.service.impl;

import dio.me.csb.academia.entity.AvaliacaoFisica;
import dio.me.csb.academia.entity.dto.AvaliacaoFisicaDTO;
import dio.me.csb.academia.entity.dto.AvaliacaoFisicaUpdateDTO;
import dio.me.csb.academia.service.IAvaliacaoFisicaService;

import java.util.List;

public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    /**
     * Cria uma Avaliação Física e salva no banco de dados.
     *
     * @param form - formulário referente aos dados para criação da Avaliação Física no banco de dados.
     * @return - Avaliação Física recém-criada.
     */
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO form) {
        return null;
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
        return null;
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
