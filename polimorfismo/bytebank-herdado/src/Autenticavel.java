package src;

// contrato - o contrato se chama Autenticavel
// quem assinar esse contrato, precisa implementar os métodos dele
public abstract interface Autenticavel {

  public abstract void setSenha(int senha);

  public abstract boolean autenticar(int senha);
}
