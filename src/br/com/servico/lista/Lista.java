package br.com.servico.lista;

import java.util.List;

public class Lista {
	public static byte[] dinamicoParaEstatico(List<Byte> arrayDinamico) {
		byte[] arrayEstatico = new byte[arrayDinamico.size()];
		int i = 0;
		for(Byte b : arrayDinamico) {
			arrayEstatico[i] = b;
			i++;
		}
		
		return arrayEstatico;
	}
}
