public class Pais implements Comparable<Pais>  {

    private String cod;
    private String nome;
    private int area;

    public Pais(String umCod, String umNome, int umaArea) {
        this.cod = umCod;
        this.nome = umNome;
        this.area = umaArea;

    }



    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public int getArea() {
        return area;
    }

    public String toString()
    {
        return nome + " ("+cod + ") area: " + area;
    }

    // a interface comparable só é bom para comparar por um atributo
    @Override
    public int compareTo(Pais outroPais) {
        return this.nome.compareTo(outroPais.nome);
    }

}
