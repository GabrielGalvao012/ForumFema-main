package br.edu.fema.forum.ForumFema.model.DTO;

import br.edu.fema.forum.ForumFema.model.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicosDTO {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;


    public TopicosDTO(Topico topico) {
        super();
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    public static List<TopicosDTO> converter(List<Topico> topicos){
        return topicos.stream().map(TopicosDTO::new).collect(Collectors.toList());
    }

}
