/**
 * 
 * 
 */
package chatbot;

// Biblioteca utilizada (do projeto) para fazer a sintetização da fala.
import com.darkprograms.speech.synthesiser.SynthesiserV2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

// Bibliotecas utilizadas para carregar o áudio .mp3
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * Sintetizador de fala com o Bot do Adejair.
 * @author Adejair Júnior
 */
public class ChatBot_SintetizadorFala {
    
    public static void main(String[] args) throws JavaLayerException {
        Scanner readScanner = new Scanner(System.in);

        SynthesiserV2 synthesiserV2 = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");
        synthesiserV2.setLanguage("pt-br");
        
        System.out.println("A linguagem utilizada pelo Sintetizador é: " + synthesiserV2.getLanguage());
        
        do {
            try {
                String input = readScanner.nextLine();
                
                InputStream audio = synthesiserV2.getMP3Data(callMyNpc(input));
                // converte este texto para um arquivo .mp3, na pasta raiz
                String soundFile = "./adejair_load_sound.mp3";
                FileOutputStream outStream=new FileOutputStream(soundFile);

                int read=0;
                byte []bytes = new byte[8192];

                // Salva o arquivo mp3.
                while((read=audio.read(bytes))!=-1){
                    outStream.write(bytes,0,read);
                }
                
            FileInputStream fileInputStream = new FileInputStream(soundFile);
            Player player = new Player(fileInputStream);
            player.play();

            } catch(IOException e) {
                System.out.println("Ocorreu um erro " + e);
            }    
        } while(true);
        
    }
    
    public static String callMyNpc(String pergunta) {
        String resposta;
        
        switch(pergunta.toLowerCase()) {
            case "oi": {
                resposta = "Oi, tudo bem? me chamo AdejairBOT, qual seu nome?";
                break;
            }
            
            case "o que vc come?": {
                resposta = "Eu me alimento de energia eletrica";
                break;
            }
            
            case "voce gosta de correr?": {
                resposta = "Eu sou apenas um bot, eu não tenho pernas, rs.";
                break;
            }
            
            default:
                resposta = "ops, desculpe, não entendi";
                break;
        }
        
        return resposta;
    }
   
}
