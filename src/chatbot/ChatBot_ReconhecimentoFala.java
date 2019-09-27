package chatbot;

import Try_Google_Speech_Recognition_Simple.RecFalaPtBrGoogle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.darkprograms.speech.recognizer.GoogleResponse;
import com.darkprograms.speech.synthesiser.SynthesiserV2;
import java.util.logging.Level;
import java.util.logging.Logger;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


/**
 * Arquivo do reconhecimento de fala.
 * @author Adejair Júnior
 */

public class ChatBot_ReconhecimentoFala extends RecFalaPtBrGoogle {

    public static void main(String[] args) {
        
        // Para ativar o debug da fala..
        boolean _debugEnabled = true;

        ChatBot_ReconhecimentoFala chatBot = new ChatBot_ReconhecimentoFala() {
            @Override
            public void resultado(String result) {
                if(_debugEnabled)
                    System.out.println("__[debug] Texto falado : " + result);
                
                
                switch(result.toLowerCase()) {
                    case "oi": {
                    try {
                        responder("Olá, tudo bem com você?");
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(ChatBot_ReconhecimentoFala.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        break;
                    }
                    
                    case "bem e você": {
                    try {
                        responder("Ótimo, também estou bem, obrigado por perguntar!");
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(ChatBot_ReconhecimentoFala.class.getName()).log(Level.SEVERE, null, ex);
                    }
                       break;
                    }
                    
                    case "nome": {
                    try {
                        responder("Olá, eu sou um NPC e me chamo adejajohnson!");
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(ChatBot_ReconhecimentoFala.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        break;
                    }
                    
                    case "parar": {
                    try {
                        responder("Foi ótimo conversar com você, até a próxima!");
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(ChatBot_ReconhecimentoFala.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        // Encerrar as atividades com o bot!
                        this.parar();
                    }
                    
                    default: {
                    try {
                        responder("Desculpa, não entendi");
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(ChatBot_ReconhecimentoFala.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        break;
                    }
                }
            }
            
            @Override
            public void onResponse(GoogleResponse paramGoogleResponse) {
                 throw new UnsupportedOperationException("response__ " + paramGoogleResponse);
            }
        };

        // Parametro verdadeiro é para mostrar a interface.
        chatBot.ini(false);
        chatBot.iniciar();
    }
    
    
    public static void responder(String text) throws JavaLayerException {
        SynthesiserV2 synthesiserV2 = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");
        synthesiserV2.setLanguage("pt-br");
        
        System.out.println("A linguagem utilizada pelo Sintetizador é: " + synthesiserV2.getLanguage());
        try {
            InputStream audio = synthesiserV2.getMP3Data(text);
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
    }
}
