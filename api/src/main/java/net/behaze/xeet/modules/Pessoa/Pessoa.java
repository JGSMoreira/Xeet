
@Entity
@Table(name = "pessoa")
@AttributeOverride(name = "id", column = @Column(name = "id_pessoa", columnDefinition = "NUMBER(10)"))
public class Pessoa extends EntityBase {

    @Column(name = "pessoa_nome", length = 210)
    String nome;
    
    @Column(name = "pessoa_data_nascimento")
    Date dataNascimento;

    
    
}
