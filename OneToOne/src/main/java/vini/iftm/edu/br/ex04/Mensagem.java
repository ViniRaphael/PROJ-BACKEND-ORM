package vini.iftm.edu.br.ex04;

import java.util.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;


@Entity
@Data
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String asunto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEnvio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mensagem_corpo_id")
    private MensagemCorpo mensagemCorpo;
}
