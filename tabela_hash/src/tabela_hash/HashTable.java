package tabela_hash;
import java.util.LinkedList;

public class HashTable {
    private int tamanho;
    private LinkedList<String>[] tabela;

    public HashTable(int m) {
        tamanho = m;
        tabela = new LinkedList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int hash(String str) {
        // Usando a função de hash h(k) = k mod 53
        int hashCode = str.hashCode();
        return Math.abs(hashCode % tamanho);
    }

    public void insere(String str) {
        int posicao = hash(str);
        tabela[posicao].add(str);
    }

    public boolean busca(String str) {
        int posicao = hash(str);
        return tabela[posicao].contains(str);
    }

    public void remove(String str) {
        int posicao = hash(str);
        tabela[posicao].remove(str);
    }
    
    public void imprimir() {
        System.out.println("Tabela Hash:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + ": ");
            for (String elemento : tabela[i]) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
    	// m = 1000/20 => 50, o tamanho da tabela deve ser um número primo para evitar colisões, logo m = 53. 
        HashTable tabelaHash = new HashTable(53);
        
        // inserindo elementos
        for (int i = 1; i <= 1000; i++) {
            String elemento = "Elemento" + i;
            tabelaHash.insere(elemento);
        }
        
        tabelaHash.imprimir();
        
        System.out.println("---------------------------------");
        
        // buscando elemento existente que seja o primeiro da lista
        System.out.println("buscando primeiro elemento da lista: " + tabelaHash.busca("Elemento71"));
        
        // buscando um elemento existente que seja o último da lista e não seja o primeiro
        System.out.println("buscando último elemento da lista que não seja o primeiro: " + tabelaHash.busca("Elemento938"));
        
        // buscando um elemento que nunca fo inserido
        System.out.println("buscando elemento que nunca foi inserido: " + tabelaHash.busca("Elemento1001"));
        
        //buscando elemento que foi inserido e removido
        //removendo elemento
        tabelaHash.remove("Elemento1");
        //buscando
        System.out.println("buscando elemento inserido que foi removido: " + tabelaHash.busca("Elemento1")); 
        
        System.out.println("---------------------------------");
        //removendo todos os elementos de uma posição da tabela e voltando a inserir 
        tabelaHash.remove("Elemento71");
        tabelaHash.remove("Elemento152");
        tabelaHash.remove("Elemento234");
        tabelaHash.remove("Elemento288");
        tabelaHash.remove("Elemento316");
        tabelaHash.remove("Elemento381");
        tabelaHash.remove("Elemento463");
        tabelaHash.remove("Elemento545");
        tabelaHash.remove("Elemento599");
        tabelaHash.remove("Elemento627");
        tabelaHash.remove("Elemento692");
        tabelaHash.remove("Elemento709");
        tabelaHash.remove("Elemento720");
        tabelaHash.remove("Elemento774");
        tabelaHash.remove("Elemento802");
        tabelaHash.remove("Elemento856");
        tabelaHash.remove("Elemento938");
        
        tabelaHash.imprimir();
        
        // voltando a inserir elementos novamente
        tabelaHash.insere("Elemento71");
        tabelaHash.insere("Elemento152");
        tabelaHash.insere("Elemento234");
        tabelaHash.insere("Elemento288");
        tabelaHash.insere("Elemento316");
        tabelaHash.insere("Elemento381");
        tabelaHash.insere("Elemento463");
        tabelaHash.insere("Elemento545");
        tabelaHash.insere("Elemento599");
        tabelaHash.insere("Elemento627");
        tabelaHash.insere("Elemento692");
        tabelaHash.insere("Elemento709");
        tabelaHash.insere("Elemento720");
        tabelaHash.insere("Elemento774");
        tabelaHash.insere("Elemento802");
        tabelaHash.insere("Elemento856");
        tabelaHash.insere("Elemento938");
        
        tabelaHash.imprimir();
    }
}
