package app;

public class Particionador {
	private int esq;
    private int dir;
    private int pivot;
    private int i;
    private int[] valores;

    public Particionador(int esq, int dir, int[] valores) {
        this.esq = esq;
        this.dir = dir;
        this.pivot = valores[esq];
        this.valores = valores;
        this.i = esq;
    }
    
    public static Particionador getInstancia(int esq, int dir, int[] valores) {
		return new Particionador(esq, dir, valores);
	}

    public int trocaPivo() {
        swap(esq, i);
        return i;
    }

    public void analisa() {
        for (int j = i + 1; j <= dir; j++) {
            if (valores[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }
    }

    private void swap(int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }
}