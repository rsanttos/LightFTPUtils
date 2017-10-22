package br.com.servico.mensagem;

public class MensagemServico {
	
	public MensagemServico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public byte[] insereFinal(byte[] inicio) {
		byte[] finalMensagem = new byte[5];		

		finalMensagem[0] = 'F';
		finalMensagem[1] = '1';
		finalMensagem[2] = 'N';
		finalMensagem[3] = '4';
		finalMensagem[4] = 'L';
		
		
		byte[] mensagemCompleta = concatenaArraysBytes(inicio, finalMensagem);
		
		System.out.println(inicio.length);
		System.out.println(finalMensagem.length);
		System.out.println(mensagemCompleta.length);
		
		return mensagemCompleta;
		
	}
	
	public byte[] concatenaArraysBytes(byte[] inicio, byte[] fim) {
		byte[] arrayCompleto = new byte[inicio.length + fim.length];
		
		for(int i = 0 ; i < inicio.length ; i++) {
			arrayCompleto[i] = inicio[i];
		}
		
		int i = inicio.length;
		for(int j = 0 ; j < fim.length ; j++, i++) {
			arrayCompleto[i] = fim[j];
		} 
		
		return arrayCompleto;
	}

	public boolean isFinalMensagem(byte[] bytes, int indice) {
		boolean fim = false;

		try {
			if (bytes[indice] == 'F' && bytes[indice + 1] == '1' && bytes[indice + 2] == 'N' && bytes[indice + 3] == '4'
					&& bytes[indice + 4] == 'L') {
				fim = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fim;
	}
}
