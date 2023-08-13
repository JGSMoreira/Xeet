
@Entity
@Table(name = "usuario")
@AttributeOverride(name = "id", column = @Column(name = "id_usuario", columnDefinition = "NUMBER(10)"))
public class Usuario extends EntityBase {
    
    @Column(name = "usuario_nome", length = 210)
    String username;

    @Column(name = "usuario_email", length = 210)
    String email;

    @Column(name = "usuario_senha", length = 210)
    String password;

    @Column(name = "usuario_pessoa_id")
    Pessoa pessoa;
}
