/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geradorcodigoautohotkey_planilhaparahistsigaa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Serac02
 */
public class CriarArquivo {

    private jan j;
    
    public CriarArquivo(jan j1){
    j=j1;
    }
    
    
    public void salvar(String content, String fileName, String curso, String turno){
    
    try {
			File file = new File("C://macros//"+turno+" - "+curso+"//"+fileName+".ahk");
 
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
                       // j.salvou(true);
			System.out.println("Salvou C://macros//"+turno+" - "+curso+"//"+fileName+".ahk");
 
		} catch (IOException e) {
                    //j.salvou(false);
                    System.out.println("Falha para C://macros//"+turno+" - "+curso+"//"+fileName+".ahk");
			e.printStackTrace();
		}
    
    
    
    }
    
    
}
