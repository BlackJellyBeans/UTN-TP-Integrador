import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class temaArchivos {

	public temaArchivos(){
        String archivo = "C:/Users/fabri/Documents/Resultados.txt";
        Path ruta;
        List <String> lineasArchivo = null;
        try {
            ruta = Paths.get(archivo);
            lineasArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String linea : lineasArchivo){
            System.out.println(linea);
        }

    }
	
}
