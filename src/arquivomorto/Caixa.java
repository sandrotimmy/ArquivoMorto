package arquivomorto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Caixa {

    @Id
    private Long Id;
    private String conteudoCaixa;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getConteudoCaixa() {
        return conteudoCaixa;
    }

    public void setConteudoCaixa(String conteudoCaixa) {
        this.conteudoCaixa = conteudoCaixa;
    }
}
