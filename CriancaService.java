package SRC.Service;
import java.util.ArrayList;
import SRC.Model.Crianca;


public class CriancaService {

    private ArrayList<Crianca> lista = new ArrayList<>();
    private int contadorId = 1;

    public void cadastrar(Crianca c) {
        lista.add(c);
    }

    public ArrayList<Crianca> listar() {
        return lista;
    }

    public Crianca buscarPorId(int id) {
        for (Crianca c : lista) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public int gerarId() {
        return contadorId++;
    }
}