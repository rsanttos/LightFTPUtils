package br.com.servico.manipulaarquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Arquivo {

	public static File byteToFile(byte[] dadosArquivo, String caminhoArquivo) throws IOException {
		File arquivo = new File(caminhoArquivo);
		OutputStream os = new FileOutputStream(arquivo);
		os.write(dadosArquivo);
		os.flush();
		System.out.println("Arquivo " + caminhoArquivo + " armazenado com sucesso.");
		os.close();
		return arquivo;
	}
	

	public static byte[] fileToByte(File arquivo) {
		int len = (int) arquivo.length();
		byte[] sendBuf = new byte[len];
		FileInputStream inFile = null;
		try {
			inFile = new FileInputStream(arquivo);
			inFile.read(sendBuf, 0, len);
			inFile.close();
		} catch (FileNotFoundException fnfex) {
			fnfex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
		return sendBuf;
	}
	

	public static String listarArquivosDoDiretorio() {
		String caminhoCompleto = "arquivos";
		File diretorio = new File(caminhoCompleto);
		String listaArquivos = "";
		
		for(File arquivo : diretorio.listFiles()) {
			listaArquivos += arquivo.getName() + "\n";			
		}
		
		return listaArquivos;
	}
	
	public static int qtdArquivosDiretorio() {
		int quantidade = 0;
		String caminhoCompleto = "arquivos";
		File diretorio = new File(caminhoCompleto);
		quantidade = diretorio.listFiles().length;
		
		return quantidade;
	}
}
