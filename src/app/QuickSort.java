package app;

public class QuickSort {

	private int[] valores;

	private QuickSort(int[] valores) {
		this.valores = valores; 
	}

	public static QuickSort getInstancia(int[] valores) {
		return new QuickSort(valores);
	}

	public int getSize() {
		return valores.length;
	}

	public int[] ordenar(int esq, int dir) {
		if (esq < dir) {
			int indicePivot = particionamento(esq, dir);
			ordenar(esq, indicePivot -1);
			ordenar(indicePivot + 1, dir);
		}
		return valores;
	}

    public int particionamento(int esq, int dir) {
        Particionador particionador = new Particionador(esq, dir, valores);
        particionador.analisa();       
        return particionador.trocaPivo(); 
    }

}