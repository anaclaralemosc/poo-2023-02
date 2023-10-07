class Livro
{

  private String titulo;
  private String autor;
  private int ano;
  private String editora;

//metodo construtor
  public Livro (String titulo, String autor, int ano, String editora)
  {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.editora = editora;
  }



  private String getTitulo ()
  {
    return titulo;
  }

  private void setTitulo (String novoTitulo)
  {
    this.titulo = titulo;

  }

  private String getAutor ()
  {
    return autor;
  }

  private void setAutor (String novoAutor)
  {
    this.autor = autor;

  }

  private int getAno ()
  {
    return ano;
  }

  private void setAno (int novoAno)
  {
    this.ano = ano;

  }
  private String getEditora ()
  {
    return editora;
  }

  private void setEditora (String novoEditora)
  {
    this.editora = editora;

  }


  public String toString ()
  {
    return "Titulo: " + titulo + "\n Autor: " + autor + "\n Ano: " + ano +
      "\n Editora: " + editora;
  }

}
 public class TesteLivro {
    
    public static void main (String args[])
{
    //criando as instancias
    Livro livro1 = new Livro ("O cálice dos Deuses: SC)rie Percy Jackson e os olimpianos", "Rick Riordan", 2023, "Intriseca");
    Livro livro2 = new Livro ("Fahrenheit 451", "Ray Bradbury", 2012, "Biblioteca Azul");
    Livro livro3 = new Livro ("1984", "George Orwell", 2009, "Companhia das Letras");
    Livro livro4 = new Livro ("O conto da aia", "Margaret Atwood ", 2017,  "Rooco");

     //exibir instancias
    
    System.out.println("Livro 1: " + livro1);
    System.out.println("\nLivro 2: " + livro2);
    System.out.println("\nLivro 3: " + livro3);
    System.out.println("\nLivro 4: " + livro4);
}
}